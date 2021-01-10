//this is basic template of tile we will inherit this in all the subclasses of the tiles

package game.level.tile;

import game.Screen;
import game.Sprite;

public class Tile {
	public int x,y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public Tile(Sprite sprite) {
		this.sprite =sprite;
		
		// TODO Auto-generated constructor stub
	}
	 public void render(int x, int y , Screen screen) {
		 //this puts the stuffs on the screen but this is just a template we will 
		 //inherit this method in subclasses of tiles
		 
		 
	 }
	 public boolean solid() {
		 //this will tell if the sprite is collidable or not 
		 //we will keep it default false because all the objects are not collidabel
		 return false;
	 }
}
