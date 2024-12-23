package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configDescuento extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textFieldDescuento1;
	private JTextField textFieldDescuento2;
	private JTextField textFieldDescuento3;
	private JTextField textFieldDescuento4;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButtonAceptar;
	private JButton btnNewButtonCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configDescuento dialog = new configDescuento();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public configDescuento() {
		setTitle("CONFIGURAR DESCUENTO");
		setBounds(100, 100, 605, 206);
		getContentPane().setLayout(null);
		
		//centrar ventanas
				this.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("1 a 5 Unidades");
		lblNewLabel.setBounds(34, 23, 109, 16);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("6 a 10 Unidades");
		lblNewLabel_1.setBounds(35, 58, 111, 16);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("11 a 15 Unidades");
		lblNewLabel_2.setBounds(34, 92, 109, 16);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Mas de 15 Unidades");
		lblNewLabel_3.setBounds(38, 127, 129, 16);
		getContentPane().add(lblNewLabel_3);
		
		textFieldDescuento1 = new JTextField();
		textFieldDescuento1.setBounds(185, 14, 127, 26);
		getContentPane().add(textFieldDescuento1);
		textFieldDescuento1.setColumns(10);
		
		textFieldDescuento2 = new JTextField();
		textFieldDescuento2.setBounds(187, 51, 130, 26);
		getContentPane().add(textFieldDescuento2);
		textFieldDescuento2.setColumns(10);
		
		textFieldDescuento3 = new JTextField();
		textFieldDescuento3.setBounds(189, 83, 130, 26);
		getContentPane().add(textFieldDescuento3);
		textFieldDescuento3.setColumns(10);
		
		textFieldDescuento4 = new JTextField();
		textFieldDescuento4.setBounds(187, 120, 130, 26);
		getContentPane().add(textFieldDescuento4);
		textFieldDescuento4.setColumns(10);
		
		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(324, 23, 61, 16);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(324, 58, 61, 16);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(324, 92, 61, 16);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(324, 127, 61, 16);
		getContentPane().add(lblNewLabel_7);
		
		btnNewButtonAceptar = new JButton("Aceptar");
		btnNewButtonAceptar.setBounds(419, 18, 117, 29);
		getContentPane().add(btnNewButtonAceptar);
		
		btnNewButtonCancelar = new JButton("Cancelar");
		btnNewButtonCancelar.addActionListener(this);
		btnNewButtonCancelar.setBounds(419, 53, 117, 29);
		getContentPane().add(btnNewButtonCancelar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonCancelar) {
			actionPerformedBtnNewButtonCancelar(e);
		}
	}
	protected void actionPerformedBtnNewButtonCancelar(ActionEvent e) {
		dispose();
	}
}
