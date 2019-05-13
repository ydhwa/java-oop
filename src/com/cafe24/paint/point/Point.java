package com.cafe24.paint.point;

import com.cafe24.paint.i.Drawable;

public class Point implements Drawable {
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.printf("점(%d, %d)에 점을 찍었습니다.\n", x, y);
	}
	
	public void draw(boolean visible) {
		if(visible) {
			show();
		} else {
			System.out.printf("점(%d, %d)에 점을 지웠습니다.\n", x, y);
		}
	}

	@Override
	public void draw() {
		show();
	}
}
