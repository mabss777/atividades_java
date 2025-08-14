package exercicio_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class exemploJlist {

	private JFrame frmJList;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exemploJlist window = new exemploJlist();
					window.frmJList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exemploJlist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJList = new JFrame();
		frmJList.setTitle("J List");
		frmJList.setBounds(100, 100, 1219, 565);
		frmJList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJList.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Monitor", "Teclado", "NoteBook", "Mouse"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setForeground(new Color(255, 255, 255));
		list.setBackground(new Color(255, 0, 128));
		list.setBounds(52, 11, 121, 149);
		frmJList.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setForeground(new Color(255, 255, 255));
		list_1.setBackground(new Color(128, 0, 255));
		list_1.setBounds(285, 11, 121, 149);
		frmJList.getContentPane().add(list_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(249, 171, 157, 134);
		frmJList.getContentPane().add(panel_1);
		
		JRadioButton rbPraia = new JRadioButton("Praia");
		buttonGroup_1.add(rbPraia);
		rbPraia.setBounds(6, 7, 109, 23);
		panel_1.add(rbPraia);
		
		JRadioButton rbCampo = new JRadioButton("Campo");
		buttonGroup_1.add(rbCampo);
		rbCampo.setBounds(6, 55, 109, 23);
		panel_1.add(rbCampo);
		
		JButton btnSelecionar = new JButton("Selecione!");
		btnSelecionar.setBounds(23, 100, 108, 23);
		panel_1.add(btnSelecionar);
		btnSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbPraia.isSelected() == true) {
					JOptionPane.showMessageDialog(null, "A praia foi selecionada!");
				}
				if(rbCampo.isSelected() == true) {
					JOptionPane.showMessageDialog(null,"O campo foi selecionado!");
				}
			}
		});
		
		JButton btnNewButton = new JButton("Confirmar!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel dlm = new DefaultListModel();
				list_1.setModel(dlm);
				list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				
				for(Iterator it = list.getSelectedValuesList().iterator(); it.hasNext(); ) {
					String itemSelecionado = (String) it.next();
					if(!dlm.contains(itemSelecionado)) {
						dlm.addElement(itemSelecionado);
					}
				}
				
				
			}
		});
		btnNewButton.setBounds(186, 70, 89, 23);
		frmJList.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(35, 171, 163, 134);
		frmJList.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Manhã");
		rdbtnNewRadioButton.setBounds(33, 7, 109, 23);
		panel.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarde");
		rdbtnNewRadioButton_1.setBounds(33, 52, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Noite");
		rdbtnNewRadioButton_2.setBounds(33, 96, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(443, 11, 228, 157);
		frmJList.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox ckbInstagram = new JCheckBox("Instagram");
		ckbInstagram.setBounds(19, 19, 97, 23);
		panel_2.add(ckbInstagram);
		
		JCheckBox ckbYoutube = new JCheckBox("YouTube");
		ckbYoutube.setBounds(19, 63, 97, 23);
		panel_2.add(ckbYoutube);
		
		JCheckBox ckbTikTok = new JCheckBox("Tik Tok");
		ckbTikTok.setBounds(19, 113, 97, 23);
		panel_2.add(ckbTikTok);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Nome", "Idade", "E-MAIL"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(443, 220, 324, 123);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(516,235,321,121);
		frmJList.getContentPane().add(scrollPane);
	}
}
