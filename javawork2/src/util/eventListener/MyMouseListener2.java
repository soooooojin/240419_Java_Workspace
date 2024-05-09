package util.eventListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class MyMouseListener2 implements MouseListener, MouseMotionListener{
	
	private JLabel jLabel;
	
	public MyMouseListener2(JLabel jLabel) {
		this.jLabel = jLabel;
	}

	// la -> jLabel 변경해서 사용함. 
	@Override
	public void mousePressed(MouseEvent event) {
		int x = event.getX(); // 마우스의 클릭 좌표 x
		int y = event.getY(); // 마우스의 클릭 좌표 y
		jLabel.setLocation(x, y); // (x,y) 위치로 레이블 이동
	}

	public void mouseReleased(MouseEvent event) {
	}

	public void mouseClicked(MouseEvent event) {
	}

	public void mouseEntered(MouseEvent event) {
	}

	public void mouseExited(MouseEvent event) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
