package exercicio_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Exercicio1 {

	private JFrame frmExercicio;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 window = new Exercicio1();
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
	public Exercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExercicio = new JFrame();
		frmExercicio.getContentPane().setBackground(new Color(128, 128, 255));
		frmExercicio.setTitle("Exercício 01");
		frmExercicio.setBounds(100, 100, 450, 300);
		frmExercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExercicio.getContentPane().setLayout(null);
		
		JLabel lbNum1 = new JLabel("Número 1:");
		lbNum1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbNum1.setBounds(51, 46, 187, 39);
		frmExercicio.getContentPane().add(lbNum1);
		
		JLabel lbNum2 = new JLabel("Número 2:");
		lbNum2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbNum2.setBounds(51, 119, 187, 39);
		frmExercicio.getContentPane().add(lbNum2);
		
		JTextField txtNum1 = new JTextField();
		txtNum1.setBounds(193, 59, 187, 20);
		frmExercicio.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		JTextField txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(193, 132, 187, 20);
		frmExercicio.getContentPane().add(txtNum2);
		
		JButton btnBotaoSoma= new JButton("Calcular soma!");
		btnBotaoSoma.setBounds(258, 184, 122, 23);
		frmExercicio.getContentPane().add(btnBotaoSoma);
		
		JButton btnAbrir = new JButton("Abrir tela!");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundaTela st = new segundaTela();
				st.setVisible(true);
				
				
			}
		});
		btnAbrir.setBounds(49, 194, 89, 23);
		frmExercicio.getContentPane().add(btnAbrir);
		btnBotaoSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1 = Float.parseFloat(txtNum1.getText());
				float num2 = Float.parseFloat(txtNum2.getText());
				
				float soma = num1 + num2;
				JOptionPane.showMessageDialog(null, "A soma dos dois números é: "+soma);
			}
		});
	}
}
				