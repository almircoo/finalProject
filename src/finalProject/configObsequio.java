package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configObsequio extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblAMas;
	private JTextField textFieldUnidad1;
	private JTextField textFieldUnidad2;
	private JTextField textFieldUnidad3;
	private JButton btnNewButtonAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configObsequio dialog = new configObsequio();
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
	public configObsequio() {
		setTitle("CONFIGURAR OBSEQUIO");
		setBounds(100, 100, 573, 181);
		getContentPane().setLayout(null);
		
		//centrar ventanas
				this.setLocationRelativeTo(null);
				
		lblNewLabel = new JLabel("1 Unidad");
		lblNewLabel.setBounds(27, 6, 61, 16);
		getContentPane().add(lblNewLabel);
		
		lblA = new JLabel("2 a 5 Unidades");
		lblA.setBounds(27, 44, 93, 16);
		getContentPane().add(lblA);
		
		lblAMas = new JLabel("6 a mas unidades");
		lblAMas.setBounds(27, 84, 110, 16);
		getContentPane().add(lblAMas);
		
		textFieldUnidad1 = new JTextField();
		textFieldUnidad1.setBounds(186, 6, 130, 26);
		getContentPane().add(textFieldUnidad1);
		textFieldUnidad1.setColumns(10);
		
		textFieldUnidad2 = new JTextField();
		textFieldUnidad2.setColumns(10);
		textFieldUnidad2.setBounds(186, 44, 130, 26);
		getContentPane().add(textFieldUnidad2);
		
		textFieldUnidad3 = new JTextField();
		textFieldUnidad3.setColumns(10);
		textFieldUnidad3.setBounds(186, 79, 130, 26);
		getContentPane().add(textFieldUnidad3);
		
		btnNewButtonAceptar = new JButton("Aceptar");
		btnNewButtonAceptar.setBounds(387, 16, 117, 29);
		getContentPane().add(btnNewButtonAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(387, 57, 117, 29);
		getContentPane().add(btnCancelar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
