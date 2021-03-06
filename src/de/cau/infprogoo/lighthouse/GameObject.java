package de.cau.infprogoo.lighthouse;

import java.awt.Color;

public abstract class GameObject {
	protected int x = 0;
	protected int y = 0;
	protected int w = 0;
	protected int h = 0;
	protected Color c = null;
	
	/**
	 * Creates a new GameObject.
	 * @param x x-position
	 * @param y y-position
	 * @param w width
	 * @param h height
	 * @param c color
	 */
	public GameObject(int x, int y, int w, int h, Color c) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.c = c;
	}
	/**
	 * Creates an empty GameObject.
	 */
	public GameObject() {
		this(0, 0, 0, 0, null);
	}
	
	public abstract void update();
}
