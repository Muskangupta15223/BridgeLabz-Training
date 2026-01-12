package com.texteditor;

import java.util.*;
public class TextEditor {

	String text= " ";
	private Stack<String> undostack = new Stack<>();
	private Stack<String> redostack = new Stack<>();	
	
	public void insert(String newtext) {
		undostack.push(newtext);
		text += newtext;
		redostack.clear();	
	}
	
	public void delete(int n) {
		if(text.length() == 0) {
			return;
		}
		int len = Math.max(0, text.length() - n);
		text = text.substring(0,len);
		redostack.clear();
	}
	
	public void undo() {
		if(undostack.isEmpty()) {
			System.out.println("Nothing is here for undo");
		}
		redostack.push(text);
				text = undostack.pop();
	}
	
	public void redo() {
		if(redostack.isEmpty()) {
			System.out.println("Nothing is here for redo");
		}
		undostack.push(text);
				text= redostack.pop();
	}
	 public void show() {
	        System.out.println("Text: " + text);
	    }
}
