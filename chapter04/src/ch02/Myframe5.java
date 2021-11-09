package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Myframe5 extends JFrame{
	
	JLabel label;
	
	public Myframe5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("hello java");
		label.setSize(150,50);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		
		label.setLocation(12,40);
		
	}
	
	private void addEventListener() {
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			
			
			//마우스 눌러 졌을 때 실행되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//마우스가 나갓을 때 실행되는 메서드
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			//마우스가 들어왓을 때 실행되는 메서드
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//마우스가 클릭을 했을 때 사용하는 메서드
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("x좌표값 : " +  e.getX());
				System.out.println("y좌표값 : " + e.getY());
				
				label.setLocation(e.getX(), e.getY());
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Myframe5();
	}

}
