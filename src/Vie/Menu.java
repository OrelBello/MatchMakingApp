package Vie;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	Menu frame = new Menu();
				//	frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 919, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnViewMyProfile = new JButton("View my profile");
		btnViewMyProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ReverseInputPanel.frame4 = new ShowOwnProfile();
				ReverseInputPanel.frame4.setVisible(true);
				ReverseInputPanel.frame3.setVisible(false);
			}
		});
		btnViewMyProfile.setBounds(307, 187, 283, 49);
		panel.add(btnViewMyProfile);
		btnViewMyProfile.setFont(new Font("Arial Black", Font.BOLD, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(0, 249, 919, 236);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButtonSearchFilters = new JButton("Search");
		btnNewButtonSearchFilters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				ReverseInputPanel.frame5 = new ShowProfile();
				ReverseInputPanel.frame5.setVisible(true);
				ReverseInputPanel.frame3.setVisible(false);
				
				
				
			}
		});
		btnNewButtonSearchFilters.setBounds(316, 171, 283, 49);
		panel_1.add(btnNewButtonSearchFilters);
		btnNewButtonSearchFilters.setBackground(new Color(224, 255, 255));
		btnNewButtonSearchFilters.setFont(new Font("Arial Black", Font.BOLD, 16));
	}
}
