package SharkTank;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bullet extends Item {
	public int dame, direction;
	Image image;
	public Bullet(int id, int x, int y, int size, int dame, int direction, Image image) {
		super(id, x, y, size, image);
		this.dame = dame;
		this.direction = direction;
		this.image = new ImageIcon(Bullet.class.getResource("/images/bullet.png")).getImage();
	}
	
	public void Move(int direction) {
		switch(direction) {
		case (1) :
			y -= 2;
		case (2) :
			x += 2;
		case (3) :
			y += 2;
		case (4) :
			x -= 2;
		}
	}
}
