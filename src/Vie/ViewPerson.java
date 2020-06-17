package Vie;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ViewPerson extends JFrame {

	private JPanel contentPane;
	JTextArea textAreaPerson;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ViewPerson frame = new ViewPerson();
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
	public ViewPerson() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAreaPerson = new JTextArea();
		textAreaPerson.append(ReverseInputPanel.frame.Human.Sex_Choice+ReverseInputPanel.frame.Human.Language.LangChoice+ReverseInputPanel.frame.Human.education.SubjectChoice+
		ReverseInputPanel.frame.Human.job.Field+ReverseInputPanel.frame.Human.looks.BodyTypeChoice+
		ReverseInputPanel.frame.Human.name.FirstName+ReverseInputPanel.frame.Human.name.LastName+
		ReverseInputPanel.frame.Human.personal.astrological_sign_Choice+ReverseInputPanel.frame.Human.ratedValues.OptionsChoice+
		ReverseInputPanel.frame.Human.religion.ReligoiusLevelChoice+ReverseInputPanel.frame.Human.Resience.Cities+
		ReverseInputPanel.frame.Human.service.Profession+ReverseInputPanel.frame.Human.Resience.Cities+ReverseInputPanel.frame.Human.service.CatagoryChoice);
	
		

		textAreaPerson.setEditable(false);
		textAreaPerson.setBounds(15, 16, 889, 452);
		contentPane.add(textAreaPerson);
	}
}
