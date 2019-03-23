package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MainJudgerReadyForm extends JudgerClient implements ActionListener {

	private JPanel contentPane;
	private JButton beginBtn;
	private JButton returnBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJudgerReadyForm frame = new MainJudgerReadyForm("main judger ready");
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
	public MainJudgerReadyForm(String username) {
		super(username);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u4E3B\u88C1\u5224\u60A8\u597D\uFF0C\u8BF7\u786E\u8BA4\u6BD4\u8D5B\u4FE1\u606F\uFF01");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel projectLabel = new JLabel("");
		projectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(projectLabel);
		
		JLabel playersLabel = new JLabel("");
		playersLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(playersLabel);
		
		JLabel readyJudgersLabel = new JLabel("");
		readyJudgersLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(readyJudgersLabel);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u6BD4\u8D5B\u9879\u76EE\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8FD0\u52A8\u5458\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5DF2\u5C31\u4F4D\u88C1\u5224\u6570\uFF1A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(1, 2, 0, 0));
		
		beginBtn = new JButton("\u5F00\u59CB\u6BD4\u8D5B");
		panel_2.add(beginBtn);
		beginBtn.addActionListener(this);
		
		returnBtn = new JButton("\u8FD4\u56DE");
		panel_2.add(returnBtn);
		returnBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == beginBtn) {
			
		}else if(e.getSource() == returnBtn) {
			
		}
	}

}
