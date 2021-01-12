package game.level.tile;

import game.Screen;
import game.Sprite;

public class GrassTile extends Tile{

	public GrassTile(Sprite sprite) {
		// TODO Auto-generated constructor stub
		super(sprite);
	}
	public void render(int x,  int y, Screen screen) {
		//we override the function
		screen.renderTile(x << 4, y << 4, this);
		
	}

}
