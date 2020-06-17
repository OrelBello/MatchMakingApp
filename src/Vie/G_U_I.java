package Vie;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

import Contr.*;


public class G_U_I extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static Person Human = (Person) Factory.Fact("Person");
	String filepath = "test33.txt";
	
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_Sex;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldDay;
	private JTextField textFieldMonth;
	private JTextField textFieldYear;
	//static G_U_I frame;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseInputPanel.frame = new G_U_I();
					ReverseInputPanel.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	public G_U_I() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-11, -66, 945, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox_Sex = new JComboBox(Human.Sex);
		comboBox_Sex.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Human.Sex_Choice= (String) e.getItem();


			}
		});
		comboBox_Sex.setBounds(216, 253, 206, 38);
		contentPane.add(comboBox_Sex);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(216, 182, 206, 26);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setBounds(66, 185, 76, 20);
		contentPane.add(lblFirstName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(216, 211, 206, 26);
		contentPane.add(textFieldLastName);
		textFieldLastName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setBounds(66, 221, 76, 20);
		contentPane.add(lblLastName);
		
		textFieldDay = new JTextField();
		textFieldDay.setBounds(275, 307, 29, 26);
		contentPane.add(textFieldDay);
		textFieldDay.setColumns(10);
		
		JLabel lblDateddmmyy = new JLabel("Date Of Birth (dd/mm/yy)");
		lblDateddmmyy.setForeground(new Color(255, 255, 255));
		lblDateddmmyy.setBounds(66, 310, 194, 20);
		contentPane.add(lblDateddmmyy);
		
		textFieldMonth = new JTextField();
		textFieldMonth.setBounds(312, 307, 29, 26);
		contentPane.add(textFieldMonth);
		textFieldMonth.setColumns(10);
		
		textFieldYear = new JTextField();
		textFieldYear.setBounds(356, 307, 66, 26);
		contentPane.add(textFieldYear);
		textFieldYear.setColumns(10);
		
		JComboBox comboBoxStatus = new JComboBox(Human.personal.Status);
		comboBoxStatus.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
						Human.personal.StatusChoice= (String) e.getItem(); 
			}
		});
		comboBoxStatus.setBounds(216, 346, 206, 26);
		contentPane.add(comboBoxStatus);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(new Color(255, 255, 255));
		lblStatus.setBounds(66, 349, 69, 20);
		contentPane.add(lblStatus);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Human.personal.HasKids=true;
			}
		});
		rdbtnNewRadioButton.setBounds(216, 387, 203, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblKidsyn = new JLabel("Kids (Y/N)");
		lblKidsyn.setForeground(new Color(255, 255, 255));
		lblKidsyn.setBounds(66, 400, 121, 20);
		contentPane.add(lblKidsyn);
		
		JLabel lblAstrologicalSign = new JLabel("Astrological Sign");
		lblAstrologicalSign.setForeground(new Color(255, 255, 255));
		lblAstrologicalSign.setBounds(66, 431, 121, 20);
		contentPane.add(lblAstrologicalSign);
		
		JComboBox comboBoxZodiac = new JComboBox(Human.personal.astrological_sign);
		comboBoxZodiac.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Human.personal.astrological_sign_Choice= (String) e.getItem(); 

			}
		});
		comboBoxZodiac.setBounds(216, 428, 206, 26);
		contentPane.add(comboBoxZodiac);
		
		JLabel lblBasicInformation = new JLabel("Basic Information:");
		lblBasicInformation.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblBasicInformation.setForeground(new Color(25, 25, 112));
		lblBasicInformation.setBounds(51, 128, 342, 38);
		contentPane.add(lblBasicInformation);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 128, 470, 405);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(65, 133, 69, 20);
		panel.add(lblGender);
		lblGender.setForeground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(176, 224, 230)));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 0, 923, 128);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello! Welcome to Shidos, \r\nPlease register and follow the instructions below.");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setBounds(69, 47, 794, 28);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 22));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(466, 128, 457, 405);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButtonNext = new JButton("Next\r\n");
		btnNewButtonNext.setBackground(new Color(176, 196, 222));
		btnNewButtonNext.setBounds(327, 360, 115, 29);
		panel_2.add(btnNewButtonNext);
		btnNewButtonNext.setForeground(new Color(0, 0, 0));
		btnNewButtonNext.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButtonNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int day, month, year;
				String day_t, month_t, year_t, fn, ln;
				
			
				fn=textFieldFirstName.getText();
				ln=textFieldLastName.getText();
				Human.name = new FullName(fn, ln);
				
				day_t = textFieldDay.getText();
				day = Integer.parseInt(day_t);
				month_t = textFieldMonth.getText();
				month = Integer.parseInt(month_t);
				year_t = textFieldYear.getText();
				year = Integer.parseInt(year_t);
				Human.BirthDay = new DateOfBirth(day, month, year);
				Human.IdNum();
				Human.Active=true;
				Human.BirthDay.SetAge();
				
				
				
				ReverseInputPanel.frame1 = new SecondWindow();
				ReverseInputPanel.frame1.setVisible(true);
				ReverseInputPanel.frame.setVisible(false);

			}
		});
	}
}
