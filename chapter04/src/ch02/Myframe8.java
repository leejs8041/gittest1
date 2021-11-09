package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Myframe8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;

	public Myframe8() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("�̹��� ��׶��� ����2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));

		} catch (Exception e) {
			System.err.println("������ �����ϴ�.");
			System.exit(0);
		}
		
		imagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_UP) {
					yPoint -=10;
					yPoint = (yPoint < -50) ? 0 : yPoint-10;					
				}else if(keyCode == KeyEvent.VK_DOWN) {
					yPoint +=10;
					yPoint = (yPoint > 540) ? 500 : yPoint+10;
				}else if(keyCode == KeyEvent.VK_LEFT) {
					xPoint -=10;
					xPoint = (xPoint < -50) ? 0 : xPoint-10;
				}else if(keyCode == KeyEvent.VK_RIGHT) {
					xPoint +=10;
					xPoint = (xPoint > 540) ? 500 : xPoint+10;
				}
				
				repaint();
				}
		});
	}
	
	//���� Ŭ����
	
	private class MyImagePanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(backgroundImage,0,0,500,500,null);
			g.drawImage(imageIcon1,xPoint,yPoint,80,80,null);
			
		}
	}
	
	
	
	
	
	
	

}
