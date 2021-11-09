package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	
	private Image image;
	private Image image2;
	JButton button1;
	
	public ImagePanel(String imageName) {
		image2 = new ImageIcon(imageName).getImage();

	}
	
	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(),  getHeight(), null);
	}
}




public class MyFrame3 extends JFrame{
	private ImagePanel imagePanel;
	private ImagePanel imagePane2;
	
	public MyFrame3() {
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		setTitle("JPanel에 이미지 넣기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePane2 = new ImagePanel("image1.jpg");
		
		
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2,1));
		add(imagePanel);
		
		
		
		
	}
	public static void main(String[] args) {
		new MyFrame3();
	}
	
	
	
	
}
