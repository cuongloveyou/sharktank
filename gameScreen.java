package SharkTank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class gameScreen extends JPanel {
	ArrayList<Item>items;
	public gameScreen(ArrayList<Item>items) {
		setBounds(0, 0, 600, 600);
		setBackground(Color.BLACK);
		this.items = items;
	}
	@Override
	 public void paintComponent(Graphics g) {
		 
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        for (Item item : items) {
				g.drawImage(item.image, item.x, item.y, item.size, item.size, null);
			}
	    }
}
