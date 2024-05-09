package ex_240509;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestAreaExmini_pro extends JFrame{
	private JTextArea ta = new JTextArea(7, 20);

	JTextField nameField;
	JTextField emailField;
	JTextField pwField;
	JTextField checkpwField;

	JButton togetherBtn;
	JButton clearBtn;
	JButton modifyBtn;
	JButton deleteBtn;

	GridBagLayout gb;
	GridBagConstraints gbc;

	public TestAreaExmini_pro() {
		setTitle("회원가입 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
		gb = new GridBagLayout();
		setLayout(gb);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

		JLabel name = new JLabel("이름 : ");
		nameField = new JTextField(20);
		gbAdd(name, 0, 0, 1, 1);
		gbAdd(nameField, 1, 0, 3, 1);

		JLabel email = new JLabel("이메일 : ");
		emailField = new JTextField(19);
		gbAdd(email, 0, 1, 1, 1);
		gbAdd(emailField, 1, 1, 3, 1);

		JLabel pw = new JLabel("패스워드 : ");
		pwField = new JTextField(18);
		gbAdd(pw, 0, 2, 1, 1);
		gbAdd(pwField, 1, 2, 3, 1);

		JLabel checkpw = new JLabel("패스워드 확인 : ");
		checkpwField = new JTextField(17);
		gbAdd(checkpw, 0, 3, 1, 1);
		gbAdd(checkpwField, 1, 3, 3, 1);
		

		togetherBtn = new JButton("회원가입");
		gbAdd(togetherBtn, 0, 4, 4, 1);

		clearBtn = new JButton("회원조회");
		gbAdd(clearBtn, 0, 5, 4, 1);
		
		modifyBtn = new JButton("회원수정");
		gbAdd(clearBtn, 0, 5, 4, 1);

		deleteBtn = new JButton("회원조회");
		gbAdd(clearBtn, 0, 5, 4, 1);

		
		JLabel resultLabel = new JLabel("결과뷰");
		gbAdd(resultLabel, 0, 6, 4, 1);

		JScrollPane resultJScrollPane = new JScrollPane(ta);
		gbAdd(resultJScrollPane, 0, 7, 4, 1);

		// 이벤트 처리기. 방식, 익명클래스로 이용.
		togetherBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == togetherBtn) {
					String name = nameField.getText();
					String email = emailField.getText();
					String pw = pwField.getText();
					String checkpw = checkpwField.getText();

					resultLabel.setText("이름: " + name + ", 이메일" + email + ", 패스워드" + pw + ",패스워드 확인" + checkpw);
//					StringBuffer sb = new StringBuffer();
					String result = "이름: " + name + ", 이메일" + email + ", 패스워드" + pw + ",패스워드 확인" + checkpw;
//					sb.append(result);
//					ta.append(sb.toString());
					ta.append(result);

				}

			}
		});

		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == clearBtn) {
					nameField.setText("");
					emailField.setText("");
					pwField.setText("");
					checkpwField.setText("");
					resultLabel.setText("");
					ta.setText("");
				}

			}
		});

		setSize(400, 500);
//		setResizable(false);
		setVisible(true);
	}

	private void gbAdd(JComponent c, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gb.setConstraints(c, gbc);
		gbc.insets = new Insets(2, 2, 2, 2);
		add(c, gbc);
	}// gbAdd

	public static void main(String[] args) {
		new TestAreaExmini_pro();

	}

}
