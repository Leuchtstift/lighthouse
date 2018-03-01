package de.cau.infprogoo.lighthouse;

public class Model {
	
	private static final int N_BRICKS = 10;
	private Paddle paddle;
	private Ball ball;
	private Brick[] bricks;
	
	private View[] views;
	
	// ball, bricks, paddle
	
	public Model(View[] views) {
		// TODO: edit constructor params
		this.views = views;
		this.paddle = new Paddle();
		this.ball = new Ball();
		this.bricks = new Brick[N_BRICKS];
		for (int i = 0; i < bricks.length; i++) {
			bricks[i] = new Brick();
		}
	}
	
	public void update() {
		// TODO: edit update params
//		paddle.update();
//		ball.update();
//		for (int i = 0; i < bricks.length; i++) {
//			bricks[i].update();
//		}
	}
	
	public void notifyViews() {
		for (int i = 0; i < views.length; i++) {
			views[i].render();
		}
	}
	
	// getters
	
	public Paddle getPaddle() {
		return paddle;
	}

	public Ball getBall() {
		return ball;
	}

	public Brick[] getBricks() {
		return bricks;
	}
}
