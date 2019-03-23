package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AdminClient extends Client implements ActionListener{

	private JPanel contentPane;
	private JButton setProTypeBtn;
	private JButton teamSignUpBtn;
	private JButton judgerArrangeBtn;
	private JButton exitBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminClient frame = new AdminClient();
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
	public AdminClient() {
		super("admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u4F60\u597D\uFF0C\u7BA1\u7406\u5458");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 3, 0, 0));
		
		setProTypeBtn = new JButton("\u6BD4\u8D5B\u7C7B\u578B\u8BBE\u7F6E");
		panel_1.add(setProTypeBtn);
		setProTypeBtn.addActionListener(this);
		
		teamSignUpBtn = new JButton("\u4EE3\u8868\u961F\u62A5\u9053");
		panel_1.add(teamSignUpBtn);
		teamSignUpBtn.addActionListener(this);
		
		judgerArrangeBtn = new JButton("\u88C1\u5224\u5458\u5B89\u6392");
		panel_1.add(judgerArrangeBtn);
		judgerArrangeBtn.addActionListener(this);
		
		exitBtn = new JButton("\u9000\u51FA");
		panel_1.add(exitBtn);
		exitBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == exitBtn) {
			this.dispose();
			System.exit(0);
		}else if(e.getSource() == setProTypeBtn) {
			SetProTypeForm sptf = new SetProTypeForm(this);
			this.setVisible(false);
			sptf.setVisible(true);
		}else if(e.getSource() ==teamSignUpBtn) {
			TeamSignUpForm tsuf= new TeamSignUpForm(this);
			tsuf.setVisible(true);
			this.setVisible(false);
		}else if(e.getSource() == judgerArrangeBtn) {
			
		}
	}

}
