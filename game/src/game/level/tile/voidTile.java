//this will render tile thet shoudnt exist
package game.level.tile;

import game.Screen;
import game.Sprite;

public class voidTile extends Tile {

	public voidTile(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	public void render(int x, int y , Screen screen) {
		screen.renderTile(x<<4, y<<4, this);
	}

}
