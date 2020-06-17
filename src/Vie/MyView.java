package Vie;

import java.util.Observable;

import javax.swing.JFrame;

import Vie.ReverseInputPanel;
import Vie.Vie;

public class MyView extends Observable implements Vie {

	private ReverseInputPanel inputPanel; 
	static JFrame frame;
	@Override
	public void start() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	protected void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("ButtonExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create and set up the content pane.
        inputPanel = new ReverseInputPanel(this);               
        frame.getContentPane().add(inputPanel);
        //Display the window.
        frame.pack();
        frame.setVisible(true);

		
	}

	

	


}
