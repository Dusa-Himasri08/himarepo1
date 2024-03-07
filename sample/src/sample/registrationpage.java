package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class registrationpage {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationpage window = new registrationpage();
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
	public registrationpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online\\Downloads\\bg blue.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(67, 63, 78, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Registration");
		lblNewLabel_1.setBounds(155, 11, 94, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(165, 60, 150, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Rollno");
		lblNewLabel_3.setBounds(67, 88, 40, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb2 = new JTextField();
		tb2.setBounds(165, 91, 150, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Branch");
		lblNewLabel_4.setBounds(67, 119, 40, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setBounds(67, 158, 41, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton g1 = new JRadioButton("Male");
		g1.setBounds(175, 171, 58, 14);
		frame.getContentPane().add(g1);
		
		JRadioButton g2 = new JRadioButton("Female");
		g2.setBounds(261, 170, 68, 20);
		frame.getContentPane().add(g2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 158, 216, 41);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Prog langs");
		lblNewLabel_6.setBounds(50, 204, 58, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		JCheckBox chbx1 = new JCheckBox("Python");
		chbx1.setBounds(165, 206, 84, 14);
		frame.getContentPane().add(chbx1);
		
		JCheckBox chbx2 = new JCheckBox("Java");
		chbx2.setBounds(274, 206, 97, 14);
		frame.getContentPane().add(chbx2);
        
        JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Choose", "CSE", "DS", "AIML", "IOT"}));
		cb1.setToolTipText("");
		cb1.setBounds(165, 119, 74, 28);
		frame.getContentPane().add(cb1);
		
		ButtonGroup brg=new ButtonGroup();
		brg.add(g1);
		brg.add(g2);
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String)cb1.getSelectedItem();
				String gender=" ";
				String languages=" ";
				if(g1.isSelected())
				{
					gender="male";
				}
				if(g2.isSelected())
				{
					gender="female";
				}
				if(chbx1.isSelected())
				{
					languages=languages+" Python ";
				}
				if(chbx2.isSelected())
				{
					languages=languages+" java ";
				}
                JOptionPane.showMessageDialog(btnNewButton_1, "Name "+name+"\nRollno "+rollno+"\nBranch "+branch+"\ngender "+gender+"\n languages"+languages);
				
			}
		});
		btnNewButton_1.setBounds(15, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\bg blue.png"));
		lblNewLabel.setBounds(0, 0, 444, 285);
		frame.getContentPane().add(lblNewLabel);
	}
}
