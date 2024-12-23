package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configCuotaDiaria extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JButton btnNewButtonAceptar;
	private JButton btnNewButtonCancelar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configCuotaDiaria dialog = new configCuotaDiaria();
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
	public configCuotaDiaria() {
		setTitle("CONFIGURAR CUOTA DIARIA");
		setBounds(100, 100, 476, 152);
		getContentPane().setLayout(null);
		
		//centrar ventanas
		this.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("Cuota diaria esperada (S/.)");
		lblNewLabel.setBounds(27, 32, 178, 16);
		getContentPane().add(lblNewLabel);
		
		btnNewButtonAceptar = new JButton("Aceptar");
		btnNewButtonAceptar.setBounds(353, 27, 117, 29);
		getContentPane().add(btnNewButtonAceptar);
		
		btnNewButtonCancelar = new JButton("Cancelar");
		btnNewButtonCancelar.addActionListener(this);
		btnNewButtonCancelar.setBounds(353, 68, 117, 29);
		getContentPane().add(btnNewButtonCancelar);
		
		textField = new JTextField();
		textField.setBounds(204, 27, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);

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
