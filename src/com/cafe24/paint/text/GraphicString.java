package com.cafe24.paint.text;

import com.cafe24.paint.i.Drawable;

public class GraphicString implements Drawable {
	private String text;
	
	public GraphicString(String text) {
		this.text = text;
	}

	@Override
	public void draw() {
		System.out.printf("%s을 그렸습니다.\n", text);
	}
}
