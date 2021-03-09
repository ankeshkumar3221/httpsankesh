package com.FILE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DISPLAY extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DISPLAY frame = new DISPLAY();
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
	public DISPLAY() {
		setBackground(UIManager.getColor("Button.shadow"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 351);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPANY LOCKER Pvt Ltd.");
		lblNewLabel.setFont(new Font("Century Schoolbook L", Font.BOLD, 35));
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 206, 209));
		lblNewLabel.setBounds(72, 12, 713, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Devlop by TEKsystems global services");
		lblNewLabel_1.setBounds(324, 65, 292, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(UIManager.getColor("Button.shadow"));
		Image img = new ImageIcon(this.getClass().getResource("/FILE.jpeg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(640, 12, 241, 292);
		contentPane.add(lblNewLabel_2);
		
		JButton current = new JButton("SEARCH");
		current.setToolTipText("Show Current File");
		current.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentFile show = new CurrentFile();
				show.setVisible(true);
			}
		});
		current.setBackground(new Color(0, 191, 255));
		current.setBounds(36, 161, 117, 45);
		contentPane.add(current);
		
		JButton add = new JButton("ADD ");
		add.setToolTipText("Add File");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddFile add= new AddFile();
				add.setVisible(true);
				
			}
		});
		add.setBackground(new Color(176, 224, 230));
		add.setBounds(209, 161, 117, 45);
		contentPane.add(add);
		
		JButton delete = new JButton("DELETE");
		delete.setToolTipText("Delete File\n");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DELETE show = new DELETE();
				show.setVisible(true);
			}
		});
		delete.setBackground(new Color(211, 211, 211));
		delete.setBounds(36, 232, 117, 45);
		contentPane.add(delete);
		
		JLabel lblNewLabel_3 = new JLabel("Choose a function");
		lblNewLabel_3.setFont(new Font("Abyssinica SIL", Font.BOLD, 25));
		lblNewLabel_3.setBounds(42, 105, 284, 32);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("CLOSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("CLOSE");
				if(JOptionPane.showConfirmDialog(frame, "confirm if you want to close", "close" , 
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton.setBounds(182, 234, 144, 43);
		contentPane.add(btnNewButton);
		
	}
}
