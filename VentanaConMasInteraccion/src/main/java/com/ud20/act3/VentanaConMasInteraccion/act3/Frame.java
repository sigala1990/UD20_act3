package com.ud20.act3.VentanaConMasInteraccion.act3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private int count1, count2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_btn1 = new JLabel("Boton 1: 0 veces");
		lbl_btn1.setBounds(40, 11, 116, 14);
		contentPane.add(lbl_btn1);
		
		JLabel lbl_btn2 = new JLabel("Boton 2: 0 veces");
		lbl_btn2.setBounds(166, 11, 116, 14);
		contentPane.add(lbl_btn2);
		
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count1++;
				lbl_btn1.setText("Boton 1: "+count1+" veces");
			}
		});
		btn1.setBounds(40, 40, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count2++;
				lbl_btn2.setText("Boton 1: "+count2+ " veces");
			}
		});
		btn2.setBounds(166, 40, 89, 23);
		contentPane.add(btn2);
		

	}
}
