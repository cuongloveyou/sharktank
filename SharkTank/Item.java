package SharkTank;

import java.awt.Image;

public class Item {
	public int x, y, id;
	public int size;
	public Image image;
	public Item(int id, int x, int y, int size, Image image) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.size = size;
		this.image = image;
	}
}
