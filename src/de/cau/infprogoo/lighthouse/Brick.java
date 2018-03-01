package de.cau.infprogoo.lighthouse;

import java.awt.Color;

public class Brick extends GameObject {
	
	boolean destroyed = false;
	
	@Override
	public void update(int x, int y, int w, int h, Color c) {
		// TODO Auto-generated method stub
		
	}

	boolean isDestroyed() {
		return destroyed;
	}

}
