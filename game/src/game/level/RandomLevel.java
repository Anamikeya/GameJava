//to generate random level 
package game.level;

import java.util.Random;

public class RandomLevel extends Level{
	
	private final Random random = new Random();
	
	public RandomLevel(int height, int width) {
		super(width, height);
	}
	protected void generateLevel() {
		//whatever we run here will run in the level method Level.generateLevel
		for(int y= 0; y<height; y++) {
			for(int x = 0; x<width ; x++ ) {
				tiles[x+y*width] = random.nextInt(3);  
				//we can do it in one for loop also by giving the range to tiles.length() 
				//but its not good for advance because we might need to access every tile in advance topics
			}
		}
	}
}
