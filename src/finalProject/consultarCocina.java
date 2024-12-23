package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class consultarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JComboBox comboBoxModelo;
	private JTextField textFieldPrecio;
	private JTextField textFieldAncho;
	private JTextField textFieldAlto;
	private JTextField textFieldFondo;
	private JTextField textFieldQuemadores;
	private JButton btnNewButtonCerrar;
	
	// Vriables Globales
	// modelo 1
	private String modelo0 = "Mabe EMP6120PG0"; 
	private double precioModelo0 = 949.00;
	public  double fondo0 = 58.6; 
	public  double ancho0 = 60.0; 
	public  double alto0 = 91.0; 
	public  int quemadores0 = 4;
	
	// modelo 2
	private String modelo1 = "Indurama Parma"; 
	private double precioModelo1 = 1089.00;
	public double ancho1 = 80.0;
	public double alto1 = 94.0;
	public double fondo1 = 67.5; 
	public int quemadores1 = 6;
	
	// modelo 3
	private String modelo2 = "Sole COSOL027"; 
	private double precioModelo2 = 850.00;
	public double ancho2 = 60.0;
	public double alto2 = 90.0;
	public double fondo2 = 50.0; 
	public int quemadores2 = 4;
	// modelo 4
	private String modelo3 = "Coldex CX602"; 
	private double precioModelo3 = 629.00;
	public  double ancho3 = 61.6;
	public  double alto3 = 95.0;
	public  double fondo3 = 51.5; 
	public  int quemadores3 = 5;
	// modelo 5
	private String modelo4 = "Reco Dakota"; 
	private double precioModelo4 = 849.00;
	public double ancho4 = 75.4;
	public double alto4 = 94.5;
	public double fondo4 = 66.0; 
	public int quemadores4 = 5;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultarCocina dialog = new consultarCocina();
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
	public consultarCocina() {
		setTitle("CONSULTAR COCINA");
		setBounds(100, 100, 515, 327);
		getContentPane().setLayout(null);
		
		//centrar ventanas
				this.setLocationRelativeTo(null);
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(26, 17, 61, 16);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio ($)");
		lblNewLabel_1.setBounds(26, 45, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(26, 85, 103, 16);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(26, 113, 74, 22);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(26, 157, 103, 16);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Quemadores");
		lblNewLabel_5.setBounds(26, 185, 103, 16);
		getContentPane().add(lblNewLabel_5);
		
		comboBoxModelo = new JComboBox();
		comboBoxModelo.addActionListener(this);
		comboBoxModelo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione Modelo", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		comboBoxModelo.setBounds(155, 13, 174, 27);
		getContentPane().add(comboBoxModelo);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(165, 40, 130, 26);
		getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldAncho = new JTextField();
		textFieldAncho.setEditable(false);
		textFieldAncho.setBounds(165, 80, 130, 26);
		getContentPane().add(textFieldAncho);
		textFieldAncho.setColumns(10);
		
		textFieldAlto = new JTextField();
		textFieldAlto.setEditable(false);
		textFieldAlto.setBounds(165, 111, 130, 26);
		getContentPane().add(textFieldAlto);
		textFieldAlto.setColumns(10);
		
		textFieldFondo = new JTextField();
		textFieldFondo.setEditable(false);
		textFieldFondo.setBounds(165, 152, 130, 26);
		getContentPane().add(textFieldFondo);
		textFieldFondo.setColumns(10);
		
		textFieldQuemadores = new JTextField();
		textFieldQuemadores.setEditable(false);
		textFieldQuemadores.setBounds(165, 185, 130, 26);
		getContentPane().add(textFieldQuemadores);
		textFieldQuemadores.setColumns(10);
		
		btnNewButtonCerrar = new JButton("Cerrar");
		btnNewButtonCerrar.addActionListener(this);
		btnNewButtonCerrar.setBounds(373, 12, 117, 29);
		getContentPane().add(btnNewButtonCerrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonCerrar) {
			actionPerformedBtnNewButtonCerrar(e);
		}
		if (e.getSource() == comboBoxModelo) {
			actionPerformedComboBox(e);
		}
	}
	//Consultar Cocina
	protected void actionPerformedComboBox(ActionEvent e) {
		// Declarar variables
		String modelo;
		
		//Entrada datos
		modelo = comboBoxModelo.getSelectedItem().toString();
		
		//proceso
		if (modelo==modelo0) {
			textFieldPrecio.setText(Double.toString(precioModelo0));
			textFieldAncho.setText(Double.toString(ancho0));
			textFieldAlto.setText(Double.toString(alto0));
			textFieldFondo.setText(Double.toString(fondo0));
			textFieldQuemadores.setText(Integer.toString(quemadores0));
			
		}else if (modelo==modelo1) {
			textFieldPrecio.setText(Double.toString(precioModelo1));
			textFieldAncho.setText(Double.toString(ancho1));
			textFieldAlto.setText(Double.toString(alto1));
			textFieldFondo.setText(Double.toString(fondo1));
			textFieldQuemadores.setText(Integer.toString(quemadores1));
			
		}else if (modelo==modelo2) {
			textFieldPrecio.setText(Double.toString(precioModelo2));
			textFieldAncho.setText(Double.toString(ancho2));
			textFieldAlto.setText(Double.toString(alto2));
			textFieldFondo.setText(Double.toString(fondo2));
			textFieldQuemadores.setText(Integer.toString(quemadores2));
			
		}
		else if (modelo==modelo3) {
			textFieldPrecio.setText(Double.toString(precioModelo3));
			textFieldAncho.setText(Double.toString(ancho3));
			textFieldAlto.setText(Double.toString(alto3));
			textFieldFondo.setText(Double.toString(fondo3));
			textFieldQuemadores.setText(Integer.toString(quemadores3));
		}
		else if (modelo==modelo4) {
			textFieldPrecio.setText(Double.toString(precioModelo4));
			textFieldAncho.setText(Double.toString(ancho4));
			textFieldAlto.setText(Double.toString(alto4));
			textFieldFondo.setText(Double.toString(fondo4));
			textFieldQuemadores.setText(Integer.toString(quemadores4));
		}
		
		// 
		if (modelo=="Seleccione Modelo") {
			textFieldPrecio.setText("");
			textFieldAncho.setText("");
			textFieldAlto.setText("");
			textFieldFondo.setText("");
			textFieldQuemadores.setText("");
		}
		
	}
	// clouse jdialog  windows
	protected void actionPerformedBtnNewButtonCerrar(ActionEvent e) {
		dispose();
	}
}








