package exercicio_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class exercicio_combobox {

	private JFrame frame;
	private JTextField txtMontadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio_combobox window = new exercicio_combobox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exercicio_combobox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 281, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblModelosPopBras = new JLabel("Modelos Populares Brasileiros");
		lblModelosPopBras.setForeground(new Color(0, 0, 255));
		lblModelosPopBras.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblModelosPopBras.setBounds(36, 11, 192, 14);
		frame.getContentPane().add(lblModelosPopBras);
		
		JLabel lblModPopBra = new JLabel("Modelo:");
		lblModPopBra.setBounds(21, 46, 46, 14);
		frame.getContentPane().add(lblModPopBra);
		
		JLabel lblMontadora = new JLabel("Montadora:");
		lblMontadora.setBounds(21, 120, 99, 14);
		frame.getContentPane().add(lblMontadora);
		
		txtMontadora = new JTextField();
		txtMontadora.setBounds(21, 154, 207, 20);
		frame.getContentPane().add(txtMontadora);
		txtMontadora.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem() == "Gol") {
					txtMontadora.setText("Volksvagem");
				}
				if (comboBox.getSelectedItem() == "Corsa") {
					txtMontadora.setText("Chevrolet");					
				}
				if(comboBox.getSelectedItem() == "Palio") {
					txtMontadora.setText("Fiat");
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gol", "Corsa", "Palio"}));
		comboBox.setBounds(21, 71, 219, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedIndex(0);
				txtMontadora.setText("");
			}
		});
		btnLimpar.setBounds(10, 207, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(139, 207, 89, 23);
		frame.getContentPane().add(btnSair);
		
		
	}
}
