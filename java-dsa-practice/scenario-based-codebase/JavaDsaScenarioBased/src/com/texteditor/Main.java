package com.texteditor;

public class Main {

	public static void main(String[] args) {
		
		TextEditor editor = new TextEditor();
		editor.insert("Helll1o1");
		editor.insert("Soum1y1a1auiihfhaeosdlighxvdijfl.gvui");
		editor.show();
		editor.delete(12);
		
		editor.show();
		editor.undo();
		editor.show();
		editor.redo();
	}

}
