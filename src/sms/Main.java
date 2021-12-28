package sms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(25, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	    JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton("Add student record");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Add student results");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("View records");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				viewRecords records = new viewRecords();
				contentPane.add(records);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("View results");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				viewResults results = new viewResults();
				contentPane.add(results);
			}
		});
		panel.add(btnNewButton);
		
		viewRecords records = new viewRecords();
		contentPane.add(records);
		
		//addResults add = new addResults();
		//contentPane.add(add);

		//addRecord addrec = new addRecord();
		//contentPane.add(addrec);

		//viewResults results = new viewResults();
		//contentPane.add(results);

	}
}
