package de.cau.infprogoo.lighthouse;

import java.awt.Color;

public class Ball extends GameObject {

	private int ix, iy;
	private int size;
	
	public Ball(int x, int y, int size) {
		super(x, y, size, size, new Color(200, 200, 200));
		this.size = size;
	}

	@Override
	public void update() {
		x += 1;
	}

}
