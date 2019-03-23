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

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MainJudgerMarkForm extends JudgerClient implements ActionListener{

	private JPanel contentPane;
	private JTextField scoreDText;
	private JTextField scorePTxet;
	private JButton back1Btn;
	private JButton back2Btn;
	private JButton back3Btn;
	private JButton sureBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJudgerMarkForm frame = new MainJudgerMarkForm("main Judger");
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
	public MainJudgerMarkForm(String username) {
		super(username);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u4E3B\u88C1\u5224\u60A8\u597D\uFF0C\u6BD4\u8D5B\u5DF2\u6B63\u5F0F\u5F00\u59CB\uFF01");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(1, 5, 0, 0));
		
		JLabel lblD = new JLabel("D:");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblD);
		
		scoreDText = new JTextField();
		panel_1.add(scoreDText);
		scoreDText.setColumns(10);
		
		JLabel lblP = new JLabel("P:");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblP);
		
		scorePTxet = new JTextField();
		panel_1.add(scorePTxet);
		scorePTxet.setColumns(10);
		
		sureBtn = new JButton("\u63D0\u4EA4");
		panel_1.add(sureBtn);
		sureBtn.addActionListener(this);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(6, 0, 0, 0));
		
		JLabel label_1 = new JLabel("\u6BD4\u8D5B\u9879\u76EE\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_1);
		
		JLabel lblNewLabel = new JLabel("\u8FD0\u52A8\u5458\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5F53\u524D\u8FD0\u52A8\u5458\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u88C1\u52241\uFF1A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u88C1\u52242\uFF1A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u88C1\u52243\uFF1A");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel projectLabel = new JLabel("");
		panel_5.add(projectLabel);
		
		JLabel playersLabel = new JLabel("");
		panel_5.add(playersLabel);
		
		JLabel currentPlayerLabel = new JLabel("");
		panel_5.add(currentPlayerLabel);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_6.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel score1Label = new JLabel("");
		panel_7.add(score1Label);
		
		JLabel score2Label = new JLabel("");
		panel_7.add(score2Label);
		
		JLabel score3Label = new JLabel("");
		panel_7.add(score3Label);
		
		JPanel panel_8 = new JPanel();
		panel_6.add(panel_8, BorderLayout.EAST);
		panel_8.setLayout(new GridLayout(3, 1, 0, 0));
		
		back1Btn = new JButton("\u6253\u56DE");
		panel_8.add(back1Btn);
		back1Btn.addActionListener(this);
		
		back2Btn = new JButton("\u6253\u56DE");
		panel_8.add(back2Btn);
		back2Btn.addActionListener(this);
		
		back3Btn = new JButton("\u6253\u56DE");
		panel_8.add(back3Btn);
		back3Btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == back1Btn) {
			
		}else if(e.getSource() == back2Btn) {
			
		}else if(e.getSource() == back3Btn) {
			
		}else if(e.getSource() == sureBtn) {
			
		}
	}

}
