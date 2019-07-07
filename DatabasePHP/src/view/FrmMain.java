package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FrmMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain window = new FrmMain();
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
	public FrmMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		menuBar.setBounds(0, 0, 434, 21);
		frame.getContentPane().add(menuBar);

		JMenu btnAddBook = new JMenu("Th\u00EAm S\u00E1ch");
		menuBar.add(btnAddBook);

		JMenuItem btnThem = new JMenuItem("Th\u00EAm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmAddBook addBook = new FrmAddBook();

			}
		});
		btnAddBook.add(btnThem);

		JMenu mnNewMenu_1 = new JMenu("T\u00ECm s\u00E1ch");
		menuBar.add(mnNewMenu_1);

		JMenuItem btnTim = new JMenuItem("T\u00ECm ki\u1EBFm");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FrmLookForBook forBook = new FrmLookForBook();
			}
		});
		mnNewMenu_1.add(btnTim);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\NguyenThanhHuy\\picture\\icon background.png"));
		label.setBounds(0, 23, 434, 238);
		frame.getContentPane().add(label);
	}
}
