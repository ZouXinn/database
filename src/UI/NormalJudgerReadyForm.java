package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class NormalJudgerReadyForm extends JudgerClient implements ActionListener {

	private JPanel contentPane;
	private JButton returnBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NormalJudgerReadyForm frame = new NormalJudgerReadyForm("normal judger ready");
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
	public NormalJudgerReadyForm(String username) {
		super(username);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u5206\u88C1\u5224\u60A8\u597D\uFF0C\u8BF7\u786E\u8BA4\u6BD4\u8D5B\u4FE1\u606F");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JLabel label_1 = new JLabel("\u60A8\u5DF2\u5C31\u4F4D\uFF0C\u8BF7\u7B49\u5F85\u603B\u88C1\u5224\u5BA3\u5E03\u6BD4\u8D5B\u5F00\u59CB");
		panel_3.add(label_1);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel projectLabel = new JLabel("");
		projectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(projectLabel);
		
		JLabel playersLabel = new JLabel("");
		playersLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(playersLabel);
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.WEST);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u6BD4\u8D5B\u9879\u76EE\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8FD0\u52A8\u5458\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		returnBtn = new JButton("\u8FD4\u56DE");
		panel_2.add(returnBtn);
		returnBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == returnBtn) {
			
		}
	}

}
