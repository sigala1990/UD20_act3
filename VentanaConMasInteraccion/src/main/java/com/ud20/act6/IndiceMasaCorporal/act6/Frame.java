package com.ud20.act6.IndiceMasaCorporal.act6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField tf_altura,tf_peso,tf_imc;

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

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_altura = new JLabel("Altura(metros)");
		lbl_altura.setBounds(51, 44, 103, 14);
		contentPane.add(lbl_altura);
		
		JLabel lbl_peso = new JLabel("Peso(kg)");
		lbl_peso.setBounds(260, 44, 46, 14);
		contentPane.add(lbl_peso);
		
		JLabel lbl_imc = new JLabel("IMC");
		lbl_imc.setBounds(196, 84, 46, 14);
		contentPane.add(lbl_imc);
		
		JButton btn_calcular = new JButton("Calcular IMC");
		btn_calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_imc.setText(String.valueOf(calcularIMC()));
			}
		});
		btn_calcular.setBounds(51, 80, 135, 23);
		contentPane.add(btn_calcular);
		
		tf_altura = new JTextField();
		tf_altura.setBounds(164, 41, 86, 20);
		contentPane.add(tf_altura);
		tf_altura.setColumns(10);
		
		tf_peso = new JTextField();
		tf_peso.setColumns(10);
		tf_peso.setBounds(306, 41, 86, 20);
		contentPane.add(tf_peso);
		
		tf_imc = new JTextField();
		tf_imc.setEditable(false);
		tf_imc.setColumns(10);
		tf_imc.setBounds(220, 81, 86, 20);
		contentPane.add(tf_imc);
	}

	
	public double calcularIMC() {
		try {
			double altura = (double) Math.pow(Double.parseDouble (tf_altura.getText()),2);
			double peso = Double.parseDouble(tf_peso.getText());
			return peso / altura;	
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Valor introducido no es un numero");
			return 0.0;
		}
		
	}
}
