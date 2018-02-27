package de.cau.infprogoo.lighthouse;

public class Model {
	private View[] views;
	// ball, bricks, paddle
	public Model(View[] views) {
		this.views = views;
	}
	public void notifyViews() {
		for (int i = 0; i < views.length; i++) {
			views[i].render();
		}
	}
}
