package com.tree.AVLtree.gamingapp;

public class GamingApp {

	    private PlayerNode root;
	    private int count = 0;

	    // Height
	    private int height(PlayerNode node) {
	        return node == null ? 0 : node.height;
	    }

	    // Balance Factor
	    private int getBalance(PlayerNode node) {
	        return node == null ? 0 : height(node.left) - height(node.right);
	    }

	    // Right Rotation (LL case)
	    private PlayerNode rotateRight(PlayerNode y) {
	        PlayerNode x = y.left;
	        PlayerNode T2 = x.right;

	        x.right = y;
	        y.left = T2;

	        y.height = Math.max(height(y.left), height(y.right)) + 1;
	        x.height = Math.max(height(x.left), height(x.right)) + 1;

	        return x;
	    }

	    // Left Rotation (RR case)
	    private PlayerNode rotateLeft(PlayerNode x) {
	        PlayerNode y = x.right;
	        PlayerNode T2 = y.left;

	        y.left = x;
	        x.right = T2;

	        x.height = Math.max(height(x.left), height(x.right)) + 1;
	        y.height = Math.max(height(y.left), height(y.right)) + 1;

	        return y;
	    }

	    // Insert / Update Player
	    private PlayerNode insert(PlayerNode node, int id, int score) {

	        if (node == null)
	            return new PlayerNode(id, score);

	        if (score < node.score)
	            node.left = insert(node.left, id, score);
	        else if (score > node.score)
	            node.right = insert(node.right, id, score);
	        else {
	            node.playerId = id; // update
	            return node;
	        }

	        node.height = 1 + Math.max(height(node.left), height(node.right));
	        int balance = getBalance(node);

	        // LL
	        if (balance > 1 && score < node.left.score)
	            return rotateRight(node);

	        // RR
	        if (balance < -1 && score > node.right.score)
	            return rotateLeft(node);

	        // LR
	        if (balance > 1 && score > node.left.score) {
	            node.left = rotateLeft(node.left);
	            return rotateRight(node);
	        }

	        // RL
	        if (balance < -1 && score < node.right.score) {
	            node.right = rotateRight(node.right);
	            return rotateLeft(node);
	        }

	        return node;
	    }

	    // Public Insert
	    public void addOrUpdatePlayer(int id, int score) {
	        root = insert(root, id, score);
	    }

	    // Find Minimum
	    private PlayerNode minValueNode(PlayerNode node) {
	        while (node.left != null)
	            node = node.left;
	        return node;
	    }

	    // Delete Player
	    private PlayerNode delete(PlayerNode node, int score) {

	        if (node == null)
	            return null;

	        if (score < node.score)
	            node.left = delete(node.left, score);
	        else if (score > node.score)
	            node.right = delete(node.right, score);
	        else {
	            if (node.left == null || node.right == null)
	                node = (node.left != null) ? node.left : node.right;
	            else {
	                PlayerNode temp = minValueNode(node.right);
	                node.score = temp.score;
	                node.playerId = temp.playerId;
	                node.right = delete(node.right, temp.score);
	            }
	        }

	        if (node == null)
	            return null;

	        node.height = Math.max(height(node.left), height(node.right)) + 1;
	        int balance = getBalance(node);

	        // LL
	        if (balance > 1 && getBalance(node.left) >= 0)
	            return rotateRight(node);

	        // LR
	        if (balance > 1 && getBalance(node.left) < 0) {
	            node.left = rotateLeft(node.left);
	            return rotateRight(node);
	        }

	        // RR
	        if (balance < -1 && getBalance(node.right) <= 0)
	            return rotateLeft(node);

	        // RL
	        if (balance < -1 && getBalance(node.right) > 0) {
	            node.right = rotateRight(node.right);
	            return rotateLeft(node);
	        }

	        return node;
	    }

	    // Public Remove
	    public void removePlayer(int score) {
	        root = delete(root, score);
	    }

	    // Top Players 
	    public void showTopPlayers() {
	        count = 0;
	        showTopPlayers(root);
	    }

	    private void showTopPlayers(PlayerNode node) {
	        if (node == null || count >= 10)
	            return;

	        showTopPlayers(node.right);

	        if (count < 10) {
	            System.out.println("PlayerID: " + node.playerId + " | Score: " + node.score);
	            count++;
	        }

	        showTopPlayers(node.left);
	    }

	    // MAIN
	    public static void main(String[] args) {

	    	GamingApp board = new GamingApp();

	        board.addOrUpdatePlayer(1, 1200);
	        board.addOrUpdatePlayer(2, 1800);
	        board.addOrUpdatePlayer(3, 900);
	        board.addOrUpdatePlayer(4, 1500);
	        board.addOrUpdatePlayer(5, 2000);

	        System.out.println(" TOP PLAYERS");
	        board.showTopPlayers();

	        System.out.println("\n Removing score 1500");
	        board.removePlayer(1500);

	        System.out.println("\n UPDATED LEADERBOARD");
	        board.showTopPlayers();
	    }
	}
