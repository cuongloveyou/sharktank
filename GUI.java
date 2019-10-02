package SharkTank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
	public GUI() {
		this.setBounds(0, 0, 800, 600);
		setBackground(Color.BLACK);
		this.setLocationRelativeTo(null);
		JPanel logPanel = new JPanel();
		logPanel = new JPanel();
		logPanel.setBounds(0, 0, 800, 600);
		logPanel.setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 800, 600);
		ImageIcon icon = new ImageIcon();
		Image img=new ImageIcon(GUI.class
				.getResource("/images/TankHome.jpg"))
				.getImage();
		img=img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		icon=new ImageIcon(img);
		
		JButton btnStart = new JButton("Start");
		btnStart.setIcon(new ImageIcon("D:\\Programs\\Eclipse\\workspace\\SharkTank\\src\\images\\btn_start0.png"));
		btnStart.setBounds(325, 330, 140, 33);
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gameNew fNewGame = new gameNew();
				fNewGame.setVisible(true);
				setVisible(false);
			}
		});
		this.add(btnStart);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setIcon(new ImageIcon("D:\\Programs\\Eclipse\\workspace\\SharkTank\\src\\images\\btn_cancel0.png"));
		btnExit.setBounds(325, 380, 140, 33);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		this.add(btnExit);
		lblNewLabel.setIcon(icon);
		this.add(lblNewLabel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
