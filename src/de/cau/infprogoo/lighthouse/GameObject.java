package de.cau.infprogoo.lighthouse;

import java.awt.Color;

public abstract class GameObject {
	private double x = 0;
	private double y = 0;
	private double w = 0;
	private double h = 0;
	private Color c = null;
	
	/**
	 * Creates a new GameObject.
	 * @param x x-position
	 * @param y y-position
	 * @param w width
	 * @param h height
	 * @param c color
	 */
	public GameObject(double x, double y, double w, double h, Color c) {
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
	
	public abstract void update(double x, double y, double w, double h, Color c);
}
