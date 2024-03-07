package sample;
//hi
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
//hello
public class Movie {

	private JFrame frmMovie;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Movie window = new Movie();
					window.frmMovie.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMovie = new JFrame();
		frmMovie.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online lab\\Desktop\\free-movie-icon-850-thumb.png"));
		frmMovie.setTitle("MOVIE");
		frmMovie.setBounds(100, 100, 450, 300);
		frmMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMovie.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE BOOKING APP");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(72, 11, 228, 14);
		frmMovie.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(49, 57, 67, 14);
		frmMovie.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(255, 0, 0));
		tb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tb1.setBounds(179, 56, 86, 20);
		frmMovie.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MOVIE NAME:");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(49, 92, 86, 14);
		frmMovie.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NO OF TICKETS: ");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(49, 132, 106, 17);
		frmMovie.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setForeground(new Color(255, 0, 0));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "SAI KUMAR", "AFFTAB", "SRIDHAR", "MATRIX"}));
		cb1.setBounds(179, 90, 86, 22);
		frmMovie.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setForeground(new Color(255, 0, 0));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(179, 131, 86, 22);
		frmMovie.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				if (!( cb1.getSelectedItem() == "SELECT" || cb2.getSelectedItem() == "0")) {

				String name = tb1.getText();
				String movie = (String) cb1.getSelectedItem();
				String ntickets = (String) cb2.getSelectedItem();
				int tickets = Integer.parseInt(ntickets);
				int bill = 0;
				
				if(movie.equals("RRR")) {
					bill = bill + 150 * tickets;
				}
				if(movie.equals("SAI KUMAR")) {
					bill = bill + 150 * tickets;
				}
				if(movie.equals("AFFTAB")) {
					bill = bill + 150 * tickets;
				}
				if(movie.equals("SRIDHAR")) {
					bill = bill + 150 * tickets;
				}
				if(movie.equals("MATRIX")) {
					bill = bill + 150 * tickets;
				}

			
				
				int res = JOptionPane.showConfirmDialog(btnNewButton, "NAME: "+name+"\n MOVIE: "+movie+"\n NUMBER OF TICKETS: "+tickets+"\n AMOUNT: "+bill);
				if (res == 0) {
					JOptionPane.showMessageDialog(btnNewButton, "booking comfirmed");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "booking cancelled");
				}
			}
			}
			
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(126, 201, 89, 23);
		frmMovie.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\BLACK.jpg"));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frmMovie.getContentPane().add(lblNewLabel);
	}
}
