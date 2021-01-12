//it will contain the template of all the levels in our game  
//we will inherit this class to other levels and override or add additional method 
package game.level;

import game.Screen;
import game.level.tile.Tile;

public class Level {
	protected int width,height;
	protected int[] tiles;
	
	public Level() {}	
	public Level(int width, int height) {
		//this will help in random generation of the level 
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
		//these variables define the render region on the screen
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16)>>4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16)>>4;
		
		for(int y = y0; y < y1; y++) {
			for(int x = x0; x < x1; x++) {
				getTile(x,y).render(x, y, screen);		
				}
		}
	}
	
	public Tile getTile(int x, int y) {
		//this is in title class because every level will have tiles
		if(x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
		if(tiles[x+y*width]==0) return Tile.grass;
		return Tile.voidTile;
		}
	
}
