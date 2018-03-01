package de.cau.infprogoo.lighthouse;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DesktopViewSwing extends View {
	
	public static void main(String[] args) {
		View v = new DesktopViewSwing(null);
		while(true) {
			v.render();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public static final int SCALE = 20; // pixels per tile
	
	public static final Color BALL_COLOR = Color.BLACK;
	public static final Color PADDLE_COLOR = Color.BLACK;
	public static final Color BRICK_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;
	
	private JFrame display;
	private Canvas canvas;
	
	public DesktopViewSwing(Model model) {
		super(model);
		
		// init display
		display = new JFrame("Breakout");
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setSize(WIDTH, HEIGHT);
		display.setVisible(true);
		
		// init canvas
		canvas = new DesktopViewCanvas();
		display.add(canvas);
	}

	@Override
	public void render() {
		canvas.repaint();
	}
	
	@Override
	public void addController(Controller c) {
		display.addKeyListener(c);
	}
	
	class DesktopViewCanvas extends Canvas {
		public DesktopViewCanvas() {
			setSize(WIDTH, HEIGHT);
			setBackground(Color.GRAY);
		}
		@Override
		public void paint(Graphics g) {
			// render background
			g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
			
			// render ball
			Ball b = model.getBall();
			g.fillRect(b.getX() * SCALE, b.getY() * SCALE, b.getW() * SCALE, b.getH() * SCALE);
			
			// render paddle
			Paddle p = model.getPaddle();
			g.fillRect(p.getX() * SCALE, p.getY() * SCALE, p.getW() * SCALE, p.getH() * SCALE);
			
			// render bricks
			Brick[] bricks = model.getBricks();
			for (int i = 0; i < bricks.length; i++) {
				boolean isDestroyed = model.getBricks()[i].isDestroyed();
				if (!isDestroyed) {
					g.fillRect(bricks[i].getX() * SCALE, bricks[i].getY() * SCALE, bricks[i].getW() * SCALE, bricks[i].getH() * SCALE);
				}
			}
		}
	}
}
