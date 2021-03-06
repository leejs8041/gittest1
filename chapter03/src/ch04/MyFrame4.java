package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4 extends JFrame{
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	BufferedImage imageIcon1;
	MyImagePanel myImagePanel;
	//1. 3개이상 만들어서 화면에 올려 주세요.
	
	//2. 반복적인 부분 보이면 배열, ArrayList사용
	
	
	//생성자
	public MyFrame4(){
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new  File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			imageIcon1 = ImageIO.read(new File("image1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		//myImagePanel생성
		myImagePanel = new MyImagePanel();
		
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);
		
	}
	
	
	
	
	
	private class MyImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.drawImage(backgroundImage,0,0,500,500,null);
			g.drawImage(imageIcon,200,200,80,80,null);
			g.drawImage(imageIcon1,100,100,80,80,null);
		}
	}//end of inner class
	
	//메인 함수
	public static void main(String[] args) {
		new MyFrame4();
	}//end of main

}//end of class
