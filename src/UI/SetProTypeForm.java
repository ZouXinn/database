package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SetProTypeForm extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton returnBtn;
	private JButton sureBtn;
	private AdminClient parent;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetProTypeForm frame = new SetProTypeForm(null);
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
	public SetProTypeForm(AdminClient parent) {
		this.parent = parent;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		returnBtn = new JButton("\u8FD4\u56DE");
		panel.add(returnBtn, BorderLayout.WEST);
		returnBtn.addActionListener(this);
		
		JLabel label = new JLabel("\u8BBE\u7F6E\u6BD4\u8D5B\u7C7B\u578B");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label, BorderLayout.CENTER);
		
		sureBtn = new JButton("\u63D0\u4EA4");
		panel.add(sureBtn, BorderLayout.EAST);
		sureBtn.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(6, 2, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u7537\u5B50\u5355\u6760");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel);
		
		JComboBox box011 = new JComboBox();
		box011.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box011.setSelectedIndex(0);
		panel_8.add(box011);
		
		JComboBox box012 = new JComboBox();
		box012.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box012.setSelectedIndex(0);
		panel_8.add(box012);
		
		JComboBox box013 = new JComboBox();
		box013.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box013.setSelectedIndex(0);
		panel_8.add(box013);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel label_1 = new JLabel("\u7537\u5B50\u53CC\u6760");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_1);
		
		JComboBox box021 = new JComboBox();
		box021.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box021.setSelectedIndex(0);
		panel_3.add(box021);
		
		JComboBox box022 = new JComboBox();
		box022.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box022.setSelectedIndex(0);
		panel_3.add(box022);
		
		JComboBox box023 = new JComboBox();
		box023.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box023.setSelectedIndex(0);
		panel_3.add(box023);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel label_2 = new JLabel("\u7537\u5B50\u540A\u73AF");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_2);
		
		JComboBox box031 = new JComboBox();
		box031.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box031.setSelectedIndex(0);
		panel_4.add(box031);
		
		JComboBox box032 = new JComboBox();
		box032.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box032.setSelectedIndex(0);
		panel_4.add(box032);
		
		JComboBox box033 = new JComboBox();
		box033.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box033.setSelectedIndex(0);
		panel_4.add(box033);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNanzi = new JLabel("\u7537\u5B50\u8DF3\u9A6C");
		lblNanzi.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNanzi);
		
		JComboBox box041 = new JComboBox();
		box041.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box041.setSelectedIndex(0);
		panel_5.add(box041);
		
		JComboBox box042 = new JComboBox();
		box042.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box042.setSelectedIndex(0);
		panel_5.add(box042);
		
		JComboBox box043 = new JComboBox();
		box043.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box043.setSelectedIndex(0);
		panel_5.add(box043);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel label_3 = new JLabel("\u7537\u5B50\u81EA\u7531\u4F53\u64CD");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(label_3);
		
		JComboBox box051 = new JComboBox();
		box051.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box051.setSelectedIndex(0);
		panel_6.add(box051);
		
		JComboBox box052 = new JComboBox();
		box052.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box052.setSelectedIndex(0);
		panel_6.add(box052);
		
		JComboBox box053 = new JComboBox();
		box053.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box053.setSelectedIndex(0);
		panel_6.add(box053);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel label_4 = new JLabel("\u7537\u5B50\u978D\u9A6C");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(label_4);
		
		JComboBox box061 = new JComboBox();
		box061.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box061.setSelectedIndex(0);
		panel_7.add(box061);
		
		JComboBox box062 = new JComboBox();
		box062.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box062.setSelectedIndex(0);
		panel_7.add(box062);
		
		JComboBox box063 = new JComboBox();
		box063.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box063.setSelectedIndex(0);
		panel_7.add(box063);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel label_5 = new JLabel("\u7537\u5B50\u8E66\u5E8A");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(label_5);
		
		JComboBox box071 = new JComboBox();
		box071.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box071.setSelectedIndex(0);
		panel_10.add(box071);
		
		JComboBox box072 = new JComboBox();
		box072.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box072.setSelectedIndex(0);
		panel_10.add(box072);
		
		JComboBox box073 = new JComboBox();
		box073.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box073.setSelectedIndex(0);
		panel_10.add(box073);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel label_6 = new JLabel("\u5973\u5B50\u8DF3\u9A6C");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_6);
		
		JComboBox box081 = new JComboBox();
		box081.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box081.setSelectedIndex(0);
		panel_2.add(box081);
		
		JComboBox box082 = new JComboBox();
		box082.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box082.setSelectedIndex(0);
		panel_2.add(box082);
		
		JComboBox box083 = new JComboBox();
		box083.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box083.setSelectedIndex(0);
		panel_2.add(box083);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel label_7 = new JLabel("\u5973\u5B50\u9AD8\u4F4E\u6760");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(label_7);
		
		JComboBox box091 = new JComboBox();
		box091.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box091.setSelectedIndex(0);
		panel_9.add(box091);
		
		JComboBox box092 = new JComboBox();
		box092.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box092.setSelectedIndex(0);
		panel_9.add(box092);
		
		JComboBox box093 = new JComboBox();
		box093.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box093.setSelectedIndex(0);
		panel_9.add(box093);
		
		JPanel panel_12 = new JPanel();
		panel_1.add(panel_12);
		panel_12.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\u5973\u5B50\u5E73\u8861\u6728");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_1);
		
		JComboBox box101 = new JComboBox();
		box101.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box101.setSelectedIndex(0);
		panel_12.add(box101);
		
		JComboBox box102 = new JComboBox();
		box102.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box102.setSelectedIndex(0);
		panel_12.add(box102);
		
		JComboBox box103 = new JComboBox();
		box103.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box103.setSelectedIndex(0);
		panel_12.add(box103);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\u5973\u5B50\u81EA\u7531\u4F53\u64CD");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_2);
		
		JComboBox box111 = new JComboBox();
		box111.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box111.setSelectedIndex(0);
		panel_11.add(box111);
		
		JComboBox box112 = new JComboBox();
		box112.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box112.setSelectedIndex(0);
		panel_11.add(box112);
		
		JComboBox box113 = new JComboBox();
		box113.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box113.setSelectedIndex(0);
		panel_11.add(box113);
		
		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\u5973\u5B50\u8E66\u5E8A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_3);
		
		JComboBox box121 = new JComboBox();
		box121.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box121.setSelectedIndex(0);
		panel_13.add(box121);
		
		JComboBox box122 = new JComboBox();
		box122.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box122.setSelectedIndex(0);
		panel_13.add(box122);
		
		JComboBox box123 = new JComboBox();
		box123.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		box123.setSelectedIndex(0);
		panel_13.add(box123);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == sureBtn) {
			
		}else if(e.getSource() == returnBtn) {
			if(parent != null) {
				parent.setVisible(true);
			}
			this.dispose();
		}
	}

}
