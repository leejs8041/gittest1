package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe4 extends JFrame{
	
	JButton button;
	JButton button2;
	
	public Myframe4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�͸�����ü ����غ���");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("�̺�Ʈ ��� �� ���");
		button2 = new JButton("��ư");
		
	}
	private void setInitLayout() {
		setVisible(true);
		add(button,BorderLayout.NORTH);
		add(button2,BorderLayout.SOUTH);
		
				
	}
	

	private void addEventListener() {
		
		ActionListener ac = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� Ŭ����");
				System.out.println("�߷� �˾Ƽ� ���� �ڵ� �ۼ����ּ���");
			}
		};
		
		button.addActionListener(ac);
		button2.addActionListener(ac);
		}
		
	public static void main(String[] args) {
		
		
		new Myframe4();
		
		
		
	}

}
