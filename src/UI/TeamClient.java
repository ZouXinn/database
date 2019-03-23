package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeamClient extends Client implements ActionListener{

	private JPanel contentPane;
	private String username;
	private JButton changeInfoBtn;
	private JButton changePswdBtn;
	private JButton exitBtn;
	private JButton arrangeCheckBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamClient frame = new TeamClient("team");
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
	public TeamClient(String username) {
		super(username);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel greetLabel = new JLabel("\u6B22\u8FCE+\u961F\u4F0D\u540D");
		greetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(greetLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		changeInfoBtn = new JButton("\u5F55\u5165\u4FE1\u606F");
		panel.add(changeInfoBtn);
		changeInfoBtn.addActionListener(this);
		
		changePswdBtn = new JButton("\u4FEE\u6539\u5BC6\u7801");
		changePswdBtn.addActionListener(this);
		panel.add(changePswdBtn);
		
		arrangeCheckBtn = new JButton("\u8D5B\u7A0B\u5B89\u6392");
		panel.add(arrangeCheckBtn);
		arrangeCheckBtn.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		exitBtn = new JButton("\u9000\u51FA");
		panel_1.add(exitBtn);
		exitBtn.addActionListener(this);
	}
	
	public String getPswd() {//获得密码
		return "";
	}
	public boolean setPswd(String password) {//设置密码
		return true;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == changeInfoBtn) {//点击录入信息
			SetInfoForm sif = new SetInfoForm(username,this);
			this.setVisible(false);
			sif.setVisible(true);		
		}else if(e.getSource() == changePswdBtn) {//点击修改密码
			ChangePswd frame = new ChangePswd("team",this);
			frame.setVisible(true);
			this.setVisible(false);		
		}else if(e.getSource()==exitBtn) {//点击退出
			this.dispose();
			System.exit(0);
		}else {//赛程安排
			TeamArrangeView tav = new TeamArrangeView(this);
			this.setVisible(false);
			tav.setVisible(true);
		}
	}
}
