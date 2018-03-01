package de.cau.infprogoo.lighthouse;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
	
	// key codes for arrow keys
	public static final int KEY_ARROW_LEFT = 37;
	public static final int KEY_ARROW_RIGHT = 39;
	
	// directions for the paddle model (factor for speed)
	public static final int DIRECTION_LEFT = -1;
	public static final int DIRECTION_RIGHT = 1;
	public static final int DIRECTION_NONE = 0;
	
	// references
	private Model model;
	private Paddle paddle;
	private View[] views;
	
	public Controller(Model model, View[] views) {
		this.model = model;
		this.paddle = null;//model.getPaddle();
		this.views = views;
		for (int i = 0; i < views.length; i++) {
			
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KEY_ARROW_LEFT) { // left arrow
//			paddle.setDirection(DIRECTION_LEFT);
		}
		if (e.getKeyCode() == KEY_ARROW_RIGHT) { // right arrow
//			paddle.setDirection(DIRECTION_RIGHT);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KEY_ARROW_LEFT) { // left arrow
//			paddle.setDirection(DIRECTION_NONE);
		}
		if (e.getKeyCode() == KEY_ARROW_RIGHT) { // right arrow
//			paddle.setDirection(DIRECTION_NONE);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// here be dragons
	}
	
}
