package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class registration {

	private JFrame frmRegistrationForm;
	private JTextField tb1;
	private JTextField tb2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrationForm = new JFrame();
		frmRegistrationForm.setForeground(new Color(128, 0, 255));
		frmRegistrationForm.setResizable(false);
		frmRegistrationForm.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online lab\\Desktop\\R ICON.png"));
		frmRegistrationForm.setTitle("REGISTRATION FORM");
		frmRegistrationForm.setBounds(100, 100, 450, 300);
		frmRegistrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrationForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION FORM");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(75, 11, 224, 14);
		frmRegistrationForm.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(35, 59, 46, 14);
		frmRegistrationForm.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ROLL NO:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(33, 84, 81, 14);
		frmRegistrationForm.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(35, 109, 94, 14);
		frmRegistrationForm.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GENDER:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(35, 141, 79, 14);
		frmRegistrationForm.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PROG LANGS:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(35, 173, 96, 14);
		frmRegistrationForm.getContentPane().add(lblNewLabel_6);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(128, 0, 255));
		tb1.setBounds(150, 58, 113, 20);
		frmRegistrationForm.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setForeground(new Color(128, 0, 255));
		tb2.setBounds(150, 83, 113, 20);
		frmRegistrationForm.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setForeground(new Color(128, 0, 255));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"NOT SELECTED", "CSE", "IT", "MNINIG", "ECE", "MECH"}));
		cb1.setBounds(150, 107, 113, 22);
		frmRegistrationForm.getContentPane().add(cb1);
		
		JRadioButton rb1 = new JRadioButton("MALE");
		buttonGroup.add(rb1);
		rb1.setForeground(new Color(128, 0, 255));
		rb1.setBounds(150, 139, 113, 23);
		frmRegistrationForm.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("FEMALE");
		buttonGroup.add(rb2);
		rb2.setForeground(new Color(128, 0, 255));
		rb2.setBounds(272, 139, 113, 23);
		frmRegistrationForm.getContentPane().add(rb2);
		
		JCheckBox ckb1 = new JCheckBox("PYTHON");
		ckb1.setForeground(new Color(128, 0, 255));
		ckb1.setBounds(150, 171, 113, 23);
		frmRegistrationForm.getContentPane().add(ckb1);
		
		JCheckBox ckb2 = new JCheckBox("JAVA\r\n");
		ckb2.setForeground(new Color(128, 0, 255));
		ckb2.setBounds(272, 171, 113, 23);
		frmRegistrationForm.getContentPane().add(ckb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String rollno = tb2.getText();
				String branch = (String) cb1.getSelectedItem();
				String gender = rb1.isSelected() ? rb1.getText() : rb2.isSelected() ? rb2.getText() : "NOT SELECTED";
				String proglang = "";
				if (ckb1.isSelected()){
					proglang += " "+ckb1.getText();
				}
				if (ckb2.isSelected()){
					proglang += " "+ckb2.getText();

				}
				
				JOptionPane.showMessageDialog(btnNewButton, " NAME: "+name+"\n ROLL NO: "+rollno+"\n BRANCH: "+branch+"\n GENDER: "+gender+"\n PROG LANG: "+proglang);
				

			}
		});
		btnNewButton.setForeground(new Color(128, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(150, 212, 89, 23);
		frmRegistrationForm.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\bg.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frmRegistrationForm.getContentPane().add(lblNewLabel);
		frmRegistrationForm.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmRegistrationForm.getContentPane(), lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, tb1, tb2, cb1, rb1, rb2, ckb1, ckb2, lblNewLabel, lblNewLabel_1, btnNewButton}));
	}
}
