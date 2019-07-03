package database;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Frm_BT5_2 extends JFrame {
	ResultSet resultSet;
    String user, pass, sqlQuery;
	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_BT5_2 frame = new Frm_BT5_2();
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
	public Frm_BT5_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtuser = new JTextField();
		txtuser.setBounds(161, 60, 146, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(161, 91, 146, 20);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClassConnectDataAll connect = new ClassConnectDataAll();
				user = txtuser.getText();
				pass = new String (txtPassword.getPassword());
				sqlQuery = "select * from user where name='"+user+"'and password='"+pass+"'";// value phai nam trong dau '';
				try {
					resultSet=connect.getInstance("login", sqlQuery);
					if(resultSet.next()) {
						JOptionPane.showMessageDialog(rootPane,"Login cucess .");
					}else {
						JOptionPane.showMessageDialog(rootPane,"Fail!!");
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(194, 138, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("user :");
		lblNewLabel.setBounds(87, 66, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPass = new JLabel("pass :");
		lblPass.setBounds(87, 97, 46, 14);
		contentPane.add(lblPass);
	}
}
