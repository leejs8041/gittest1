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
		setTitle("익명구현객체 사용해보기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("이벤트 등록 후 대기");
		button2 = new JButton("버튼");
		
	}
	private void setInitLayout() {
		setVisible(true);
		add(button,BorderLayout.NORTH);
		add(button2,BorderLayout.SOUTH);
		
				
	}
	

	private void addEventListener() {
		
		ActionListener ac = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭됨");
				System.out.println("추루 알아서 구분 코드 작성해주세요");
			}
		};
		
		button.addActionListener(ac);
		button2.addActionListener(ac);
		}
		
	public static void main(String[] args) {
		
		
		new Myframe4();
		
		
		
	}

}
