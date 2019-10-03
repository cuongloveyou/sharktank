package SharkTank;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	public GUI() {
		this.setBounds(0, 0, 800, 600);
		setBackground(Color.BLACK);
		this.setLocationRelativeTo(null);

		JLabel lbBackground = new JLabel(""); // lb hinh nen
		lbBackground.setBounds(0, 0, 800, 600);
		ImageIcon icon = new ImageIcon();
		Image img = new ImageIcon(GUI.class.getResource("/images/TankHome.jpg")).getImage(); // lay anh nen
		img = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		lbBackground.setIcon(icon);

		JButton btnStart = new JButton("Start"); // button start game
		try {
			Image startImage = ImageIO.read(getClass().getResource("/images/btn_start0.png"));
			btnStart.setIcon(new ImageIcon(startImage));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		btnStart.setBounds(325, 330, 140, 33);
		btnStart.addMouseListener(new MouseAdapter() { // goi class tao giao dien game moi
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gameNew fNewGame = new gameNew();
				fNewGame.setVisible(true);
				setVisible(false);
			}
		});
		this.add(btnStart);

		JButton btnExit = new JButton("Exit"); // button thoat game
		try {
			Image exitImage = ImageIO.read(getClass().getResource("/images/btn_cancel0.png"));
			btnExit.setIcon(new ImageIcon(exitImage));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		btnExit.setBounds(325, 380, 140, 33);
		btnExit.addMouseListener(new MouseAdapter() { // out
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		this.add(btnExit);
		this.add(lbBackground);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
