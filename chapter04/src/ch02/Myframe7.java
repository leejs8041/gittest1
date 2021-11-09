package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Myframe7 extends JFrame implements KeyListener{

	JTextArea area;
	
	public Myframe7() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	 private void initData() {
		 setTitle("Ű �̺�Ʈ ����");
		 setSize(500,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 area = new JTextArea();
	 }
	 private void setInitLayout() {
		 setVisible(true);
		 this.add(area);
		 
	 }
	 private void addEventListener() {
		 //area.addKeyListener(this);
		 area.addKeyListener(new KeyAdapter() {
			 public void KeyPressed(KeyEvent e) {
			 if(e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("��\n" );
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("�Ʒ�\n");
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("������\n");
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("����\n");
				}
				}
		 });
	 }
	 //���ڸ� ������ �� ȣ��, ����Ű���� ���� �մϴ�.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KeyTyped : " + e.getID());
	}
	//Ű���带 ������ �� ȣ��, ��� Ű���忡 �����մϴ�.
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KeyPressed : " + e.getID());
		//e.getKeyCode();
		System.out.println(e.getKeyCode());
		//area.setText(e.getKeyCode() + "");
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("��\n" );
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("�Ʒ�\n");
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("������\n");
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("����\n");
			
		}
	
	}
	
	//Ű���带 ���� �� ȣ��, ��� Ű���忡 �����մϴ�.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KeyReleased : " + e.getID());
	}
	
}
