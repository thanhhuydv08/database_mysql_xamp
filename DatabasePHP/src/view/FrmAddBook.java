package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import controller.ControllerDatabase;
import model.Book;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class FrmAddBook {
    
	private JFrame frmThmSchMi;
	private JTextField txtnameBook;
	private JTextField txtNameAuthor;
	private JTextField txtNameCompany;
	private JTextField txtPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAddBook window = new FrmAddBook();
					window.frmThmSchMi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmAddBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThmSchMi = new JFrame();
		frmThmSchMi.setVisible(true);
		frmThmSchMi.getContentPane().setBackground(SystemColor.text);
		frmThmSchMi.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn s\u00E1ch : ");
		lblNewLabel.setBounds(32, 37, 64, 14);
		frmThmSchMi.getContentPane().add(lblNewLabel);
		
		txtnameBook = new JTextField();
		txtnameBook.setBounds(124, 34, 235, 20);
		frmThmSchMi.getContentPane().add(txtnameBook);
		txtnameBook.setColumns(10);
		
		JLabel lblTcGi = new JLabel("T\u00E1c Gi\u1EA3 : ");
		lblTcGi.setBounds(32, 65, 64, 14);
		frmThmSchMi.getContentPane().add(lblTcGi);
		
		txtNameAuthor = new JTextField();
		txtNameAuthor.setColumns(10);
		txtNameAuthor.setBounds(124, 62, 235, 20);
		frmThmSchMi.getContentPane().add(txtNameAuthor);
		
		JLabel lblNhXb = new JLabel("Nh\u00E0 XB : ");
		lblNhXb.setBounds(32, 93, 64, 14);
		frmThmSchMi.getContentPane().add(lblNhXb);
		
		txtNameCompany = new JTextField();
		txtNameCompany.setColumns(10);
		txtNameCompany.setBounds(124, 90, 235, 20);
		frmThmSchMi.getContentPane().add(txtNameCompany);
		
		JLabel lblPrice = new JLabel("Gi\u00E1 : ");
		lblPrice.setBounds(32, 121, 46, 14);
		frmThmSchMi.getContentPane().add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(124, 118, 235, 20);
		frmThmSchMi.getContentPane().add(txtPrice);
		
		JButton btnSubmit = new JButton("Th\u00EAm s\u00E1ch m\u1EDBi");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int check=0;
				Book book = new Book(null, txtnameBook.getText(), txtNameAuthor.getText(), txtNameCompany.getText(), txtPrice.getText());
				String sql = "insert into book (nameBook,nameAuthor,nameCompany,price) "
						+ "values ('"+book.getNameBook()+"','"+book.getNameAuthor()+"','"+book.getNameCompany()+"','"+book.getsPrice()+"'"+")";
				try {
					ControllerDatabase controllerDatabase = new ControllerDatabase("book");
					check=	controllerDatabase.Insert(sql);
					if(check==1) {
						JOptionPane.showMessageDialog(frmThmSchMi,"Truy vấn thành công.");
					}else {JOptionPane.showMessageDialog(frmThmSchMi,"Truy vấn thất bại.");}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnSubmit.setBackground(UIManager.getColor("Button.light"));
		btnSubmit.setBounds(179, 160, 121, 23);
		frmThmSchMi.getContentPane().add(btnSubmit);
		frmThmSchMi.setTitle("Th\u00EAm s\u00E1ch m\u1EDBi");
		frmThmSchMi.setBounds(100, 100, 450, 300);
		frmThmSchMi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
