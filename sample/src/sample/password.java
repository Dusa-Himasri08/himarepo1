package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class password {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					password window = new password();
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
	public password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("loginpage");
		lblNewLabel.setBounds(175, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(87, 69, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel p1 = new JLabel("password");
		p1.setBounds(87, 130, 46, 14);
		frame.getContentPane().add(p1);
		
		tb1 = new JTextField();
		tb1.setBounds(199, 66, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=tb2.getText();
				try {
					java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					PreparedStatement stn=con.prepareStatement
							("select name,password from users where name=? and password=?");
					stn.setString(1, name);
					stn.setString(2,password);
					ResultSet rs=stn.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(btnNewButton, "valid user");
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "invalid user");
					}
				}
				  catch(SQLException e1)
				  
				 {
					  e1.printStackTrace();
					  
				 }
			}
		});
		btnNewButton.setBounds(132, 213, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb2 = new JPasswordField();
		tb2.setBounds(199, 127, 86, 20);
		frame.getContentPane().add(tb2);
	}
}
