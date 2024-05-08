package utill.eventListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.text.AbstractDocument.Content;

public class MyKeyListener extends KeyAdapter {
	
	private Container container;
	private JLabel jLabel;
	
	//생성자. 
	public  MyKeyListener(Container container, JLabel jLabel) {
		this.container = container;
		this.jLabel = jLabel;
		
	}
	
	public void keyPressed(KeyEvent e) {
// 임의의 색을 만들기 위해 랜덤하게 r, g, b 성분 생성
		int r = (int) (Math.random() * 256); // red 성분
		int g = (int) (Math.random() * 256); // green 성분
		int b = (int) (Math.random() * 256); // blue 성분
		
		
		// event.getKeyChar() : 실제 키보드의 값을 의미
		// event.getKeyCode() : 가상 키의 값.
		
//		switch (e.getKeyChar()) { // 입력된 키 문자
		switch (e.getKeyChar()) { // 입력된 키 문자
		case KeyEvent.VK_LEFT: // <Enter> 키 입력
//			jLabel.setText("r=" + r + ", g=" + g + ", b=" + b + " , enter 입력했음");
			jLabel.setText("r=" + r + ", g=" + g + ", b=" + b + " , 왼쪽 방향키 입력했음");

			container.setBackground(new Color(r, g, b));
			break;
		case KeyEvent.VK_RIGHT: // <Enter> 키 입력
//			jLabel.setText("r=" + r + ", g=" + g + ", b=" + b + " , t 입력했음");
			jLabel.setText("r=" + r + ", g=" + g + ", b=" + b + " , 오른쪽 방향키 입력했음");
			container.setBackground(new Color(r, g, b));
			break;	
		case 'q':
			System.exit(0);
		}
	}

	

}


























