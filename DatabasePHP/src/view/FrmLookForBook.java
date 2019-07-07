package view;

import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLookForBook {
    ScrollPane scrollPane;
	private JFrame frmTmXa;
	private JTextField txtTenSach;
	private JTable table;
	DefaultTableModel defaultTableModel ;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLookForBook window = new FrmLookForBook();
					window.frmTmXa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmLookForBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTmXa = new JFrame();
		frmTmXa.setTitle("T\u00ECm - x\u00F3a s\u00E1ch");
		frmTmXa.getContentPane().setBackground(UIManager.getColor("Button.highlight"));
		frmTmXa.setVisible(true);
		frmTmXa.setBounds(100, 100, 450, 300);
		frmTmXa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTmXa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn s\u00E1ch : ");
		lblNewLabel.setBounds(10, 45, 76, 14);
		frmTmXa.getContentPane().add(lblNewLabel);
		
		txtTenSach = new JTextField();
		txtTenSach.setBounds(109, 42, 267, 20);
		frmTmXa.getContentPane().add(txtTenSach);
		txtTenSach.setColumns(10);
		
		JButton btnNewButton = new JButton("T\u00ECm S\u00E1ch");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(108, 73, 99, 23);
		frmTmXa.getContentPane().add(btnNewButton);
		Object [] columnNames = {"Tên sách","Tác giả","NXB","Giá"};
		JButton btnXaSch = new JButton("X\u00F3a s\u00E1ch");
		btnXaSch.setBounds(257, 73, 104, 23);
		frmTmXa.getContentPane().add(btnXaSch);
       table = new JTable(new DefaultTableModel(columnNames, 0));// bat buoc phai new Defa de sau nay add them hang 
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setLocation(0, 120);
		jScrollPane.setSize(434, 130);// bat buoc co
		frmTmXa.getContentPane().add(jScrollPane);

	}
}
