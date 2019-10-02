package SharkTank;

import java.awt.Graphics2D;
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
	public void draw(Graphics2D graphics2d) {
		graphics2d.drawImage(image, x, y, size, size, null);
	}
}
