package finalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButtonIngresar;
	private JButton btnNewButtonSalir;
	private JLabel lblNewLabel;
	private JTextField textFieldUsuario;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	
	//variables globales
	public static String usuario, contrasena;
	public static int error = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setForeground(new Color(204, 255, 204));
		setBackground(new Color(204, 255, 204));
		setTitle("INICIAR SESSION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 357);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//centrar ventanas
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButtonIngresar = new JButton("Ingresar");
		btnNewButtonIngresar.setBackground(new Color(102, 51, 204));
		btnNewButtonIngresar.addActionListener(this);
		btnNewButtonIngresar.setBounds(69, 190, 117, 29);
		contentPane.add(btnNewButtonIngresar);
		
		btnNewButtonSalir = new JButton("Salir");
		btnNewButtonSalir.addActionListener(this);
		btnNewButtonSalir.setBounds(69, 253, 117, 29);
		contentPane.add(btnNewButtonSalir);
		
		lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(97, 49, 69, 16);
		contentPane.add(lblNewLabel);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(69, 77, 130, 26);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Contrasena");
		lblNewLabel_1.setBounds(97, 115, 108, 16);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(69, 142, 130, 26);
		contentPane.add(passwordField);
		
		lblNewLabel_2 = new JLabel("Ingresar Usuario y Contrasena");
		lblNewLabel_2.setBounds(49, 6, 203, 16);
		contentPane.add(lblNewLabel_2);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonIngresar) {
			actionPerformedBtnNewButtonIngresar(e);
		}
		if (e.getSource() == btnNewButtonSalir) {
			actionPerformedBtnNewButtonSalir(e);
		}
	}
	protected void actionPerformedBtnNewButtonSalir(ActionEvent e) {
		dispose();
		textFieldUsuario.setText("");
		passwordField.setText("");
		textFieldUsuario.requestFocus();
	}
	protected void actionPerformedBtnNewButtonIngresar(ActionEvent e) {
		//variabls local
		usuario = textFieldUsuario.getText();
		contrasena = passwordField.getText();
		// proceso
		if (usuario.equals("Admin") && contrasena.equals("12345j")) {
			login.this.dispose();
			JOptionPane.showMessageDialog(null, "Bienvenido al  sistema", "Ingreso Correcto", JOptionPane.ERROR_MESSAGE);
			
			finalProject abrir = new finalProject();
			abrir.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(this, "Error: Asegúrese de ingresar valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
			
			textFieldUsuario.setText("");
			passwordField.setText("");
			textFieldUsuario.requestFocus();
			
			error = error + 1;
			 if (error==3) {
				 JOptionPane.showMessageDialog(this, "Comuniquese con servicio tecnico.", "Usuario Bloqueado", JOptionPane.ERROR_MESSAGE);
				 
				 login.this.dispose();
				 
				 
			 }
		}
	}
}
