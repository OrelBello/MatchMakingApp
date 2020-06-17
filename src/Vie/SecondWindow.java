package Vie;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import Contr.*;



@SuppressWarnings("serial")
public class SecondWindow extends JFrame {
	//static SecondWindow frame;
	private JPanel contentPane;
	private JTextField textFieldCity;
	private JTextField textFieldFacility;
	private JTextField textFieldFacilityCity;
	private JTextField textFieldLang;
	private JTextField textFieldProfession;
	JSpinner spinner_YearOfStudy;
	JSpinner spinner_Army;
	JSpinner spinnerHeight;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_Catagory;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxFRegion;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxHairColor;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxSubject;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxRegion;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxBodyType;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxFacialHair;
	@SuppressWarnings("rawtypes")
	JComboBox comboBoxEyeColor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	frame = new SecondWindow();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public SecondWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGlasses = new JLabel("Glasses:");
		lblGlasses.setForeground(new Color(255, 255, 255));
		lblGlasses.setBounds(19, 104, 69, 20);
		contentPane.add(lblGlasses);
		
		JLabel lblHairColor = new JLabel("Hair Color:");
		lblHairColor.setForeground(new Color(255, 255, 255));
		lblHairColor.setBounds(19, 138, 82, 20);
		contentPane.add(lblHairColor);
		
		JLabel lblEyesColor = new JLabel("Eye Color:");
		lblEyesColor.setForeground(new Color(255, 255, 255));
		lblEyesColor.setBounds(19, 180, 82, 20);
		contentPane.add(lblEyesColor);
		
		JLabel lblFacialHair = new JLabel("Facial Hair:");
		lblFacialHair.setForeground(new Color(255, 255, 255));
		lblFacialHair.setBounds(19, 219, 82, 20);
		contentPane.add(lblFacialHair);
		
		JLabel lblBodyType = new JLabel("Body Type:");
		lblBodyType.setForeground(new Color(255, 255, 255));
		lblBodyType.setBounds(19, 262, 82, 20);
		contentPane.add(lblBodyType);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(72, 209, 204));
		btnNext.addMouseListener(new MouseAdapter() {
			/* (non-Javadoc)
			 * @see java.awt.event.MouseAdapter#mouseClicked(java.awt.event.MouseEvent)
			 */
			@Override
			public void mouseClicked(MouseEvent arg0) {
				

				ReverseInputPanel.frame.Human.looks.Height=(int) spinnerHeight.getValue();
				ReverseInputPanel.frame.Human.education.YearOfStudies=(int) spinner_YearOfStudy.getValue();
				ReverseInputPanel.frame.Human.service.NumbersOfYears=(int) spinner_Army.getValue();
				
				ReverseInputPanel.frame.Human.education.Facility=textFieldFacility.getText();
				ReverseInputPanel.frame.Human.education.F_Loaction.Cities=textFieldFacilityCity.getText();
				ReverseInputPanel.frame.Human.job.Profession=textFieldProfession.getText();
				ReverseInputPanel.frame.Human.Resience.Cities=textFieldCity.getText();
				ReverseInputPanel.frame.Human.Language.LangChoice=textFieldLang.getText();
				
				
				
				
				
				
				
				ReverseInputPanel.frame2 = new ThirdWindow();
				ReverseInputPanel.frame2.setVisible(true);
				ReverseInputPanel.frame1.setVisible(false);


			}
		});
		btnNext.setBounds(793, 448, 115, 29);
		contentPane.add(btnNext);
		
		JLabel lblPhsyicalCharacteristics = new JLabel("Phsyical Characteristics:");
		lblPhsyicalCharacteristics.setForeground(new Color(100, 149, 237));
		lblPhsyicalCharacteristics.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblPhsyicalCharacteristics.setBounds(15, 16, 300, 20);
		contentPane.add(lblPhsyicalCharacteristics);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblLocation.setForeground(new Color(100, 149, 237));
		lblLocation.setBounds(19, 298, 218, 20);
		contentPane.add(lblLocation);
		
		JLabel lblRegion = new JLabel("Region:");
		lblRegion.setForeground(new Color(255, 255, 255));
		lblRegion.setBounds(19, 334, 69, 20);
		contentPane.add(lblRegion);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setForeground(new Color(255, 255, 255));
		lblCity.setBounds(19, 370, 69, 20);
		contentPane.add(lblCity);
		
		JLabel lblStudies = new JLabel("Studies:");
		lblStudies.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblStudies.setForeground(new Color(25, 25, 112));
		lblStudies.setBounds(416, 16, 122, 20);
		contentPane.add(lblStudies);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setBounds(416, 54, 69, 20);
		contentPane.add(lblSubject);
		
		comboBoxSubject = new JComboBox(Studies.Subject);
		comboBoxSubject.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String subject =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.education.SubjectChoice = subject;
			}
		});
		comboBoxSubject.setBounds(611, 51, 163, 26);
		contentPane.add(comboBoxSubject);
		
		JLabel lblYearOfStudies = new JLabel("Year Of Studies:");
		lblYearOfStudies.setBounds(416, 100, 122, 20);
		contentPane.add(lblYearOfStudies);
		
		spinner_YearOfStudy = new JSpinner();
		spinner_YearOfStudy.setBounds(611, 101, 32, 26);
		contentPane.add(spinner_YearOfStudy);
		
		JLabel lblFacility = new JLabel("Facility:");
		lblFacility.setBounds(416, 138, 69, 20);
		contentPane.add(lblFacility);
		
		textFieldFacility = new JTextField();
		textFieldFacility.setBounds(611, 138, 163, 26);
		contentPane.add(textFieldFacility);
		textFieldFacility.setColumns(10);
		
		JLabel lblFacilitysRegion = new JLabel("Facility's Region");
		lblFacilitysRegion.setBounds(416, 180, 122, 20);
		contentPane.add(lblFacilitysRegion);
		
		comboBoxFRegion = new JComboBox(Location.Region);
		comboBoxFRegion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String Floc =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.education.F_Loaction.ReigonChoice = Floc;
				
				
			}
		});
		comboBoxFRegion.setBounds(611, 177, 163, 26);
		contentPane.add(comboBoxFRegion);
		
		JLabel lblFacilitysCity = new JLabel("Facility's City:");
		lblFacilitysCity.setBounds(416, 219, 136, 20);
		contentPane.add(lblFacilitysCity);
		
		textFieldFacilityCity = new JTextField();
		textFieldFacilityCity.setBounds(611, 216, 163, 26);
		contentPane.add(textFieldFacilityCity);
		textFieldFacilityCity.setColumns(10);
		
		JLabel lblLangages = new JLabel("Languages:");
		lblLangages.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblLangages.setForeground(new Color(100, 149, 237));
		lblLangages.setBounds(19, 406, 137, 29);
		contentPane.add(lblLangages);
		
		JLabel lblMilataryService = new JLabel("Milatary/National Service:");
		lblMilataryService.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblMilataryService.setForeground(new Color(25, 25, 112));
		lblMilataryService.setBounds(416, 256, 401, 29);
		contentPane.add(lblMilataryService);
		
		JLabel lblServed = new JLabel("Served:");
		lblServed.setBounds(416, 300, 69, 20);
		contentPane.add(lblServed);
		
		JLabel lblNumberOfYears = new JLabel("Number Of Years:");
		lblNumberOfYears.setBounds(416, 334, 153, 20);
		contentPane.add(lblNumberOfYears);
		
		JLabel lblCatagory = new JLabel("Catagory:");
		lblCatagory.setBounds(416, 370, 69, 20);
		contentPane.add(lblCatagory);
		
		JLabel lblProfession = new JLabel("Profession:");
		lblProfession.setBounds(416, 412, 115, 20);
		contentPane.add(lblProfession);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 401, 492);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height (cm):");
		lblHeight.setBounds(15, 75, 90, 20);
		panel.add(lblHeight);
		lblHeight.setForeground(new Color(255, 255, 255));
		
		comboBoxBodyType = new JComboBox(PhysicalCharacteristics.BodyType);
		comboBoxBodyType.setBounds(114, 257, 197, 26);
		panel.add(comboBoxBodyType);
		
		comboBoxFacialHair = new JComboBox(PhysicalCharacteristics.FacialHair);
		comboBoxFacialHair.setBounds(114, 212, 197, 26);
		panel.add(comboBoxFacialHair);
		
		comboBoxEyeColor = new JComboBox(PhysicalCharacteristics.EyeColor);
		comboBoxEyeColor.setBounds(114, 176, 197, 26);
		panel.add(comboBoxEyeColor);
		
		comboBoxHairColor = new JComboBox(PhysicalCharacteristics.HairColor);
		comboBoxHairColor.setBounds(114, 134, 197, 26);
		panel.add(comboBoxHairColor);
		
		JRadioButton rdbtnGlasses = new JRadioButton("Yes");
		rdbtnGlasses.setBounds(114, 100, 197, 29);
		panel.add(rdbtnGlasses);
		
		spinnerHeight = new JSpinner();
		spinnerHeight.setBounds(114, 72, 32, 26);
		panel.add(spinnerHeight);
		
		comboBoxRegion = new JComboBox(Location.Region);
		comboBoxRegion.setBounds(114, 332, 197, 26);
		panel.add(comboBoxRegion);
		
		textFieldCity = new JTextField();
		textFieldCity.setBounds(114, 363, 197, 26);
		panel.add(textFieldCity);
		textFieldCity.setColumns(10);
		
		textFieldLang = new JTextField();
		textFieldLang.setBounds(165, 405, 146, 26);
		panel.add(textFieldLang);
		textFieldLang.setColumns(10);
		comboBoxRegion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String reg =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.Resience.ReigonChoice = reg;
				
				
			}
		});
		rdbtnGlasses.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ReverseInputPanel.frame.Human.looks.Glasses=true;
			}
		});
		comboBoxHairColor.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String hair =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.looks.HairColorChoice = hair;
			}
		});
		comboBoxEyeColor.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String eye =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.looks.EyeColorChoice = eye;
				
				
			}
		});
		comboBoxFacialHair.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String Fhair =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.looks.FacialHairChoice = Fhair;
				
				
			}
		});
		comboBoxBodyType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String Btype =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.looks.BodyTypeChoice = Btype;
				
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(400, 0, 524, 492);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		comboBox_Catagory = new JComboBox(MilitaryService.Catagory);
		comboBox_Catagory.setBounds(211, 371, 159, 26);
		panel_1.add(comboBox_Catagory);
		
		spinner_Army = new JSpinner();
		spinner_Army.setBounds(215, 329, 32, 26);
		panel_1.add(spinner_Army);
		
		JRadioButton rdbtnNumArmy = new JRadioButton("Yes");
		rdbtnNumArmy.setBounds(215, 296, 155, 29);
		panel_1.add(rdbtnNumArmy);
		
		textFieldProfession = new JTextField();
		textFieldProfession.setBounds(211, 410, 159, 26);
		panel_1.add(textFieldProfession);
		textFieldProfession.setColumns(10);
		rdbtnNumArmy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ReverseInputPanel.frame.Human.service.Served=true;

			}
		});
		comboBox_Catagory.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String catagory =(String) e.getItem().toString();
				ReverseInputPanel.frame.Human.service.CatagoryChoice = catagory;
				
				
			}
		});
	}
}
