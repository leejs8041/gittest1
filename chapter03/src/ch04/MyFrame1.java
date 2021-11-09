package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		g.drawString("�ȳ��ϼ���", 10, 20);
		g.drawLine(300, 100, 400, 200);
		g.drawLine(300, 100, 200, 200);
		g.drawRect(200, 200, 200, 200);

	}

}

public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	// ������
	public MyFrame1() {
		initData();
		setInitLayout();

	}

	// �޼��� 2�� ������ּ���

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

	// ���� Ŭ����
	

	public static void main(String[] args) {
		new MyFrame1();

	}
}
