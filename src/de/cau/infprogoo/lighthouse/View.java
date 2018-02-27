package de.cau.infprogoo.lighthouse;

public abstract class View {
	/**
	 * Reference to the game model.
	 */
	private Model model;
	
	/**
	 * Renders the model data.
	 * Gets called when the model is updated.
	 */
	public abstract void render();
	
	/**
	 * Constructor for the view.
	 * @param model
	 * 			The game model.
	 */
	public View(Model model) {
		this.model = model;
	}
}
