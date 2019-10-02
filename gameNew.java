package SharkTank;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class gameNew extends JFrame {
	JPanel p;
	ArrayList<Item> items = new ArrayList<Item>();
	imageGame imageGame = new imageGame();
	Graphics2D graphics2d;
	AffineTransform at;

	public gameNew() {
		createDisplay();
		createComponent();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void createComponent() {
		this.setBounds(0, 0, 800, 640);
		this.setLayout(null);
		this.setLocationRelativeTo(null);

		
		//this.add(pnMain);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(610, 0, 164, 100);
		this.add(panel);
		panel.setLayout(null);

		JTextPane txtpnPl = new JTextPane();
		txtpnPl.setEditable(false);
		txtpnPl.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnPl.setText("Player 1");
		txtpnPl.setBounds(10, 11, 61, 20);
		panel.add(txtpnPl);

		JTextPane txtpnD = new JTextPane();
		txtpnD.setEditable(false);
		txtpnD.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnD.setText("Dame");
		txtpnD.setBounds(10, 33, 61, 20);
		panel.add(txtpnD);

		JTextPane txtpnArm = new JTextPane();
		txtpnArm.setEditable(false);
		txtpnArm.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnArm.setText("Armor");
		txtpnArm.setBounds(10, 53, 61, 20);
		panel.add(txtpnArm);

		JTextPane txtpnR = new JTextPane();
		txtpnR.setEditable(false);
		txtpnR.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnR.setText("Rocket");
		txtpnR.setBounds(10, 72, 61, 20);
		panel.add(txtpnR);

		JTextPane txtpnPlayer1 = new JTextPane();
		txtpnPlayer1.setEditable(false);
		txtpnPlayer1.setBounds(81, 11, 73, 20);
		panel.add(txtpnPlayer1);

		JTextPane txtpnDame1 = new JTextPane();
		txtpnDame1.setEditable(false);
		txtpnDame1.setBounds(81, 33, 73, 20);
		panel.add(txtpnDame1);

		JTextPane txtpnArmor1 = new JTextPane();
		txtpnArmor1.setEditable(false);
		txtpnArmor1.setBounds(81, 53, 73, 20);
		panel.add(txtpnArmor1);

		JTextPane txtpnRocket1 = new JTextPane();
		txtpnRocket1.setEditable(false);
		txtpnRocket1.setBounds(81, 72, 73, 20);
		panel.add(txtpnRocket1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(610, 111, 164, 100);
		this.add(panel_1);

		JTextPane txtpnPl2 = new JTextPane();
		txtpnPl2.setEditable(false);
		txtpnPl2.setText("Player 2");
		txtpnPl2.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnPl2.setBounds(10, 11, 61, 20);
		panel_1.add(txtpnPl2);

		JTextPane txtpnD2 = new JTextPane();
		txtpnD2.setEditable(false);
		txtpnD2.setText("Dame");
		txtpnD2.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnD2.setBounds(10, 33, 61, 20);
		panel_1.add(txtpnD2);

		JTextPane txtpnArm2 = new JTextPane();
		txtpnArm2.setEditable(false);
		txtpnArm2.setText("Armor");
		txtpnArm2.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnArm2.setBounds(10, 53, 61, 20);
		panel_1.add(txtpnArm2);

		JTextPane txtpnR2 = new JTextPane();
		txtpnR2.setEditable(false);
		txtpnR2.setText("Rocket");
		txtpnR2.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnR2.setBounds(10, 72, 61, 20);
		panel_1.add(txtpnR2);

		JTextPane txtpnPlayer2 = new JTextPane();
		txtpnPlayer2.setEditable(false);
		txtpnPlayer2.setBounds(81, 11, 73, 20);
		panel_1.add(txtpnPlayer2);

		JTextPane txtpnDame2 = new JTextPane();
		txtpnDame2.setEditable(false);
		txtpnDame2.setBounds(81, 33, 73, 20);
		panel_1.add(txtpnDame2);

		JTextPane txtpnArmor2 = new JTextPane();
		txtpnArmor2.setEditable(false);
		txtpnArmor2.setBounds(81, 53, 73, 20);
		panel_1.add(txtpnArmor2);

		JTextPane txtpnRocket2 = new JTextPane();
		txtpnRocket2.setEditable(false);
		txtpnRocket2.setBounds(81, 72, 73, 20);
		panel_1.add(txtpnRocket2);
		this.setVisible(true);
		add(new gameScreen(items));
	}

	void createDisplay() {

		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(getClass().getResource("map3.txt").getPath()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int line = 0;
		while (scanner.hasNextLine()) {
			for (int i = 0; i < 30; i++) {
				int id = scanner.nextInt();
				Item item = new Item(id, i * 20, line * 20, 20, imageGame.getImage(id));
				//item.draw(graphics2d);
				items.add(item);
			}
			line++;
		}
		scanner.close();
	}
}
