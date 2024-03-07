package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Student_registration {

	private JFrame frmRegistrationForm;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_registration window = new Student_registration();
					window.frmRegistrationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrationForm = new JFrame();
		frmRegistrationForm.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online lab\\Desktop\\ICON.png"));
		frmRegistrationForm.setTitle("REGISTRATION FORM");
		frmRegistrationForm.setBounds(100, 100, 450, 300);
		frmRegistrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrationForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION FORM");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(107, 11, 179, 22);
		frmRegistrationForm.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(115, 63, 19, 17);
		frmRegistrationForm.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(168, 63, 144, 20);
		frmRegistrationForm.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NAME:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(94, 113, 40, 17);
		frmRegistrationForm.getContentPane().add(lblNewLabel_3);
		
		tb2 = new JTextField();
		tb2.setBounds(168, 113, 144, 20);
		frmRegistrationForm.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(77, 164, 57, 17);
		frmRegistrationForm.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "MECH", "ECE"}));
		cb1.setBounds(168, 163, 144, 22);
		frmRegistrationForm.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll = tb1.getText();
				int id = Integer.parseInt(roll);
				String name = tb2.getText();
				String branch = (String) cb1.getSelectedItem();
				try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
				String q = "insert into students values('"+id+"','"+name+"','"+branch+"')";
				Statement stn = con.createStatement();
				stn.executeUpdate(q);
				JOptionPane.showMessageDialog(btnNewButton, "record inserted");
				con.close();
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(179, 209, 89, 23);
		frmRegistrationForm.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\BLACK.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frmRegistrationForm.getContentPane().add(lblNewLabel);
	}
}
