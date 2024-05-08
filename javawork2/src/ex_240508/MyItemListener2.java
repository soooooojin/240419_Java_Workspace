package ex_240508;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class MyItemListener2 implements ItemListener {
	public int sum = 0; // 가격의 합

	private JCheckBox[] Lunch;
	private JLabel sumLabel;

	public MyItemListener2(JCheckBox[] Lunch, JLabel sumLabel) {
		super();//부모찾아가라
		this.Lunch = Lunch;
		this.sumLabel = sumLabel;
	}

	public void itemStateChanged(ItemEvent event) {
		if (event.getStateChange() == ItemEvent.SELECTED) {
			if (event.getItem() == Lunch[0])
				sum += 100;
			else if (event.getItem() == Lunch[1])
				sum += 500;
			else
				sum += 20000;
		} else {
			if (event.getItem() == Lunch[0])
				sum -= 100;
			else if (event.getItem() == Lunch[1])
				sum -= 500;
			else
				sum -= 20000;
		}
		sumLabel.setText("현재 " + sum + "원 입니다.");
	}
}		
