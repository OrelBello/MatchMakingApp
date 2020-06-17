package Vie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Vie.MyView;

import java.awt.Font;
import java.awt.Frame;
import javax.swing.SpringLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReverseInputPanel extends JPanel implements ActionListener{

	protected JButton b1;
	protected MyView gui;
	public static ReverseInputPanel frame0;
	public static G_U_I frame;
	public static SecondWindow frame1;
	public static ThirdWindow frame2;
	public static Menu frame3;
	public static ShowOwnProfile frame4;
	public static ShowProfile frame5;
	public static Preferences frame6;
	
	
	public ReverseInputPanel(MyView gui) {
		this.gui = gui;
		b1 = new JButton("Enter");
		b1.addActionListener(this);
		add(b1);
	}
	public void actionPerformed(ActionEvent e) {		
		//gui.setUserInput(input.getText());
		frame = new G_U_I();
		frame.setVisible(true);
		MyView.frame.setVisible(false);
	}
	
}