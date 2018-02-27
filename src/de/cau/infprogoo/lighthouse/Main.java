package de.cau.infprogoo.lighthouse;

public class Main {
	Model model;
	View desktop;
	View lighthouse;

	public static void main(String[] args) {
		new Main().init();
	}

	public void init() {
		// init model, view, controller
		View[] views = new View[2];
		views[0] = new DesktopView(model);
		views[1] = new LighthouseView(model);
		Model gameModel = new Model(views);
	}

}
