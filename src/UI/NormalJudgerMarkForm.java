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

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class NormalJudgerMarkForm extends JudgerClient implements ActionListener{
	private JPanel contentPane;
	private JTextField textField;
	private JButton sureBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NormalJudgerMarkForm frame = new NormalJudgerMarkForm("normal judger");
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
	public NormalJudgerMarkForm(String username) {
		super(username);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u5206\u88C1\u5224\u5458\u60A8\u597D\uFF0C\u6BD4\u8D5B\u5DF2\u6B63\u5F0F\u5F00\u59CB");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel label_1 = new JLabel("\u6BD4\u8D5B\u9879\u76EE\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("\u8FD0\u52A8\u5458\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_2);
		
		JLabel lblNewLabel = new JLabel("\u5F53\u524D\u8FD0\u52A8\u5458\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel projectLabel = new JLabel("");
		projectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(projectLabel);
		
		JLabel playersLabel = new JLabel("");
		playersLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(playersLabel);
		
		JLabel currentPlayerLabel = new JLabel("");
		currentPlayerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		currentPlayerLabel.setEnabled(false);
		panel_4.add(currentPlayerLabel);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(1, 3, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\u5F97\u5206");
		panel_3.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		sureBtn = new JButton("\u63D0\u4EA4");
		panel_3.add(sureBtn);
		sureBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == sureBtn) {
			
		}
	}

}
