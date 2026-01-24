package com.tree.AVLtree.gamingapp;

public class PlayerNode {
	
	    int playerId;
	    int score;
	    int height;
	    
	    PlayerNode left, right;

	    PlayerNode(int id, int score) {
	        this.playerId = id;
	        this.score = score;
	        height = 1;
	    }
}
