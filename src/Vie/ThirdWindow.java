package Vie;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.BevelBorder;
import Contr.*;
import Mod.CSV_Handling;

public class ThirdWindow extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldField;
	public JTextField textFieldProfession;
	private JTextField textFieldWPC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			// frame = new ThirdWindow();
			//		frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThirdWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReligon = new JLabel("Religon:");
		lblReligon.setForeground(new Color(100, 149, 237));
		lblReligon.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblReligon.setBounds(26, 16, 110, 29);
		contentPane.add(lblReligon);
		
		JLabel lblShabas = new JLabel("Shabath:");
		lblShabas.setForeground(new Color(255, 255, 255));
		lblShabas.setBounds(26, 122, 69, 20);
		contentPane.add(lblShabas);
		
		JLabel lblKosher = new JLabel("Kosher:");
		lblKosher.setForeground(new Color(255, 255, 255));
		lblKosher.setBounds(26, 158, 69, 20);
		contentPane.add(lblKosher);
		
		JLabel lblModesty = new JLabel("Modesty:");
		lblModesty.setForeground(new Color(255, 255, 255));
		lblModesty.setBounds(26, 194, 69, 20);
		contentPane.add(lblModesty);
		
		JLabel lblReligoiusLevel = new JLabel("Religoius Level:");
		lblReligoiusLevel.setForeground(new Color(255, 255, 255));
		lblReligoiusLevel.setBounds(26, 52, 167, 20);
		contentPane.add(lblReligoiusLevel);
		
		JComboBox comboBoxReligoiusLevel = new JComboBox(Religion.ReligoiusLevel);
		comboBoxReligoiusLevel.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String RL =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.religion.ReligoiusLevelChoice=RL;
				
			}
		});
		comboBoxReligoiusLevel.setBounds(176, 49, 183, 26);
		contentPane.add(comboBoxReligoiusLevel);
		
		JLabel lblNumberOfPraries = new JLabel("Number Of Prayers:");
		lblNumberOfPraries.setForeground(new Color(255, 255, 255));
		lblNumberOfPraries.setBounds(26, 88, 173, 20);
		contentPane.add(lblNumberOfPraries);
		
		JComboBox comboBoxNumOfPray = new JComboBox(Religion.NumOfPray);
		comboBoxNumOfPray.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String Nop =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.religion.NumOfPrayChoice = Nop;
			}
		});
		comboBoxNumOfPray.setBounds(176, 85, 183, 26);
		contentPane.add(comboBoxNumOfPray);
		
		JRadioButton rdbtnYesShabas = new JRadioButton("Yes");
		rdbtnYesShabas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ReverseInputPanel.frame.Human.religion.Shabath=true;

			}
		});
		rdbtnYesShabas.setBounds(176, 122, 183, 29);
		contentPane.add(rdbtnYesShabas);
		
		JRadioButton rdbtnYesKosher = new JRadioButton("Yes");
		rdbtnYesKosher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReverseInputPanel.frame.Human.religion.Kosher=true;

			}
		});
		rdbtnYesKosher.setBounds(176, 154, 183, 29);
		contentPane.add(rdbtnYesKosher);
		
		JRadioButton rdbtnYesModesty = new JRadioButton("Yes");
		rdbtnYesModesty.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReverseInputPanel.frame.Human.religion.Modesty=true;

			}
		});
		rdbtnYesModesty.setBounds(176, 190, 183, 29);
		contentPane.add(rdbtnYesModesty);
		
		JLabel lblHabits = new JLabel("Habits:");
		lblHabits.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblHabits.setForeground(new Color(100, 149, 237));
		lblHabits.setBounds(26, 230, 135, 35);
		contentPane.add(lblHabits);
		
		JLabel lblSmoking = new JLabel("Smoking:");
		lblSmoking.setForeground(new Color(255, 255, 255));
		lblSmoking.setBounds(26, 271, 69, 20);
		contentPane.add(lblSmoking);
		
		JLabel lblDrinking = new JLabel("Drinking:");
		lblDrinking.setForeground(new Color(255, 255, 255));
		lblDrinking.setBounds(26, 307, 69, 20);
		contentPane.add(lblDrinking);
		
		JLabel lblNewLabel = new JLabel("Gambling:\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(26, 343, 96, 20);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnYesSmoking = new JRadioButton("Yes");
		rdbtnYesSmoking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReverseInputPanel.frame.Human.BadHabits.Smoking=true;

			}
		});
		rdbtnYesSmoking.setBounds(176, 267, 183, 29);
		contentPane.add(rdbtnYesSmoking);
		
		JRadioButton rdbtnYesDrinking = new JRadioButton("Yes");
		rdbtnYesDrinking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReverseInputPanel.frame.Human.BadHabits.Drinking=true;

			}
		});
		rdbtnYesDrinking.setBounds(176, 303, 183, 29);
		contentPane.add(rdbtnYesDrinking);
		
		JRadioButton rdbtnYesGambling = new JRadioButton("Yes");
		rdbtnYesGambling.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReverseInputPanel.frame.Human.BadHabits.Gambling=true;

			}
		});
		rdbtnYesGambling.setBounds(176, 343, 183, 29);
		contentPane.add(rdbtnYesGambling);
		
		JLabel lblProfession = new JLabel("Profession:");
		lblProfession.setForeground(new Color(0, 0, 128));
		lblProfession.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblProfession.setBounds(540, 20, 183, 20);
		contentPane.add(lblProfession);
		
		JLabel lblField = new JLabel("Field:");
		lblField.setBounds(540, 52, 69, 20);
		contentPane.add(lblField);
		
		textFieldField = new JTextField();
		textFieldField.setBounds(716, 49, 188, 26);
		contentPane.add(textFieldField);
		textFieldField.setColumns(10);
		
		JLabel lblProfession_1 = new JLabel("Profession:");
		lblProfession_1.setBounds(540, 88, 89, 20);
		contentPane.add(lblProfession_1);
		
		textFieldProfession = new JTextField();
		textFieldProfession.setBounds(716, 85, 188, 26);
		contentPane.add(textFieldProfession);
		textFieldProfession.setColumns(10);
		
		JLabel lblNumberOfHours = new JLabel("Number Of Hours:");
		lblNumberOfHours.setBounds(540, 122, 146, 20);
		contentPane.add(lblNumberOfHours);
		
		JComboBox comboBoxNumOfHours = new JComboBox(Profession.NumHours);
		comboBoxNumOfHours.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String Nof =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.job.NumHoursChoice = Nof;
			}
		});
		comboBoxNumOfHours.setBounds(716, 122, 188, 26);
		contentPane.add(comboBoxNumOfHours);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(540, 158, 69, 20);
		contentPane.add(lblType);
		
		JComboBox comboBoxType = new JComboBox(Profession.Type);
		comboBoxType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String PT =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.job.TypeChoice = PT;
			}
		});
		comboBoxType.setBounds(716, 155, 188, 26);
		contentPane.add(comboBoxType);
		
		JLabel lblWork = new JLabel("Workplace's Region:");
		lblWork.setBounds(540, 194, 146, 20);
		contentPane.add(lblWork);
		
		JComboBox comboBoxWorkPlaceReigon = new JComboBox(Location.Region);
		comboBoxWorkPlaceReigon.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String WPR =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.job.WorkPlace.ReigonChoice = WPR;
				
			}
		});
		comboBoxWorkPlaceReigon.setBounds(716, 191, 188, 26);
		contentPane.add(comboBoxWorkPlaceReigon);
		
		JLabel lblWorkplaceCity = new JLabel("Workplace City:");
		lblWorkplaceCity.setBounds(540, 239, 155, 20);
		contentPane.add(lblWorkplaceCity);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(127, 255, 212));
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//////
				
				ReverseInputPanel.frame.Human.job.Field=textFieldField.getText();
				ReverseInputPanel.frame.Human.job.Profession=textFieldProfession.getText();
				ReverseInputPanel.frame.Human.job.WorkPlace.Cities = textFieldWPC.getText();

				CSV_Handling.saveRecord(ReverseInputPanel.frame.Human.name.FirstName, ReverseInputPanel.frame.Human.name.LastName, ReverseInputPanel.frame.Human.Sex_Choice, ReverseInputPanel.frame.Human.BirthDay.day, ReverseInputPanel.frame.Human.BirthDay.month, ReverseInputPanel.frame.Human.BirthDay.year, ReverseInputPanel.frame.Human.BirthDay.age, ReverseInputPanel.frame.Human.personal.StatusChoice, ReverseInputPanel.frame.Human.personal.HasKids, ReverseInputPanel.frame.Human.personal.astrological_sign_Choice, ReverseInputPanel.frame.Human.looks.Height, ReverseInputPanel.frame.Human.looks.Glasses, ReverseInputPanel.frame.Human.looks.HairColorChoice, ReverseInputPanel.frame.Human.looks.EyeColorChoice, ReverseInputPanel.frame.Human.looks.FacialHairChoice, ReverseInputPanel.frame.Human.looks.BodyTypeChoice, ReverseInputPanel.frame.Human.Resience.ReigonChoice, ReverseInputPanel.frame.Human.Resience.Cities, ReverseInputPanel.frame.Human.Language.LangChoice, ReverseInputPanel.frame.Human.education.YearOfStudies, ReverseInputPanel.frame.Human.education.SubjectChoice, ReverseInputPanel.frame.Human.education.Facility, ReverseInputPanel.frame.Human.education.F_Loaction.ReigonChoice, ReverseInputPanel.frame.Human.education.F_Loaction.Cities, ReverseInputPanel.frame.Human.service.Served, ReverseInputPanel.frame.Human.service.NumbersOfYears, ReverseInputPanel.frame.Human.service.CatagoryChoice, ReverseInputPanel.frame.Human.service.Profession, ReverseInputPanel.frame.Human.religion.ReligoiusLevelChoice, ReverseInputPanel.frame.Human.religion.NumOfPrayChoice, ReverseInputPanel.frame.Human.religion.Shabath, ReverseInputPanel.frame.Human.religion.Kosher, ReverseInputPanel.frame.Human.religion.Modesty,ReverseInputPanel.frame.Human.BadHabits.Smoking, ReverseInputPanel.frame.Human.BadHabits.Drinking, ReverseInputPanel.frame.Human.BadHabits.Gambling, ReverseInputPanel.frame.Human.job.Field, ReverseInputPanel.frame.Human.job.Profession, ReverseInputPanel.frame.Human.job.NumHoursChoice, ReverseInputPanel.frame.Human.job.TypeChoice, ReverseInputPanel.frame.Human.job.WorkPlace.ReigonChoice, ReverseInputPanel.frame.Human.job.WorkPlace.Cities, ReverseInputPanel.frame.Human.ratedValues.OptionsChoice ,  ReverseInputPanel.frame.filepath);
				
				ReverseInputPanel.frame3 = new Menu();
				ReverseInputPanel.frame3.setVisible(true);
				ReverseInputPanel.frame2.setVisible(false);
				
				
				
			}

			
		});
		btnNext.setBounds(794, 447, 115, 29);
		contentPane.add(btnNext);
		
		JComboBox comboBoxValues = new JComboBox(Values.options);
		comboBoxValues.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String VAL =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.ratedValues.OptionsChoice = VAL;
			}
		});
		comboBoxValues.setBounds(716, 304, 193, 26);
		contentPane.add(comboBoxValues);
		
		JLabel lblValues = new JLabel("Values:");
		lblValues.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblValues.setForeground(new Color(0, 0, 128));
		lblValues.setBounds(540, 305, 166, 20);
		contentPane.add(lblValues);
		
		textFieldWPC = new JTextField();
		textFieldWPC.setBounds(716, 239, 188, 26);
		contentPane.add(textFieldWPC);
		textFieldWPC.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 431, 492);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(424, 0, 500, 492);
		contentPane.add(panel_1);
	}
}
