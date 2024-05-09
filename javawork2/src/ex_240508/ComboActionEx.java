package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame {
	private String [] fruits = {"apple", "banana", "mango"}; 
	private ImageIcon [] images = { new ImageIcon("src/util/images/sea2_300.png"),//0번째
									new ImageIcon("src/util/images/sea1_300.png"),//1번쨰
									new ImageIcon("src/util/images/test_img_300.jpg") //2번째
									};
	
	private JLabel imgLabel = new JLabel(images[0]); 
	
	public ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> combo = new JComboBox<String>(fruits); 
		c.add(combo); 
		c.add(imgLabel);
		// 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
		
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource(); 
				int index = cb.getSelectedIndex(); 
				imgLabel.setIcon(images[index]); 
			}
		});
	
			setSize(300,250);
			setVisible(true);
	}
	public static void main(String [] args) {
	new ComboActionEx();
	}

}
