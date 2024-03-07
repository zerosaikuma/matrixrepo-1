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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Traval {

	private JFrame frmSaiTravels;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traval window = new Traval();
					window.frmSaiTravels.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Traval() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaiTravels = new JFrame();
		frmSaiTravels.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online lab\\Desktop\\m2i8K9G6N4d3K9Z5.jpg"));
		frmSaiTravels.setTitle("SAI TRAVELS");
		frmSaiTravels.setBounds(100, 100, 450, 300);
		frmSaiTravels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSaiTravels.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SAI TRAVELS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(168, 11, 107, 22);
		frmSaiTravels.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(62, 56, 50, 17);
		frmSaiTravels.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(189, 56, 131, 20);
		frmSaiTravels.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SOURCE:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(62, 93, 69, 17);
		frmSaiTravels.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBounds(189, 92, 131, 22);
		frmSaiTravels.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("DESTNATION:");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(62, 136, 94, 14);
		frmSaiTravels.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBounds(189, 134, 131, 22);
		frmSaiTravels.getContentPane().add(cb2);
		
		JLabel lblNewLabel_5 = new JLabel("NO OF TICKETS:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(62, 174, 102, 17);
		frmSaiTravels.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb3 = new JComboBox();
		cb3.setBounds(189, 173, 131, 22);
		frmSaiTravels.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("BOOK NOW!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String source = (String) cb1.getSelectedItem();
				String destination = (String) cb2.getSelectedItem();
				String nt = (String) cb3.getSelectedItem();
				int tickets = Integer.parseInt(nt);
				int bill = 0;
				if(source.equals(destination)) {
					JOptionPane.showMessageDialog(btnNewButton, "please check station");
				}
				else
				{
					bill = bill + 45*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "name");
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(140, 227, 135, 23);
		frmSaiTravels.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\BLACK.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frmSaiTravels.getContentPane().add(lblNewLabel);
	}

}
