package de.cau.infprogoo.lighthouse;

public abstract class View {
	/**
	 * Reference to the game model.
	 */
	protected Model model;
	
	/**
	 * Renders the model data.
	 * Gets called when the model is updated.
	 */
	public abstract void render();
	
	public abstract void addController(Controller c);
	/**
	 * Constructor for the view.
	 * @param model
	 * 			The game model.
	 */
	public View(Model model) {
		this.model = model;
	}
	
	
}
