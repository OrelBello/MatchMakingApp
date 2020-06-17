package Vie;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contr.Factory;
import Contr.Person;
import Contr.Preferences_Class;
import Mod.Mod;
import Mod.read_file;

import Vie.G_U_I;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JTextPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextArea;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JCheckBox;;
@SuppressWarnings("serial")
public class ShowOwnProfile extends JFrame {

	
	static int num_rec=0;
	public static Person[] prs = new Person[30];
	public boolean once_click = true;
	public static JTextArea TA_F_Name;
	public static JTextArea TA_L_Name;
	public static JTextArea TA_Age;
	public static JTextArea TA_D_O_Birth;
	public static JTextArea TA_Astrolog;
	public static JTextArea TA_Status;
	public static JTextArea TA_Languages;
	public static JTextArea TA_Height;
	public static JCheckBox CB_Glasses;
	public static JTextArea TA_Hair_Color;
	public static JTextArea TA_Eye_Color;
	public static JTextArea TA_Facial_Hair;
	public static JTextArea TA_Body_Type;
	public static JTextArea TA_Subject;
	public static JTextArea TA_Year_Of_Studies; 
	public static JTextArea TA_Facility ;
	public static JTextArea TA_Field;
	public static JTextArea TA_lb_Profession;
	public static JTextArea TA_Num_Of_Hour;
	public static JTextArea TA_Type;
	public static JTextArea TA_Religoius_Lev;
	public static JTextArea TA_Num_Of_Prayers;
	public static JCheckBox CB_Shabath;
	public static JCheckBox CB_Kosher;
	public static JCheckBox CB_Modesty;
	public static JCheckBox CB_Smoking;
	public static JCheckBox CB_Drinking;
	public static JCheckBox CB_Gambling;
	public static JTextArea TA_Served;
	public static JTextArea TA_Num_Of_Years;
	public static JTextArea TA_Catagory;
	public static JTextArea TA_SER_Profession;
	public static JCheckBox Ser_checkBox;
	public static JCheckBox Kids_checkBox;
	public static int k;
	public static JButton btnForword; 
	private JPanel contentPane;
	public static boolean flag;
	public static int size_indexes;	
	public static int next_index;
	public static int prev_index;
	public static int indexes_2[]= new int[30];
	public static int i=0;


	
	
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		//			ReverseInputPanel.frame5 = new ShowOwnProfile();
			//		ReverseInputPanel.frame5.setVisible(true);
						
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	

	
	
	@SuppressWarnings("static-access")
	public ShowOwnProfile() {
		

		//initialize all the records
		//prs = file.copy_Hava();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(12, 0, 1308, 640);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		/*GENERAL INFO*/
		
		Label G_Info = new Label("General Info");
		G_Info.setForeground(new Color(102, 204, 204));
		G_Info.setFont(new Font("Dialog", Font.BOLD, 26));
		G_Info.setBounds(55, 314, 277, 36);
		panel_1.add(G_Info);
		
		Label F_Name = new Label("First Name:");
		F_Name.setFont(new Font("Dialog", Font.BOLD, 17));
		F_Name.setBounds(55, 356, 115, 24);
		panel_1.add(F_Name);
		
		TA_F_Name = new JTextArea();
		TA_F_Name.setEnabled(false);
		TA_F_Name.setEditable(false);
		TA_F_Name.setFont(new Font("Tahoma", TA_F_Name.getFont().getStyle(), TA_F_Name.getFont().getSize() + 3));
		TA_F_Name.setBounds(183, 356, 149, 22);
		panel_1.add(TA_F_Name);
		
		Label L_Name = new Label("Last Name:");
		L_Name.setFont(new Font("Dialog", Font.BOLD, 17));
		L_Name.setBounds(55, 386, 115, 24);
		panel_1.add(L_Name);
		
		TA_L_Name = new JTextArea();
		TA_L_Name.setEditable(false);
		TA_L_Name.setEnabled(false);
		TA_L_Name.setBounds(183, 386, 149, 22);
		panel_1.add(TA_L_Name);
		
		Label Age = new Label("Age:");
		Age.setFont(new Font("Dialog", Font.BOLD, 17));
		Age.setBounds(55, 416, 115, 24);
		panel_1.add(Age);
		
		TA_Age = new JTextArea();
		TA_Age.setEditable(false);
		TA_Age.setEnabled(false);
		TA_Age.setBounds(183, 416, 149, 22);
		panel_1.add(TA_Age);
		
		Label D_O_Birth = new Label("Date Of Birth:");
		D_O_Birth.setFont(new Font("Dialog", Font.BOLD, 17));
		D_O_Birth.setBounds(55, 446, 115, 24);
		panel_1.add(D_O_Birth);
		
		TA_D_O_Birth = new JTextArea();
		TA_D_O_Birth.setEditable(false);
		TA_D_O_Birth.setEnabled(false);
		TA_D_O_Birth.setBounds(183, 446, 149, 22);
		panel_1.add(TA_D_O_Birth);
		
		Label Astrolog = new Label("Astrological:");
		Astrolog.setFont(new Font("Dialog", Font.BOLD, 17));
		Astrolog.setBounds(55, 476, 115, 24);
		panel_1.add(Astrolog);
		
		TA_Astrolog = new JTextArea();
		TA_Astrolog.setEditable(false);
		TA_Astrolog.setEnabled(false);
		TA_Astrolog.setBounds(183, 476, 149, 22);
		panel_1.add(TA_Astrolog);
		
		Label Status = new Label("Status:");
		Status.setFont(new Font("Dialog", Font.BOLD, 17));
		Status.setBounds(55, 506, 115, 24);
		panel_1.add(Status);
		
		TA_Status = new JTextArea();
		TA_Status.setEditable(false);
		TA_Status.setEnabled(false);
		TA_Status.setBounds(183, 506, 149, 22);
		panel_1.add(TA_Status);
		
		
		/*PHSYICAL CHARACTERISTICS*/
		
		Label Languages = new Label("Languages:");
		Languages.setFont(new Font("Dialog", Font.BOLD, 17));
		Languages.setBounds(55, 566, 115, 24);
		panel_1.add(Languages);
		
		TA_Languages = new JTextArea();
		TA_Languages.setEditable(false);
		TA_Languages.setEnabled(false);
		TA_Languages.setBounds(183, 568, 149, 22);
		panel_1.add(TA_Languages);
		
		Label P_Characteristics = new Label("Phsyical Characteristics");
		P_Characteristics.setForeground(new Color(102, 204, 204));
		P_Characteristics.setFont(new Font("Dialog", Font.BOLD, 26));
		P_Characteristics.setBounds(429, 24, 341, 36);
		panel_1.add(P_Characteristics);
		
		Label Height = new Label("Height (cm):");
		Height.setFont(new Font("Dialog", Font.BOLD, 17));
		Height.setBounds(429, 66, 115, 24);
		panel_1.add(Height);
		
		TA_Height = new JTextArea();
		TA_Height.setEditable(false);
		TA_Height.setEnabled(false);
		TA_Height.setBounds(557, 66, 149, 22);
		panel_1.add(TA_Height);
		
		Label Glasses = new Label("Glasses:");
		Glasses.setFont(new Font("Dialog", Font.BOLD, 17));
		Glasses.setBounds(429, 96, 115, 24);
		panel_1.add(Glasses);
		
		CB_Glasses = new JCheckBox("");
		CB_Glasses.setEnabled(false);
		CB_Glasses.setBounds(557, 96, 25, 25);
		panel_1.add(CB_Glasses);
		
		Label Hair_Color = new Label("Hair Color:");
		Hair_Color.setFont(new Font("Dialog", Font.BOLD, 17));
		Hair_Color.setBounds(429, 126, 115, 24);
		panel_1.add(Hair_Color);
		
		TA_Hair_Color = new JTextArea();
		TA_Hair_Color.setEditable(false);
		TA_Hair_Color.setEnabled(false);
		TA_Hair_Color.setBounds(557, 126, 149, 22);
		panel_1.add(TA_Hair_Color);
		
		Label Eye_Color = new Label("Eye Color:");
		Eye_Color.setFont(new Font("Dialog", Font.BOLD, 17));
		Eye_Color.setBounds(429, 156, 115, 24);
		panel_1.add(Eye_Color);
		
		TA_Eye_Color = new JTextArea();
		TA_Eye_Color.setEditable(false);
		TA_Eye_Color.setEnabled(false);
		TA_Eye_Color.setBounds(557, 156, 149, 22);
		panel_1.add(TA_Eye_Color);
		
		Label Facial_Hair = new Label("Facial Hair:");
		Facial_Hair.setFont(new Font("Dialog", Font.BOLD, 17));
		Facial_Hair.setBounds(429, 186, 115, 24);
		panel_1.add(Facial_Hair);
		
		TA_Facial_Hair = new JTextArea();
		TA_Facial_Hair.setEditable(false);
		TA_Facial_Hair.setEnabled(false);
		TA_Facial_Hair.setBounds(557, 186, 149, 22);
		panel_1.add(TA_Facial_Hair);
		
		Label Body_Type = new Label("Body Type:");
		Body_Type.setFont(new Font("Dialog", Font.BOLD, 17));
		Body_Type.setBounds(429, 216, 115, 24);
		panel_1.add(Body_Type);
		
		TA_Body_Type = new JTextArea();
		TA_Body_Type.setEditable(false);
		TA_Body_Type.setEnabled(false);
		TA_Body_Type.setBounds(557, 216, 149, 22);
		panel_1.add(TA_Body_Type);
		
	
		/*STUDIES*/
		
		Label Studies = new Label("Studies");
		Studies.setForeground(new Color(102, 204, 204));
		Studies.setFont(new Font("Dialog", Font.BOLD, 26));
		Studies.setBounds(429, 268, 277, 36);
		panel_1.add(Studies);
		
		Label Subject = new Label("Subject:");
		Subject.setFont(new Font("Dialog", Font.BOLD, 17));
		Subject.setBounds(429, 310, 115, 24);
		panel_1.add(Subject);
		
		TA_Subject = new JTextArea();
		TA_Subject.setEditable(false);
		TA_Subject.setEnabled(false);
		TA_Subject.setBounds(557, 310, 149, 22);
		panel_1.add(TA_Subject);
		
		Label Year_Of_Studies = new Label("Year Of Studies:");
		Year_Of_Studies.setFont(new Font("Dialog", Font.BOLD, 17));
		Year_Of_Studies.setBounds(429, 340, 115, 24);
		panel_1.add(Year_Of_Studies);
		
		TA_Year_Of_Studies = new JTextArea();
		TA_Year_Of_Studies.setEditable(false);
		TA_Year_Of_Studies.setEnabled(false);
		TA_Year_Of_Studies.setBounds(557, 340, 149, 22);
		panel_1.add(TA_Year_Of_Studies);
		
		Label Facility = new Label("Facility:");
		Facility.setFont(new Font("Dialog", Font.BOLD, 17));
		Facility.setBounds(429, 370, 115, 24);
		panel_1.add(Facility);
		
		TA_Facility = new JTextArea();
		TA_Facility.setEditable(false);
		TA_Facility.setEnabled(false);
		TA_Facility.setBounds(557, 370, 149, 22);
		panel_1.add(TA_Facility);
		
		Label Profession = new Label("Profession");
		Profession.setForeground(new Color(102, 204, 204));
		Profession.setFont(new Font("Dialog", Font.BOLD, 26));
		Profession.setBounds(429, 436, 277, 36);
		panel_1.add(Profession);
		
		Label Field = new Label("Field:");
		Field.setFont(new Font("Dialog", Font.BOLD, 17));
		Field.setBounds(429, 478, 115, 24);
		panel_1.add(Field);
		
		TA_Field = new JTextArea();
		TA_Field.setEditable(false);
		TA_Field.setEnabled(false);
		TA_Field.setBounds(557, 478, 149, 22);
		panel_1.add(TA_Field);
		
		Label lb_Profession = new Label("Profession:");
		lb_Profession.setFont(new Font("Dialog", Font.BOLD, 17));
		lb_Profession.setBounds(429, 508, 115, 24);
		panel_1.add(lb_Profession);
		
		TA_lb_Profession = new JTextArea();
		TA_lb_Profession.setEditable(false);
		TA_lb_Profession.setEnabled(false);
		TA_lb_Profession.setBounds(557, 508, 149, 22);
		panel_1.add(TA_lb_Profession);
		
		Label Num_Of_Hour = new Label("Num Of Hours:");
		Num_Of_Hour.setFont(new Font("Dialog", Font.BOLD, 17));
		Num_Of_Hour.setBounds(429, 538, 115, 24);
		panel_1.add(Num_Of_Hour);
		
		TA_Num_Of_Hour = new JTextArea();
		TA_Num_Of_Hour.setEditable(false);
		TA_Num_Of_Hour.setEnabled(false);
		TA_Num_Of_Hour.setBounds(557, 538, 149, 22);
		panel_1.add(TA_Num_Of_Hour);
		
		Label Type = new Label("Type:");
		Type.setFont(new Font("Dialog", Font.BOLD, 17));
		Type.setBounds(429, 568, 115, 24);
		panel_1.add(Type);
		
		TA_Type = new JTextArea();
		TA_Type.setEditable(false);
		TA_Type.setEnabled(false);
		TA_Type.setBounds(557, 568, 149, 22);
		panel_1.add(TA_Type);
		
		Label Religon = new Label("Religon");
		Religon.setForeground(new Color(102, 204, 204));
		Religon.setFont(new Font("Dialog", Font.BOLD, 26));
		Religon.setBounds(841, 24, 277, 36);
		panel_1.add(Religon);
		
		Label Religoius_Lev = new Label("Religoius Level:");
		Religoius_Lev.setFont(new Font("Dialog", Font.BOLD, 17));
		Religoius_Lev.setBounds(841, 66, 131, 24);
		panel_1.add(Religoius_Lev);
		
		TA_Religoius_Lev = new JTextArea();
		TA_Religoius_Lev.setEditable(false);
		TA_Religoius_Lev.setEnabled(false);
		TA_Religoius_Lev.setBounds(1021, 66, 149, 22);
		panel_1.add(TA_Religoius_Lev);
		
		Label Num_Of_Prayers = new Label("Number Of Prayers:");
		Num_Of_Prayers.setFont(new Font("Dialog", Font.BOLD, 17));
		Num_Of_Prayers.setBounds(841, 96, 174, 24);
		panel_1.add(Num_Of_Prayers);
		
		TA_Num_Of_Prayers = new JTextArea();
		TA_Num_Of_Prayers.setEditable(false);
		TA_Num_Of_Prayers.setEnabled(false);
		TA_Num_Of_Prayers.setBounds(1021, 96, 149, 22);
		panel_1.add(TA_Num_Of_Prayers);
		
		Label Shabath = new Label("Shabath:");
		Shabath.setFont(new Font("Dialog", Font.BOLD, 17));
		Shabath.setBounds(841, 126, 115, 24);
		panel_1.add(Shabath);
		
		CB_Shabath = new JCheckBox("");
		CB_Shabath.setEnabled(false);
		CB_Shabath.setBounds(1021, 125, 25, 25);
		panel_1.add(CB_Shabath);
		
		Label Kosher = new Label("Kosher:");
		Kosher.setFont(new Font("Dialog", Font.BOLD, 17));
		Kosher.setBounds(841, 156, 115, 24);
		panel_1.add(Kosher);
		
		CB_Kosher = new JCheckBox("");
		CB_Kosher.setEnabled(false);
		CB_Kosher.setBounds(1021, 156, 25, 25);
		panel_1.add(CB_Kosher);
		
		Label Modesty = new Label("Modesty:");
		Modesty.setFont(new Font("Dialog", Font.BOLD, 17));
		Modesty.setBounds(841, 186, 115, 24);
		panel_1.add(Modesty);
		
		CB_Modesty = new JCheckBox("");
		CB_Modesty.setEnabled(false);
		CB_Modesty.setBounds(1021, 186, 25, 25);
		panel_1.add(CB_Modesty);
		
		Label Habits = new Label("Habits");
		Habits.setForeground(new Color(102, 204, 204));
		Habits.setFont(new Font("Dialog", Font.BOLD, 26));
		Habits.setBounds(841, 246, 277, 36);
		panel_1.add(Habits);
		
		Label Smoking = new Label("Smoking:");
		Smoking.setFont(new Font("Dialog", Font.BOLD, 17));
		Smoking.setBounds(841, 288, 115, 24);
		panel_1.add(Smoking);
		
		CB_Smoking = new JCheckBox("");
		CB_Smoking.setEnabled(false);
		CB_Smoking.setBounds(969, 286, 25, 25);
		panel_1.add(CB_Smoking);
		
		Label Drinking = new Label("Drinking:");
		Drinking.setFont(new Font("Dialog", Font.BOLD, 17));
		Drinking.setBounds(841, 318, 115, 24);
		panel_1.add(Drinking);
		
		CB_Drinking = new JCheckBox("");
		CB_Drinking.setEnabled(false);
		CB_Drinking.setBounds(969, 317, 25, 25);
		panel_1.add(CB_Drinking);
		
		Label Gambling = new Label("Gambling:");
		Gambling.setFont(new Font("Dialog", Font.BOLD, 17));
		Gambling.setBounds(841, 348, 115, 24);
		panel_1.add(Gambling);
		
		CB_Gambling = new JCheckBox("");
		CB_Gambling.setEnabled(false);
		CB_Gambling.setBounds(969, 347, 25, 25);
		panel_1.add(CB_Gambling);
		
		Label Milatary_National_Service = new Label("Milatary/National Service:");
		Milatary_National_Service.setForeground(new Color(102, 204, 204));
		Milatary_National_Service.setFont(new Font("Dialog", Font.BOLD, 26));
		Milatary_National_Service.setBounds(841, 406, 329, 36);
		panel_1.add(Milatary_National_Service);
		
		Label Served = new Label("Served:");
		Served.setFont(new Font("Dialog", Font.BOLD, 17));
		Served.setBounds(841, 448, 115, 24);
		panel_1.add(Served);
		
		Label Num_Of_Years = new Label("Number Of Years:");
		Num_Of_Years.setFont(new Font("Dialog", Font.BOLD, 17));
		Num_Of_Years.setBounds(841, 478, 148, 24);
		panel_1.add(Num_Of_Years);
		
		TA_Num_Of_Years = new JTextArea();
		TA_Num_Of_Years.setEditable(false);
		TA_Num_Of_Years.setEnabled(false);
		TA_Num_Of_Years.setBounds(995, 478, 149, 22);
		panel_1.add(TA_Num_Of_Years);
		
		Label Catagory = new Label("Catagory:");
		Catagory.setFont(new Font("Dialog", Font.BOLD, 17));
		Catagory.setBounds(841, 508, 115, 24);
		panel_1.add(Catagory);
		
		TA_Catagory = new JTextArea();
		TA_Catagory.setEditable(false);
		TA_Catagory.setEnabled(false);
		TA_Catagory.setBounds(995, 508, 149, 22);
		panel_1.add(TA_Catagory);
		
		Label SER_Profession = new Label("Profession:");
		SER_Profession.setFont(new Font("Dialog", Font.BOLD, 17));
		SER_Profession.setBounds(841, 538, 115, 24);
		panel_1.add(SER_Profession);
		
		TA_SER_Profession = new JTextArea();
		TA_SER_Profession.setEditable(false);
		TA_SER_Profession.setEnabled(false);
		TA_SER_Profession.setBounds(995, 538, 149, 22);
		panel_1.add(TA_SER_Profession);
		

		JCheckBox Ser_checkBox = new JCheckBox("");
		Ser_checkBox.setEnabled(false);
		Ser_checkBox.setBounds(995, 446, 25, 25);
		panel_1.add(Ser_checkBox);
		
		Label label = new Label("Kids:");
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setBounds(55, 536, 115, 24);
		panel_1.add(label);
		
		JCheckBox Kids_checkBox = new JCheckBox("");
		Kids_checkBox.setEnabled(false);
		Kids_checkBox.setBounds(183, 537, 25, 25);
		panel_1.add(Kids_checkBox);
		
		
		
		
		
		JButton btnShowResult = new JButton("Show my profile");
		btnShowResult.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				{
				TA_F_Name.setText((String) G_U_I.Human.name.FirstName);
				TA_L_Name.setText((String) G_U_I.Human.name.LastName);
				TA_Age.setText(Integer.toString(G_U_I.Human.BirthDay.age));
				TA_D_O_Birth.setText(Integer.toString(G_U_I.Human.BirthDay.day)+"/"+Integer.toString(G_U_I.Human.BirthDay.month)+"/"+Integer.toString(G_U_I.Human.BirthDay.year));
				TA_Astrolog.setText((String) G_U_I.Human.personal.astrological_sign_Choice);
				TA_Status.setText((String) G_U_I.Human.personal.StatusChoice);
				TA_Languages.setText((String) G_U_I.Human.Language.LangChoice);
				TA_Height.setText(Double.toString(G_U_I.Human.looks.Height));
				CB_Glasses.setSelected(G_U_I.Human.looks.Glasses);
				TA_Hair_Color.setText((String) G_U_I.Human.looks.HairColorChoice);
				TA_Eye_Color.setText((String) G_U_I.Human.looks.EyeColorChoice);
				TA_Facial_Hair.setText((String) G_U_I.Human.looks.FacialHairChoice);
				TA_Body_Type.setText((String) G_U_I.Human.looks.BodyTypeChoice);
				TA_Subject.setText((String) G_U_I.Human.education.SubjectChoice);
				TA_Year_Of_Studies.setText(Integer.toString(G_U_I.Human.education.YearOfStudies));
				TA_Facility.setText((String) G_U_I.Human.education.Facility);
				TA_Field.setText((String) G_U_I.Human.job.Field);
				TA_lb_Profession.setText((String) G_U_I.Human.job.Profession);
				TA_Num_Of_Hour.setText((String) G_U_I.Human.job.NumHoursChoice);
				TA_Type.setText((String) G_U_I.Human.job.TypeChoice);
				TA_Religoius_Lev.setText((String) G_U_I.Human.religion.ReligoiusLevelChoice);
				TA_Num_Of_Prayers.setText((String) G_U_I.Human.religion.NumOfPrayChoice);
				CB_Shabath.setSelected(G_U_I.Human.religion.Shabath);
				CB_Kosher.setSelected(G_U_I.Human.religion.Kosher);
				CB_Modesty.setSelected(G_U_I.Human.religion.Modesty);
				CB_Smoking.setSelected(G_U_I.Human.BadHabits.Smoking);
				CB_Drinking.setSelected(G_U_I.Human.BadHabits.Drinking);
				CB_Gambling.setSelected(G_U_I.Human.BadHabits.Gambling);
				TA_Num_Of_Years.setText(Integer.toString(G_U_I.Human.service.NumbersOfYears));
				TA_Catagory.setText((String) G_U_I.Human.service.CatagoryChoice);
				TA_SER_Profession.setText((String) G_U_I.Human.service.Profession);
				Ser_checkBox.setSelected(G_U_I.Human.service.Served);
				Kids_checkBox.setSelected(G_U_I.Human.personal.HasKids);
			
			
				}
			}
		}
	);
		btnShowResult.setBounds(15, 24, 172, 36);
		panel_1.add(btnShowResult);
		
		JButton btnNewButton = new JButton("Return to menu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Menu frame3 = new Menu();
				//ReverseInputPanel.frame3.setVisible(true);
				//ReverseInputPanel.frame4.setVisible(false);
				
				//ShowOwnProfile frame4 = new ShowOwnProfile();
				ReverseInputPanel.frame3.setVisible(true);
				ReverseInputPanel.frame4.setVisible(false);
				
				
				
				
			}
		});
		btnNewButton.setBounds(15, 75, 172, 36);
		panel_1.add(btnNewButton);
		
		
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setMaximum(30);
		scrollbar.setBounds(888, 0, 21, 485);
		
		
	}


				

}
