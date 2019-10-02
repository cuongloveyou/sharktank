package SharkTank;

import java.awt.Image;

import javax.swing.ImageIcon;

public class imageGame {
	public int id;
	public Image image;

	public imageGame() {
	}

	public Image getImage(int id) {
		switch (id) {
		case 0: // water
			return new ImageIcon(imageGame.class.getResource("/images/water.png")).getImage();
		case 1: // floor
			break;			
		case 2: // tree
			return new ImageIcon(imageGame.class.getResource("/images/tree.png")).getImage();
		case 3: // brick
			return new ImageIcon(imageGame.class.getResource("/images/brick.png")).getImage();
		case 4: // stone
			return new ImageIcon(imageGame.class.getResource("/images/rock.png")).getImage();
		default:
			break;
		}
		return null;

	}
}
