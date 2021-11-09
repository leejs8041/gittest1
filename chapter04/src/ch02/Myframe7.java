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
		 setTitle("키 이벤트 연습");
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
					area.append("위\n" );
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("아래\n");
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("오른쪽\n");
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("왼쪽\n");
				}
				}
		 });
	 }
	 //문자를 눌렀을 때 호출, 문자키에만 반응 합니다.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KeyTyped : " + e.getID());
	}
	//키보드를 눌렀을 때 호출, 모든 키보드에 반응합니다.
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KeyPressed : " + e.getID());
		//e.getKeyCode();
		System.out.println(e.getKeyCode());
		//area.setText(e.getKeyCode() + "");
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("위\n" );
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("아래\n");
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("오른쪽\n");
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("왼쪽\n");
			
		}
	
	}
	
	//키보드를 뗏을 때 호출, 모든 키보드에 반응합니다.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KeyReleased : " + e.getID());
	}
	
}
