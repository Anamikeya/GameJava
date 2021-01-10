//it will contain the template of all the levels in our game  
//we will inherit this class to other levels and override or add additional method 
package game.level;

import game.Screen;

public class Level {
	protected int width,height;
	protected int[] tiles;
	
	public Level() {}	
	public Level(int width, int height) {
		//thie will help in random generation of the level 
		this.width = width;
		this.height = height;
		tiles = new int[width*height];
		
		generateLevel();
		
	}
	public Level(String Path){
		//will load level from a path
		loadLevel(Path);
		
	}
	protected void generateLevel() {
		//this method will generate levels
		
	}
	
	private void loadLevel(String path) {
		//this will read the width and height
	}
	public void update() {
		//update like AI and entities to update that will happen 60 frames per second
	}
	private void time() {
		//this will create day night cycles in the level and will manage the time nicely 
	}
	public void render(int xScroll, int yScroll, Screen screen) {
		//it will render the level 
	}
}
