package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class generarReporte extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JButton btnNewButtonCerrar;
	private JScrollPane scrollPane;
	private JTextArea textAreaReporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generarReporte dialog = new generarReporte();
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
	public generarReporte() {
		setTitle("GENERAR REPORTE");
		setBounds(100, 100, 553, 386);
		getContentPane().setLayout(null);
		
		//centrar ventanas
		this.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("Tipo de reporte");
		lblNewLabel.setBounds(39, 22, 107, 16);
		getContentPane().add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo"}));
		comboBox.setBounds(168, 15, 222, 27);
		getContentPane().add(comboBox);
		
		btnNewButtonCerrar = new JButton("Cerrar");
		btnNewButtonCerrar.addActionListener(this);
		btnNewButtonCerrar.setBounds(421, 12, 117, 29);
		getContentPane().add(btnNewButtonCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 63, 485, 283);
		getContentPane().add(scrollPane);
		
		textAreaReporte = new JTextArea();
		scrollPane.setViewportView(textAreaReporte);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonCerrar) {
			actionPerformedBtnNewButtonCerrar(e);
		}
	}
	protected void actionPerformedBtnNewButtonCerrar(ActionEvent e) {
		dispose();
	}
}
