package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configCantOptima extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textFieldCuotaDiaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configCantOptima dialog = new configCantOptima();
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
	public configCantOptima() {
		setTitle("CANTIDAD UNIDADES VENDIDAS");
		setBounds(100, 100, 530, 153);
		getContentPane().setLayout(null);
		//centrar ventanas
				this.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("Cantidad optima de unidades vendidad");
		lblNewLabel.setBounds(6, 24, 254, 16);
		getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(376, 19, 117, 29);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(376, 61, 117, 29);
		getContentPane().add(btnNewButton_1);
		
		textFieldCuotaDiaria = new JTextField();
		textFieldCuotaDiaria.setBounds(276, 19, 76, 26);
		getContentPane().add(textFieldCuotaDiaria);
		textFieldCuotaDiaria.setColumns(10);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		dispose();
	}
}
