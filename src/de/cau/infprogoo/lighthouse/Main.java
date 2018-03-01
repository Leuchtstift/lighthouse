package de.cau.infprogoo.lighthouse;

public class Main {
	
	Model model;
	View desktop;
	View lighthouse;
	Controller keyboard;

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		// init model, view, controller
		View[] views = new View[2];
		views[0] = new DesktopViewSwing(model); // views know model
		views[1] = new LighthouseView(model);
		
		model = new Model(views); // model knows views
		
		keyboard = new Controller(model, views); // controller knows model and views
	}
	
	public void gameLoop() {
		// TODO: Timestep
		while(true) {
			model.update();
		}
	}

}
