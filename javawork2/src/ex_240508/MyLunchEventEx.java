package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import utill.RandomSelectNumber;

public class MyLunchEventEx extends JFrame {

	private JCheckBox[] Lunch = new JCheckBox[3];
	private String[] names = { "삼각김밥", "컵라면", "김치" };
	private JLabel sumLabel;

	public MyLunchEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("삼각김밥 100원, 컵라면 500원, 김치 20000원"));
		
		sumLabel = new JLabel("현재 0 원 입니다.");//순서 중요함!
		
		MyItemListener2 listener = new MyItemListener2(Lunch, sumLabel);

		for (int i = 0; i < Lunch.length; i++) {
			Lunch[i] = new JCheckBox(names[i]);
			Lunch[i].setBorderPainted(true);
			c.add(Lunch[i]);
			Lunch[i].addItemListener(listener);
		}
		
		JButton recommendBtn = new JButton("자동 메뉴 랜덤 추천");
		recommendBtn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
						JButton testBtn = (JButton) event.getSource();
						if(testBtn.getText().equals("자동 메뉴 랜덤 추천")) {
							int randomNum = RandomSelectNumber.selectInt(5);
							for (int i = 0; i < randomNum; i++) {
								Lunch[i].setSelected(true);
							}
						}	
					}
				});
		
		c.add(recommendBtn);
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
						JButton testBtn = (JButton) event.getSource();
						if(testBtn.getText().equals("Clear")) {
							for (int i = 0; i < Lunch.length; i++) {
								Lunch[i].setSelected(false);
							}
						}
					}
				}
		);
		
		c.add(recommendBtn);
		c.add(clearBtn);

		c.add(sumLabel);

		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyLunchEventEx();

	}

}
