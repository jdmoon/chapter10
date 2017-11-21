package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		super("마우스 올리기 내리기 연습");//super를 이용합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();//컨테이너 이용
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 컨텐트팬에 붙이기
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});

		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new MouseEventFrame();
	}
}
