package game;

public class Sprite {
		
	public final int SIZE;
	
	private int x,y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16,0,0,SpriteSheet.tiles);//size is 16 the 0 0 is the stating point in the thei the tiles
	public static Sprite voidSprite = new Sprite(16,0x1B87E0);//size is 16 color is black
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
	this.SIZE = size;
	pixels = new int[SIZE * SIZE];
	this.x = x * size;
	this.y = y * size;
	this.sheet = sheet;
	load();
			
	}
	public Sprite(int size, int colour) {
		SIZE = size;
		pixels = new int[size*size]; 
		setColour(colour);
	}
	private void setColour(int colour) {
		for(int i = 0; i< SIZE*SIZE ; i++) {
			pixels[i] = colour;
		}
		
	}
	public void load() {
		for(int y = 0; y < SIZE; y++) {
			for(int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x+this.x)+(y+this.y)*sheet.SIZE];
				}
			}
		}
		
		
}

