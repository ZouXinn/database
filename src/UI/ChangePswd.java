package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangePswd extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField currentPswdText;
	private JTextField newPswdText;
	private JTextField newPswdAgainText;
	private String username;
	private String password;
	private TeamClient parent;
	private JButton sureBtn;
	private JButton cancelBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePswd frame = new ChangePswd("admin",null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChangePswd(String username,TeamClient parent) {
		this.username = username;
		this.parent = parent;
		this.setTitle("修改密码");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		sureBtn = new JButton("\u63D0\u4EA4");
		sureBtn.addActionListener(this);
		panel.add(sureBtn);
		
		cancelBtn = new JButton("\u53D6\u6D88");
		cancelBtn.addActionListener(this);
		panel.add(cancelBtn);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel label = new JLabel("\u5F53\u524D\u5BC6\u7801\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label);
		
		JLabel lblNewLabel = new JLabel("\u65B0\u5BC6\u7801\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u518D\u6B21\u786E\u8BA4\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		currentPswdText = new JTextField();
		panel_3.add(currentPswdText);
		currentPswdText.setColumns(10);
		
		newPswdText = new JTextField();
		panel_3.add(newPswdText);
		newPswdText.setColumns(10);
		
		newPswdAgainText = new JTextField();
		panel_3.add(newPswdAgainText);
		newPswdAgainText.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.NORTH);
		
		JLabel greetLabel = new JLabel("\u4F60\u597D\uFF01\u4EE3\u8868\u961F\u540D\uFF01");
		panel_4.add(greetLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == sureBtn) {//点击了提交
			if(true) {//密码正确
				if(newPswdText.getText().equals(newPswdAgainText.getText())) {//两次新密码相同
					//执行修改秘密操作
					
					
				}else {//两次密码不同
					JOptionPane.showMessageDialog(null, "错误", "两次密码不同，请重新输入", JOptionPane.ERROR_MESSAGE);
					newPswdText.setText("");
					newPswdAgainText.setText("");
				}
			}else {//密码错误
				JOptionPane.showMessageDialog(null, "密码错误", "密码错误，请重新输入", JOptionPane.ERROR_MESSAGE);
				currentPswdText.setText(null);
				newPswdText.setText(null);
				newPswdAgainText.setText(null);
			}
		}else {//点击了取消
			parent.setVisible(true);
			this.dispose();		
		}
		
	}

}
