package atividade_CartaoDeVisitas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frmAtividade;
	private JTextField txtMensagem;
	private JTable tbNumCod;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmAtividade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAtividade = new JFrame();
		frmAtividade.getContentPane().setBackground(new Color(155, 155, 155));
		frmAtividade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAtividade.setTitle("Atividade");
		frmAtividade.setBounds(100, 100, 588, 565);
		frmAtividade.getContentPane().setLayout(null);
		
		JLabel lblMensagem = new JLabel("Digite uma Mensagem:");
		lblMensagem.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 14));
		lblMensagem.setBounds(10, 68, 154, 20);
		frmAtividade.getContentPane().add(lblMensagem);
		
		txtMensagem = new JTextField();
		txtMensagem.setBounds(10, 91, 241, 20);
		frmAtividade.getContentPane().add(txtMensagem);
		txtMensagem.setColumns(10);
		
		JButton btnMensagem = new JButton("Mostra a mensagem");
		btnMensagem.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 11));
		btnMensagem.setForeground(new Color(0, 0, 0));
		btnMensagem.setBackground(new Color(173, 166, 208));
		btnMensagem.setBounds(10, 122, 154, 23);
		frmAtividade.getContentPane().add(btnMensagem);
		
		JComboBox cbCorPagina = new JComboBox();
		cbCorPagina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbCorPagina.getSelectedItem() == "amarelo") {
					frmAtividade.getContentPane().setBackground(Color.YELLOW);
				}
				if(cbCorPagina.getSelectedItem() == "vermelho") {
					frmAtividade.getContentPane().setBackground(Color.RED);
				}
				if(cbCorPagina.getSelectedItem() == "azul") {
					frmAtividade.getContentPane().setBackground(Color.BLUE);
				}
				if(cbCorPagina.getSelectedItem() == "rosa") {
					frmAtividade.getContentPane().setBackground(Color.YELLOW);
				}
				
				if(cbCorPagina.getSelectedItem() == "preto") {
					frmAtividade.getContentPane().setBackground(Color.BLACK);
				}
				if(cbCorPagina.getSelectedItem() == "verde") {
					frmAtividade.getContentPane().setBackground(Color.GREEN);
				}
				if(cbCorPagina.getSelectedItem() == "cinza") {
					frmAtividade.getContentPane().setBackground(Color.GRAY);
				}
				if(cbCorPagina.getSelectedItem() == "branco") {
					frmAtividade.getContentPane().setBackground(Color.WHITE);
				}
			}
		});
		cbCorPagina.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 11));
		cbCorPagina.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma cor:", "amarelo", "vermelho", "azul", "rosa", "roxo", "preto", "branco", "marrom", "verde", "cinza"}));
		cbCorPagina.setBounds(321, 129, 241, 23);
		frmAtividade.getContentPane().add(cbCorPagina);
		
		tbNumCod = new JTable();
		tbNumCod.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 11));
		tbNumCod.setBorder(new LineBorder(new Color(0, 0, 0)));
		tbNumCod.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"C\u00F3digo", "Nome"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbNumCod.setBounds(309, 11, 253, 101);
		JScrollPane scrollPane = new JScrollPane(tbNumCod);
		scrollPane.setBounds(294,11,268,107);
		frmAtividade.getContentPane().add(scrollPane);
		
		JCheckBox ckbJornal = new JCheckBox("Jornal");
		buttonGroup.add(ckbJornal);
		ckbJornal.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		ckbJornal.setBounds(10, 206, 97, 23);
		frmAtividade.getContentPane().add(ckbJornal);
		
		JCheckBox ckbRevista = new JCheckBox("Revista");
		buttonGroup.add(ckbRevista);
		ckbRevista.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		ckbRevista.setBounds(10, 232, 97, 23);
		frmAtividade.getContentPane().add(ckbRevista);
		
		JCheckBox ckbCdDvd = new JCheckBox("CD / DVD");
		buttonGroup.add(ckbCdDvd);
		ckbCdDvd.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		ckbCdDvd.setBounds(10, 258, 97, 23);
		frmAtividade.getContentPane().add(ckbCdDvd);
		
		JButton btnItens = new JButton("Itens Selecionados");
		btnItens.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 11));
		btnItens.setBounds(113, 232, 138, 23);
		frmAtividade.getContentPane().add(btnItens);
		
		JList lista1 = new JList();
		lista1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 14));
		lista1.setForeground(new Color(255, 255, 255));
		lista1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Teclado", "Mouse", "Monitor", "Cpu"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lista1.setBackground(new Color(168, 68, 158));
		lista1.setBounds(294, 195, 118, 139);
		frmAtividade.getContentPane().add(lista1);
		
		JList lista2 = new JList();
		lista2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 14));
		lista2.setForeground(new Color(255, 255, 255));
		lista2.setBackground(new Color(173, 166, 208));
		lista2.setBounds(422, 195, 121, 139);
		frmAtividade.getContentPane().add(lista2);
		
		JButton btnConfirma = new JButton("Confirma!");
		btnConfirma.setBounds(378, 345, 89, 23);
		frmAtividade.getContentPane().add(btnConfirma);
		
		JRadioButton rbMasc = new JRadioButton("Masculino");
		rbMasc.setBounds(6, 390, 78, 23);
		frmAtividade.getContentPane().add(rbMasc);
		
		JRadioButton rbFem = new JRadioButton("Feminino");
		rbFem.setBounds(6, 423, 78, 23);
		frmAtividade.getContentPane().add(rbFem);
		
		JTextArea txtaFemMasc = new JTextArea();
		txtaFemMasc.setBackground(new Color(128, 128, 255));
		txtaFemMasc.setBounds(99, 389, 188, 63);
		frmAtividade.getContentPane().add(txtaFemMasc);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setBackground(new Color(255, 51, 66));
		btnSair.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 19));
		btnSair.setBounds(336, 470, 186, 23);
		frmAtividade.getContentPane().add(btnSair);
		
		JMenuBar menuBar = new JMenuBar();
		frmAtividade.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JCheckBox ckbAbrirMensg = new JCheckBox("Abrir Mensagem");
		buttonGroup_1.add(ckbAbrirMensg);
		mnNewMenu.add(ckbAbrirMensg);
		
		JCheckBox ckb = new JCheckBox("New check box");
		buttonGroup_1.add(ckb);
		mnNewMenu.add(ckb);
		
		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_1);
		
		JLabel lblNewLabel = new JLabel("SOCORRO");
		mnNewMenu_1.add(lblNewLabel);
	}
}
