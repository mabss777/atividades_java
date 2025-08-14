package exercicio_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Exercicio_2 {

	private JFrame frmExercicio;
	private JTextField txtNum1;
	private JTextField txtNum2;
	
	double  num1, num2, calculo;
	private JTextField txtResultado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_2 window = new Exercicio_2();
					window.frmExercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExercicio = new JFrame();
		frmExercicio.getContentPane().setBackground(new Color(180, 180, 180));
		frmExercicio.setTitle("Exercício 2");
		frmExercicio.setBounds(100, 100, 1027, 563);
		frmExercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExercicio.getContentPane().setLayout(null);
		
		JLabel lbNum1 = new JLabel("Número 1:");
		lbNum1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lbNum1.setBounds(43, 11, 91, 26);
		frmExercicio.getContentPane().add(lbNum1);
		
		JLabel lbNum2 = new JLabel("Número 2:");
		lbNum2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lbNum2.setBounds(43, 48, 91, 26);
		frmExercicio.getContentPane().add(lbNum2);
		
		JLabel lblResultado = new JLabel("Resultado da ...:");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setBounds(43, 166, 276, 23);
		frmExercicio.getContentPane().add(lblResultado);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(158, 11, 179, 20);
		frmExercicio.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(158, 54, 179, 20);
		frmExercicio.getContentPane().add(txtNum2);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtResultado.setColumns(10);
		txtResultado.setBounds(79, 209, 343, 60);
		frmExercicio.getContentPane().add(txtResultado);
		
		JButton btnSoma = new JButton("SOMA");
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txtNum1.getText());
				num2 = Double.parseDouble(txtNum2.getText());
				calculo = num1 + num2;
				
				lblResultado.setText("Resultado da Soma:");
				txtResultado.setText(String.format("%.2f", calculo));
			}
		});
		btnSoma.setBounds(601, 108, 262, 35);
		frmExercicio.getContentPane().add(btnSoma);
		
		JButton btnSubtracao = new JButton("SUBTRAÇÃO");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txtNum1.getText());
				num2 = Double.parseDouble(txtNum2.getText());
				calculo = num1 - num2;
				
				lblResultado.setText("Resultado da Subtração:");
				txtResultado.setText(String.format("%.2f", calculo));
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubtracao.setBounds(601, 154, 262, 35);
		frmExercicio.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("MULTIPLICAÇÃO");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txtNum1.getText());
				num2 = Double.parseDouble(txtNum2.getText());
				calculo = num1 * num2;
				
				lblResultado.setText("Resultado da Multiplicação:");
				txtResultado.setText(String.format("%.2f", calculo));
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMultiplicacao.setBounds(601, 62, 262, 35);
		frmExercicio.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("DIVISÃO");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(txtNum1.getText());
				num2 = Double.parseDouble(txtNum2.getText());
				calculo = num1 / num2;
				
				lblResultado.setText("Resultado da Divisão:");
				txtResultado.setText(String.format("%.2f", calculo));
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDivisao.setBounds(601, 16, 262, 35);
		frmExercicio.getContentPane().add(btnDivisao);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(601, 246, 262, 35);
		frmExercicio.getContentPane().add(btnSair);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum1.setText("");
				txtNum2.setText("");
				txtResultado.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.setBounds(601, 200, 261, 35);
		frmExercicio.getContentPane().add(btnLimpar);
		
		JTextArea txtrAreaDeTexto = new JTextArea();
		txtrAreaDeTexto.setText("Area de texto");
		txtrAreaDeTexto.setBounds(67, 296, 337, 80);
		frmExercicio.getContentPane().add(txtrAreaDeTexto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem() == "feijão") {
					frmExercicio.getContentPane().setBackground(Color.black);
				}
				if (comboBox.getSelectedItem() == "macarrão") {
					frmExercicio.getContentPane().setBackground(Color.orange);
				}
				if(comboBox.getSelectedItem() == "arroz") {
					frmExercicio.getContentPane().setBackground(Color.white);
				}
				if(comboBox.getSelectedItem() == "tomate") {
					frmExercicio.getContentPane().setBackground(Color.red);
				}
				if (comboBox.getSelectedItem() == "alface") {
					frmExercicio.getContentPane().setBackground(Color.green);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"feijão", "macarrão", "arroz", "alface", "milho", "lentilha", "tomate"}));
		comboBox.setBounds(676, 321, 159, 26);
		frmExercicio.getContentPane().add(comboBox);
		
		JButton btnMudar = new JButton("Mudar de cor");
		btnMudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem() == "feijão") {
					frmExercicio.getContentPane().setBackground(Color.black);
				}
				if (comboBox.getSelectedItem() == "macarrão") {
					frmExercicio.getContentPane().setBackground(Color.orange);
				}
				if(comboBox.getSelectedItem() == "arroz") {
					frmExercicio.getContentPane().setBackground(Color.white);
				}
				if(comboBox.getSelectedItem() == "tomate") {
					frmExercicio.getContentPane().setBackground(Color.red);
				}
				if (comboBox.getSelectedItem() == "alface") {
					frmExercicio.getContentPane().setBackground(Color.green);
				}
			}
		});
		btnMudar.setBounds(497, 403, 338, 23);
		frmExercicio.getContentPane().add(btnMudar);
	}
}
