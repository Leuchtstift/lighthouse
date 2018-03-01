package de.cau.infprogoo.lighthouse;

import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class DesktopViewACM extends View {

	public static final Color BALL_COLOR = Color.BLACK;
	public static final Color PADDLE_COLOR = Color.BLACK;
	public static final Color BRICK_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;

	private GraphicsProgram display;
	private GRect gball;
	private GRect gpaddle;
	private GRect[] gbricks;

	public DesktopViewACM(Model model) {
		super(model);
		// init display
		display = new GraphicsProgram() {
		};
		display.start();

		// init ball
		gball = new GRect(model.getBall().getX(), model.getBall().getY(), model.getBall().getW(),
				model.getBall().getH());
		gball.setFilled(true);
		gball.setFillColor(BALL_COLOR);
		display.add(gball);
		// init paddle
		gpaddle = new GRect(model.getPaddle().getX(), model.getPaddle().getY(), model.getPaddle().getW(),
				model.getPaddle().getH());
		gpaddle.setFilled(true);
		gpaddle.setFillColor(PADDLE_COLOR);
		display.add(gpaddle);
		// init bricks
		gbricks = new GRect[model.getBricks().length];
		for (int i = 0; i < gbricks.length; i++) {
			gbricks[i] = new GRect(model.getBricks()[i].getX(), model.getBricks()[i].getY(),
					model.getBricks()[i].getW(), model.getBricks()[i].getH());
		}
	}

	@Override
	public void render() {

		// render ball
		gball.setLocation(model.getBall().getX(), model.getBall().getY());

		// render paddle
		gpaddle.setLocation(model.getPaddle().getX(), model.getPaddle().getY());

		// render bricks
		for (int i = 0; i < gbricks.length; i++) {
			if (model.getBricks()[i].isDestroyed()) {
				gbricks[i].setColor(BACKGROUND_COLOR);
				gbricks[i].setFillColor(BACKGROUND_COLOR);
			} else {
				gbricks[i].setColor(BRICK_COLOR);
				gbricks[i].setFillColor(BRICK_COLOR);
			}
		}
	}

	@Override
	public void addController(Controller c) {
		display.addKeyListener(c);
	}
}
