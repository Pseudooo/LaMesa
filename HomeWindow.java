package com.lamesa.ui;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
 
public class jFrame {
	
	public static void main(String[] args) {
		JFrame frame=new JFrame(); 
		frame.setTitle("JFrame Reg Demo");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		JPanel headingPanel = new JPanel();
		JLabel headingLabel = new JLabel("Heading of panel");
		headingPanel.add(headingLabel);
		
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constr = new GridBagConstraints(); 
		constr.insets = new Insets(5, 5, 5, 5);
		constr.anchor = GridBagConstraints.WEST;
		
		constr.gridx=0;
		constr.gridy=0;
		
		
		JLabel usernameLabel = New JLabel("Please enter your name...");
		JLabel passwordLabel = new JLabel("Please enter your password...");
		JLabel emailLabel = new JLabel("Please enter your email...");
		
		JTextField usernameText = new JTextField(24);
		JPasswordField passwordText = new JPasswordField(24);
		JTextField emailText = new JTextField(24);
		
	}
}

//public class HomeWindow extends JFrame {
//	
//	JFrame frame = new JFrame("Demo program for JFRame");
//
//	frame.setLayout(new GridLayout());
//	JTextField textFieldUserName = new JTextField(50);
//	frame.add(textFieldUsernameHere);
//
//	frame.getContentPane().add(Component);
//	add(textFieldUserName, BorderLayout.CENTER); 
//
//}

//public class SwingJFrameDemo extends javax.swing.JFrame {
//	public SwingJFrameDemo() {
//		super("Demo program");
//	}
//}


//public class HomeWindow extends JFrame{
//	JFrame frame = new JFrame("FrameUI");
//	JPanel panel = new JPanel();
//	panel.setLayout(new FlowLayout());
//	
//	JLabel label = new JLabel("JFrame Label");
//	
//	JButton button = new JButton();
//	button.setText("Exit");
//	
//	panel.add(label);
//	panel.add(button);
//	
//	frame.add(panel);
//	frame.setSize(300, 350);
//	frame.setLocationRelativeTo(null);
//	frame.setDefaultCloseOperations(JFrame.EXIT_ON_CLOSE);
//	frame.setVisible(true);
//}
