package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Player;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import BLL.*;
public class SetInfoForm extends JFrame implements ActionListener{

	private JPanel contentPane;
	private String username;
	private JTable table;
	private JButton returnBtn;
	private JButton setPlayerInfoBtn;
	private JButton sureBtn;
	SetPlayerInfoForm son;
	private TeamClient parent;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetInfoForm frame = new SetInfoForm("team",null);
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
	public SetInfoForm(String username,TeamClient parent) {
		this.son = null;
		this.parent = parent;
		this.username = username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		sureBtn = new JButton("\u63D0\u4EA4");
		panel_2.add(sureBtn, BorderLayout.WEST);
		sureBtn.addActionListener(this);
		
		setPlayerInfoBtn = new JButton("\u8FD0\u52A8\u5458\u4FE1\u606F\u5F55\u5165");
		panel_2.add(setPlayerInfoBtn, BorderLayout.EAST);
		setPlayerInfoBtn.addActionListener(this);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u9886\u961F", null, "", null, null},
				{"\u961F\u533B", null, "", null, null},
				{"\u6559\u7EC3\u5458", null, null, null, null},
				{"\u88C1\u5224\u5458", null, null, null, null},
			},
			new String[] {
				"\u8EAB\u4EFD", "\u59D3\u540D", "\u6027\u522B", "\u8EAB\u4EFD\u8BC1\u53F7", "\u7535\u8BDD"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getTableHeader().setReorderingAllowed(false);//不可改变列的顺序
		table.getTableHeader().setResizingAllowed(false);//不可改变列的宽度
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane, BorderLayout.CENTER);
		//scrollPane.add(table);
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.getColumnModel().getColumn(1).setMinWidth(23);
		table.getColumnModel().getColumn(3).setPreferredWidth(202);
		table.getColumnModel().getColumn(4).setPreferredWidth(175);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		returnBtn = new JButton("\u8FD4\u56DE");
		panel_1.add(returnBtn, BorderLayout.WEST);
		returnBtn.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("\u4FE1\u606F\u5F55\u5165");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource() == returnBtn) {
			if(parent != null) {
				parent.setVisible(true);
			}
			this.dispose();
		}else if(e.getSource() == sureBtn) {
			if(son == null) {
				JOptionPane.showMessageDialog(null, "未录入运动员信息","错误！", JOptionPane.ERROR_MESSAGE);
			}else {
				TeamInfo info = new TeamInfo(null,null,null,null,son.boyVect,son.girlVect);
				info.send();
			}			
		}else if(e.getSource() == setPlayerInfoBtn) {
			son = new SetPlayerInfoForm(this);
			this.setVisible(false);
			son.setVisible(true);
		}
	}
	private void updateToDB() {
		//Object[] boyPros1 = boyVect.toArray();
		Object[] boyPros = son.boyVect.toArray();
		Object[] girlPros = son.girlVect.toArray();
		for(int i = 0 ; i < boyPros.length ;i++) {
			System.out.println(((Player)boyPros[i]).getName()+" "+((Player)boyPros[i]).getAge());
		}
		for(int i = 0 ; i < girlPros.length ;i++) {
			System.out.println(((Player)girlPros[i]).getName()+" "+((Player)girlPros[i]).getAge());
		}
	}
}
