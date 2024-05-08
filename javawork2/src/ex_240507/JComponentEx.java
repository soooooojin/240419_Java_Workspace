package ex_240507;
//10강 p.6

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComponentEx extends JFrame{
	
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		// 배치관리자, 나란히 정렬
		c.setLayout(new FlowLayout());
		//버튼 3개 정렬
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button ");
		JButton b3 = new JButton("getX(), getY()");
		
		JLabel j1 = new JLabel("테스트");
		// 해당 요소들의 종류와, 이벤트 처리기를 각각 학습.
		
		
		//-------------------------------------
		//버튼 1번 배경색
		b1.setBackground(Color.YELLOW); 
		// 폰트색
		b1.setForeground(Color.MAGENTA);
		//글자 폰트
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); 
		// 버튼2 비활성화
		b2.setEnabled(false); 
		// 버튼3, 이벤트 처리기 붙이기, 방식, 1) 독립 클래스 2) 익명 클래스 방식
		b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		setTitle(b.getX() + "," + b.getY()); 
		}
		});
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260,200); setVisible(true);
		}
		public static void main(String[] args) {
		new JComponentEx();
		}

}
	


