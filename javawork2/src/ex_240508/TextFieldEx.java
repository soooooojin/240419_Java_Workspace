package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//회원가입창,
//라벨, JTextField 구성.
//입력 항목, 1) 이름 2) 이메일 3) 패스워드 4) 패스워드 확인.
//회원 가입 버튼 클릭시,
//하단에 라벨에, 정보 출력해보기.
public class TextFieldEx extends JFrame {

	public TextFieldEx() {
		
		
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과", 20)); 
		c.add(new JLabel("주소 "));
		c.add(new JTextField("서울시 ...", 20)); 
		setSize(300,250);
		setVisible(true);
		}
	
	
	public static void main(String[] args) {
		new TextFieldEx();
	}

}































