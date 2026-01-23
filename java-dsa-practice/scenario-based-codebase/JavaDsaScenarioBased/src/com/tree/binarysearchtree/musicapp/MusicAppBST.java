package com.tree.binarysearchtree.musicapp;

public class MusicAppBST {

	    // INSERT new track (BST based on song title)
	    public static SongNode insert(SongNode root, int trackId, String title, String artist) {
	        if (root == null)
	            return new SongNode(trackId, title, artist);

	        if (title.compareToIgnoreCase(root.title) < 0)
	            root.left = insert(root.left, trackId, title, artist);
	        else
	            root.right = insert(root.right, trackId, title, artist);

	        return root;
	    }

	    // SEARCH track by Track ID (DFS traversal)
	    public static SongNode searchByTrackId(SongNode root, int trackId) {
	        if (root == null) return null;

	        if (root.trackId == trackId)
	            return root;

	        SongNode leftResult = searchByTrackId(root.left, trackId);
	        if (leftResult != null)
	            return leftResult;

	        return searchByTrackId(root.right, trackId);
	    }

	    public static void inorder(SongNode root) {
	        if (root == null) return;

	        inorder(root.left);
	        System.out.println( root.title +
	                " | Track ID: " + root.trackId +
	                " | Artist: " + root.artist);
	        inorder(root.right);
	    }

	    // MAIN method
	    public static void main(String[] args) {
	        SongNode root = null;

	        root = insert(root, 301, "Unstoppable", "Ed Sheeran");
	        root = insert(root, 205, "Believer", "Imagine Dragons");
	        root = insert(root, 412, "Closer", "Chainsmokers");
	        root = insert(root, 118, "Attention", "Charlie Puth");
	        root = insert(root, 350, "Perfect", "Ed Sheeran");

	        System.out.println(" Playlist (Alphabetical Order):");
	        inorder(root);

	        System.out.println("\n Searching for Track ID 412:");
	        SongNode song = searchByTrackId(root, 412);
	        if (song != null) {
	            System.out.println("Found → " + song.title +
	                    " by " + song.artist);
	        } else {
	            System.out.println("Track not found");
	        }
	    }
	}
