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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class ShowProArrangeForm extends JFrame implements ActionListener{

	private JPanel contentPane;
	private TeamArrangeView parent;
	private int ageGroup;      //0��7-8   1��9-10    2��11-12
	private int proType; //0 ���ӵ���  1����˫�� 2���ӵ���  3����������� 4���Ӱ��� 5���ӱĴ� 6��������
						//7Ů������  8Ů�Ӹߵ͸� 9Ů��ƽ��ľ 10 Ů��������� 11Ů�ӱĴ�
	//private boolean sex;   // true:boy   false:girl
	private JLabel infoLabel;
	private JComboBox groupBox;
	private JButton returnBtn;
	private JTextField playerText;
	private JTextField judgerText;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowProArrangeForm frame = new ShowProArrangeForm(null,0,0);
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
	public ShowProArrangeForm(TeamArrangeView parent,int ageGroup,int proType) {
		this.parent = parent;
		this.ageGroup = ageGroup;
		this.proType = proType;
		//this.sex = sex;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 319);
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
		
		JLabel label = new JLabel("\u8FD0\u52A8\u5458\u5206\u7EC4\u5982\u4E0B\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel label_1 = new JLabel("\u5F53\u524D\u9879\u76EE\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1, BorderLayout.WEST);
		
		groupBox = new JComboBox();
		groupBox.setModel(new DefaultComboBoxModel(new String[] {"A\u7EC4", "B\u7EC4", "C\u7EC4", "D\u7EC4", "E\u7EC4", "F\u7EC4"}));
		groupBox.setSelectedIndex(0);
		panel_2.add(groupBox, BorderLayout.EAST);
		
		infoLabel = new JLabel("");
		panel_2.add(infoLabel, BorderLayout.CENTER);
		setInfoLabelText();
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel label_2 = new JLabel("\u8FD0\u52A8\u5458\uFF1A");
		label_2.setVerticalAlignment(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_2);
		
		JLabel label_3 = new JLabel("\u88C1\u5224\u5458\uFF1A");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_3);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));
		
		playerText = new JTextField();
		playerText.setEnabled(false);
		panel_5.add(playerText);
		playerText.setColumns(10);
		
		judgerText = new JTextField();
		judgerText.setEnabled(false);
		panel_5.add(judgerText);
		judgerText.setColumns(10);
	}
	private void setPJInfo() {
		int tag = groupBox.getSelectedIndex();
		String info[] = new String[2];
		info = getInfo(tag);
		playerText.setText(info[0]);
		judgerText.setText(info[1]);
	}
	private String[] getInfo(int tag) {
		switch(tag) {
		case 0://A
			break;
		case 1://B
			break;
		case 2://C
			break;
		case 3://D
			break;
		case 4://E
			break;
		case 5://F
			break;
		}
		return null;
	}
	private void setInfoLabelText() {
		String sex = "",pro = "",group = "";
		switch(ageGroup) {
		case 0:
			group = "7-8��";
			break;
		case 1:
			group = "9-10��";
			break;
		case 2:
			group = "11-12��";
			break;
		}
		switch(proType) {
		case 0:
			sex = "����";
			pro = "����";
			break;
		case 1:
			sex = "����";
			pro = "˫��";
			break;
		case 2:
			sex = "����";
			pro = "����";
			break;
		case 3:
			sex = "����";
			pro = "�������";
			break;
		case 4:
			sex = "����";
			pro = "����";
			break;
		case 5:
			sex = "����";
			pro = "�Ĵ�";
			break;
		case 6:
			sex = "����";
			pro = "����";
			break;
		case 7:
			sex = "Ů��";
			pro = "����";
			break;
		case 8:
			sex = "Ů��";
			pro = "�ߵ͸�";
			break;
		case 9:
			sex = "Ů��";
			pro = "ƽ��ľ";
			break;
		case 10:
			sex = "Ů��";
			pro = "�������";
			break;
		case 11:
			sex = "Ů��";
			pro = "�Ĵ�";
			break;
		}
		infoLabel.setText(sex+" "+group+" "+pro);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		if(e.getSource() == returnBtn) {
			if(parent != null) {
				parent.setVisible(true);
			}
			this.dispose();
		}
		
	}
}
