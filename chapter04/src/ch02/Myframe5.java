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
		setTitle("���콺 �̺�Ʈ");
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
			
			
			//���콺 ���� ���� �� ����Ǵ� �޼���
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//���콺�� ������ �� ����Ǵ� �޼���
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			//���콺�� ������ �� ����Ǵ� �޼���
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//���콺�� Ŭ���� ���� �� ����ϴ� �޼���
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("x��ǥ�� : " +  e.getX());
				System.out.println("y��ǥ�� : " + e.getY());
				
				label.setLocation(e.getX(), e.getY());
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Myframe5();
	}

}
