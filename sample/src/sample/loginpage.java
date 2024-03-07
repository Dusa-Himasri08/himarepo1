package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class loginpage {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("loginpage");
		lblNewLabel.setBounds(149, 27, 74, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(89, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(76, 117, 74, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(160, 76, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton textbutton = new JButton("login");
		textbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			  
			  String name=tb1.getText();
              String password=p1.getText();
              if(name.equals("hemanth")   && password.equals("1234"))
              {
            	  JOptionPane.showMessageDialog(textbutton,"valid login");
              }
              else
              {
            	  JOptionPane.showMessageDialog(textbutton,"invalid login");
              }
              }
		});
		textbutton.setBounds(114, 170, 89, 20);
		frame.getContentPane().add(textbutton);
		
		p1 = new JPasswordField();
		p1.setBounds(170, 114, 76, 20);
		frame.getContentPane().add(p1);
	}
}
