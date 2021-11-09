package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		g.drawString("안녕하세요", 10, 20);
		g.drawLine(300, 100, 400, 200);
		g.drawLine(300, 100, 200, 200);
		g.drawRect(200, 200, 200, 200);

	}

}

public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	// 생성자
	public MyFrame1() {
		initData();
		setInitLayout();

	}

	// 메서드 2개 만들어주세요

	private void initData() {
		setTitle("java 2D test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();

	}

	private void setInitLayout() {
		setVisible(true);
		add(myPanel);

	}

	// 내부 클래스
	

	public static void main(String[] args) {
		new MyFrame1();

	}
}
