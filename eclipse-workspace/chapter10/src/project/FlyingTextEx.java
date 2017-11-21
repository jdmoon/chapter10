package project;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("C");
	
	public FlyingTextEx() {
		setTitle("클릭 연습용 응용 프로그램 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		la.setSize(100,20);
		
		setSize(500,500);
		setVisible(true);
		
		la.setLocation(10,10);
		
		c.setFocusable(true);
		c.requestFocus();
		
		int x = 50;
		int y = 50;
		c.addMouseListener(new MyMouseListener());
		c.setLocation(x,y);
		c.add(la);
	}
	class MyMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
		}
	}
	public static void main(String [] args) {
		new FlyingTextEx();
		
	}

}