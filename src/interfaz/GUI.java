package interfaz;
import javax.swing.*;

import gui.RodriWindow;
import planner.ScheduleParser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import controlesPatio.Task;

public class GUI extends JFrame {
	private JTextArea textArea;
	private JButton button2;
	
	public PatioWindow() {
		setTitle("Patio caso #1");
        setSize(500, 600); // Set the desired size
        setResizable(false); // Disable frame resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(50, 60);
        
        JLabel label = new JLabel("Patio");
        label.setFont(new Font("Arial", Font.BOLD, 18)); // Set font and size
        
        label.setBounds(130, 10, 100, 40);

        // Add label to the frame's content pane
        getContentPane().setLayout(null);
        getContentPane().add(label);
        
        textArea = new JTextArea();
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        Rectangle textAreaBounds = new Rectangle(60, 60, 180, 200);
        textArea.setBounds(textAreaBounds);
        
        // Add text area to the frame's content pane
        getContentPane().add(textArea);    
        
        JButton button1 = new JButton("Inicio");
     

        // Define positions for the buttons
        button1.setBounds(100, 280, 100, 50);
        

        // Add buttons to the frame's content pane
        getContentPane().add(button1);
        

        // Set null layout
        getContentPane().setLayout(null);

        // Add onClick event listeners to the buttons
        button1.addActionListener(e -> decirHola());
       	
    }
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> {
			RodriWindow frame = new RodriWindow();
	        frame.setVisible(true);
	    });
	}
	
	private void decirHola() {
		textArea.setText("Plantas con plagas");
	}
	
	
}