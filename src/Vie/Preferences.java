package Vie;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contr.Factory;
import Contr.Ideal;
import Contr.Preferences_Class;
import Mod.read_file;
import Contr.MatchMaking;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;

@SuppressWarnings("serial")
public class Preferences extends JFrame {

	Ideal Sara = (Ideal) Factory.Fact("Ideal");
	public static Preferences_Class Mosses = new Preferences_Class();//
	private JPanel contentPane;
	@SuppressWarnings("rawtypes")
	JComboBox MinAgecomboBox;
	@SuppressWarnings("rawtypes")
	JComboBox MaxAgecomboBox_1;
	
	String Ages[] = {" ",
			"18",
			"19",
			"20",
			"21",
			"22",
			"23",
			"24",
			"25",
			"26",
			"27",
			"28",
			"29",
			"30",
			"31",
			"32",
			"33",
			"34",
			"35",
			"36",
			"37",
			"38",
			"39",
			"40",
			"41",
			"42",
			"43",
			"44",
			"45",
			"46",
			"47",
			"48",
			"49",
			"50",
			"51",
			"52",
			"53",
			"54",
			"55",
			"56",
			"57",
			"58",
			"59",
			"60",
			"61",
			"62",
			"63",
			"64",
			"65",
			"66",
			"67",
			"68",
			"69",
			"70",
			"71",
			"72",
			"73",
			"74",
			"75",
			"76",
			"77",
			"78",
			"79",
			"80",
			"81",
			"82",
			"83",
			"84",
			"85",
			"86",
			"87",
			"88",
			"89",
			"90",
			"91",
			"92",
			"93",
			"94",
			"95",
			"96",
			"97",
			"98",
			"99"};
				
	String Height[] = {" ",
			"130",
			"131",
			"132",
			"133",
			"134",
			"135",
			"136",
			"137",
			"138",
			"139",
			"140",
			"141",
			"142",
			"143",
			"144",
			"145",
			"146",
			"147",
			"148",
			"149",
			"150",
			"151",
			"152",
			"153",
			"154",
			"155",
			"156",
			"157",
			"158",
			"159",
			"160",
			"161",
			"162",
			"163",
			"164",
			"165",
			"166",
			"167",
			"168",
			"169",
			"170",
			"171",
			"172",
			"173",
			"174",
			"175",
			"176",
			"177",
			"178",
			"179",
			"180",
			"181",
			"182",
			"183",
			"184",
			"185",
			"186",
			"187",
			"188",
			"189",
			"190",
			"191",
			"192",
			"193",
			"194",
			"195",
			"196",
			"197",
			"198",
			"199"};


	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preferences frame = new Preferences();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Preferences() {
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRangeOfAges = new JLabel("Range of ages:");
		lblRangeOfAges.setBounds(15, 72, 142, 20);
		contentPane.add(lblRangeOfAges);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(15, 108, 69, 20);
		contentPane.add(lblStatus);
		
		JLabel lblKidsyn = new JLabel("Kids(Don't care/Bother):");
		lblKidsyn.setBounds(15, 144, 177, 20);
		contentPane.add(lblKidsyn);
		
		JLabel lblRangeOfHeights = new JLabel("Range of heights:");
		lblRangeOfHeights.setBounds(15, 182, 142, 20);
		contentPane.add(lblRangeOfHeights);
		
		JLabel lblBodyType = new JLabel("Body type:");
		lblBodyType.setBounds(15, 218, 106, 20);
		contentPane.add(lblBodyType);
		
		JLabel lblRegion = new JLabel("Region:");
		lblRegion.setBounds(15, 254, 69, 20);
		contentPane.add(lblRegion);
		
		JLabel lblServedyn = new JLabel("Didn't Served (Don't care/Bother):");
		lblServedyn.setBounds(15, 300, 275, 20);
		contentPane.add(lblServedyn);
		
		JLabel lblReligion = new JLabel("Religion:");
		lblReligion.setBounds(15, 336, 69, 20);
		contentPane.add(lblReligion);
		
		JLabel lblShabat = new JLabel("Shabat:");
		lblShabat.setBounds(15, 372, 69, 20);
		contentPane.add(lblShabat);
		
		JLabel lblKosher = new JLabel("Kosher:");
		lblKosher.setBounds(15, 408, 69, 20);
		contentPane.add(lblKosher);
		
		JLabel lblModesty = new JLabel("Modesty:");
		lblModesty.setBounds(15, 444, 69, 20);
		contentPane.add(lblModesty);
		
		JLabel lblDrinking = new JLabel("Drinking:");
		lblDrinking.setBounds(265, 372, 69, 20);
		contentPane.add(lblDrinking);
		
		MinAgecomboBox = new JComboBox(Ages);
		MinAgecomboBox.setBounds(198, 69, 59, 26);
		contentPane.add(MinAgecomboBox);
		MinAgecomboBox.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.MinAge=(String) e.getItem();  

			}
		});
		
		MaxAgecomboBox_1 = new JComboBox(Ages);
		MaxAgecomboBox_1.setBounds(279, 69, 55, 26);
		contentPane.add(MaxAgecomboBox_1);
		MaxAgecomboBox_1.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.MaxAge= (String) e.getItem();   

			}
		});
		
		
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Single");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Mosses.Single=true;
			}
		});
		chckbxNewCheckBox.setBounds(198, 104, 139, 29);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Divorced");
		chckbxNewCheckBox_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Divorced=true;
			}
		});
		chckbxNewCheckBox_1.setBounds(341, 104, 139, 29);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Widowed");
		chckbxNewCheckBox_2.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Widowed=true;
			}
		});
		chckbxNewCheckBox_2.setBounds(487, 104, 139, 29);
		contentPane.add(chckbxNewCheckBox_2);
		
		
		
		
		JComboBox MinHeightcomboBox_2 = new JComboBox(Height);
		MinHeightcomboBox_2.setBounds(198, 179, 59, 26);
		contentPane.add(MinHeightcomboBox_2);
		MinHeightcomboBox_2.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.MinHeight= (String) e.getItem();  

			}
		});
		
		
		
		
		
		JComboBox MaxHeightcomboBox_3 = new JComboBox(Height);
		MaxHeightcomboBox_3.setBounds(279, 179, 55, 26);
		contentPane.add(MaxHeightcomboBox_3);
		MaxHeightcomboBox_3.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.MaxHeight= (String) e.getItem();  

			}
		});
		
		
		
		
		JRadioButton KidsrdbtnNewRadioButton = new JRadioButton("Bother");
		KidsrdbtnNewRadioButton.setBounds(198, 140, 155, 29);
		contentPane.add(KidsrdbtnNewRadioButton);
		KidsrdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Kids=true;
			}
		});
		
		
		
		
		
		
		JComboBox BodytypecomboBox_4 = new JComboBox(Sara.looks.BodyType);
		BodytypecomboBox_4.setBounds(198, 225, 136, 26);
		contentPane.add(BodytypecomboBox_4);
		BodytypecomboBox_4.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.Bodytype= (String) e.getItem(); 

			}
		});
		
		
		
		JComboBox RegioncomboBox_5 = new JComboBox(Sara.Resience.Region);
		RegioncomboBox_5.setBounds(198, 266, 136, 26);
		contentPane.add(RegioncomboBox_5);
		RegioncomboBox_5.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.Reigon= (String) e.getItem(); 

			}
		});
		
		
		
		
		JRadioButton ServedrdbtnNewRadioButton_1 = new JRadioButton("Bother");
		ServedrdbtnNewRadioButton_1.setBounds(270, 296, 155, 29);
		contentPane.add(ServedrdbtnNewRadioButton_1);
		ServedrdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Served=true;
			}
		});
		
		
		
		
		JRadioButton ModestyrdbtnNewRadioButton_2 = new JRadioButton("Important");
		ModestyrdbtnNewRadioButton_2.setBounds(102, 440, 155, 29);
		contentPane.add(ModestyrdbtnNewRadioButton_2);
		ModestyrdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Modesty=true;
			}
		});
		
		
		
		
		JRadioButton KosherrdbtnImportant = new JRadioButton("Important");
		KosherrdbtnImportant.setBounds(102, 404, 155, 29);
		contentPane.add(KosherrdbtnImportant);
		KosherrdbtnImportant.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Kosher=true;
			}
		});
		
		
		
		
		
		JRadioButton ShabatrdbtnNewRadioButton_3 = new JRadioButton("Important");
		ShabatrdbtnNewRadioButton_3.setBounds(102, 368, 155, 29);
		contentPane.add(ShabatrdbtnNewRadioButton_3);
		ShabatrdbtnNewRadioButton_3.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Shabat=true;
			}
		});
		
		
		
		
		
		
		JComboBox ReligioncomboBox_6 = new JComboBox(Sara.religion.ReligoiusLevel);
		ReligioncomboBox_6.setBounds(99, 333, 235, 26);
		contentPane.add(ReligioncomboBox_6);
		ReligioncomboBox_6.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.Religion= (String) e.getItem(); 

			}
		});
		
		
		
		
		
		JLabel lblGambling = new JLabel("Gambling:");
		lblGambling.setBounds(265, 408, 94, 20);
		contentPane.add(lblGambling);
		
		
		
		
		JLabel lblSmoking = new JLabel("Smoking:");
		lblSmoking.setBounds(265, 444, 69, 20);
		contentPane.add(lblSmoking);
		
		JRadioButton DrinkingrdbtnNewRadioButton_4 = new JRadioButton("Bother");
		DrinkingrdbtnNewRadioButton_4.setBounds(359, 368, 155, 29);
		contentPane.add(DrinkingrdbtnNewRadioButton_4);
		DrinkingrdbtnNewRadioButton_4.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Drinking=true;
			}
		});
		
		
		JRadioButton GamblingrdbtnNewRadioButton_5 = new JRadioButton("Bother");
		GamblingrdbtnNewRadioButton_5.setBounds(359, 404, 155, 29);
		contentPane.add(GamblingrdbtnNewRadioButton_5);
		GamblingrdbtnNewRadioButton_5.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Gambling=true;
			}
		});
		
		
		
		
		
		JRadioButton SmokingrdbtnNewRadioButton_6 = new JRadioButton("Bother");
		SmokingrdbtnNewRadioButton_6.setBounds(359, 440, 155, 29);
		contentPane.add(SmokingrdbtnNewRadioButton_6);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if (Mosses.lookingfor==Mosses.Sex)
					JOptionPane.showMessageDialog(null, "The system does not support matchmaking between two people of the same gender, please try again");
				
				MatchMaking.Match(Mosses);
				
				
				
				//Menu frame3 = new Menu();
				//frame3.setVisible(true);
				//ReverseInputPanel.frame2.setVisible(false);
			}
		});
		btnNewButton.setBounds(788, 440, 115, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblIAm = new JLabel("I am:");
		lblIAm.setBounds(15, 16, 69, 20);
		contentPane.add(lblIAm);
		
		JComboBox Gender1_comboBox = new JComboBox(Sara.Sex);
		Gender1_comboBox.setBounds(69, 13, 106, 26);
		contentPane.add(Gender1_comboBox);
		Gender1_comboBox.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.Sex= (String) e.getItem(); 

			}
		});
		
		
		
		
		
		JLabel lblLookingFor = new JLabel("Looking for:");
		lblLookingFor.setBounds(198, 16, 92, 20);
		contentPane.add(lblLookingFor);
		
		JComboBox Gender2_comboBox_1 = new JComboBox(Sara.Sex);
		Gender2_comboBox_1.setBounds(298, 13, 115, 26);
		contentPane.add(Gender2_comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setForeground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 918, 485);
		contentPane.add(panel);
		Gender2_comboBox_1.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
		Mosses.lookingfor= (String) e.getItem(); 

			}
		});
		
		
		
		
		SmokingrdbtnNewRadioButton_6.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				Mosses.Smoking=true;
			}
		});
		
		
		
	}
}
