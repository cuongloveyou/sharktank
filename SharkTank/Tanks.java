package SharkTank;


import java.awt.Image;
import java.awt.Rectangle;

public class Tanks extends Item {
	public int heart, dame, direction, armor;
	boolean rocket;
	Image image;
	//contruct function
	public Tanks(int id, int x, int y, int size, Image image, int heart, int dame, int direction, int armor, boolean rocket) {
		super(id, x, y, size, image);
		this.heart = heart;
		this.armor = armor;
		this.dame = dame;
		this.direction = direction;
		this.rocket = rocket;
	}
	
	// phuong thuc di chuyen
	public void Move(int direction) {
		switch(direction) {
		case (1) :
			y -= 1;
		case (2) :
			x += 1;
		case (3) :
			y += 1;
		case (4) :
			x -= 1;
		}
	}
	
	// phuong thuc tru mau khi bi tan cong
	public void BeAttacked(int dame) {
		heart -= (dame - armor);
		if (heart <= 0) {
			//di toi ham ket thuc game;;;;
		}
	}
	
	// phuong thuc buff dame
	public void BuffDame() {
		dame += 5;
	}
	
	// phuong thuc buff armor
	public void BuffArmor() {
		armor += 5;
	}
	
	// phuong thuc buff heart
	public void BuffHeart() {
		heart += 5;
	}
	public Rectangle getBound() {
		return new Rectangle(x, y, size,size);
	}
}
