package Item;

public class Bullet extends Item {
	public int dame, direction;
	
	public Bullet(int x, int y, int size, int id, int dame, int direction) {
		super(x, y, size, id);
		this.dame = dame;
		this.direction = direction;
	}
	
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
}
