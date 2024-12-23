package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnNewButtonCerrar;
	private JButton btnNewButtonListar;
	private JScrollPane scrollPane;
	private JTextArea textAreaListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listarCocina dialog = new listarCocina();
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
	public listarCocina() {
		setTitle("LISTAR COCINA");
		setBounds(100, 100, 637, 382);
		getContentPane().setLayout(null);
		
		//centrar ventanas
		this.setLocationRelativeTo(null);
				
		btnNewButtonCerrar = new JButton("Cerrar");
		btnNewButtonCerrar.addActionListener(this);
		btnNewButtonCerrar.setBounds(186, 306, 117, 29);
		getContentPane().add(btnNewButtonCerrar);
		
		btnNewButtonListar = new JButton("Listar");
		btnNewButtonListar.addActionListener(this);
		btnNewButtonListar.setBounds(340, 306, 117, 29);
		getContentPane().add(btnNewButtonListar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 17, 573, 270);
		getContentPane().add(scrollPane);
		
		textAreaListar = new JTextArea();
		scrollPane.setViewportView(textAreaListar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonCerrar) {
			actionPerformedBtnNewButtonCerrar(e);
		}
		if (e.getSource() == btnNewButtonListar) {
			actionPerformedBtnNewButtonListar(e);
		}
	}
	// button procesar
	protected void actionPerformedBtnNewButtonListar(ActionEvent e) {
        
        // Proceso
        String listado = generarListadoCocinas();

        // Mostrar resultados
        mostrarListado(listado);
        
	}
	// botton cerrar
	protected void actionPerformedBtnNewButtonCerrar(ActionEvent e) {
		dispose();
	}
	
	// metodo listado de cocinas
	private String generarListadoCocinas() {
		String listarCocinas = "LISTADO DE COCINAS\n\n";

		// Datos de cocina 1
		String modelo1 = "Mabe EMP6120PG0";
		String precio1 = "949.0";
		String profundidad1 = "58.6";
		String ancho1 = "60.0";
		String alto1 = "91.0";
		String quemadores1 = "4";

		// Datos de cocina 2
		String modelo2 = "Indurama Parma";
		String precio2 = "1089.0";
		String profundidad2 = "67.5";
		String ancho2 = "80.0";
		String alto2 = "94.0";
		String quemadores2 = "6";

		// Datos de cocina 3
		String modelo3 = "Sole COSOL027";
		String precio3 = "850.0";
		String profundidad3 = "50.0";
		String ancho3 = "60.0";
		String alto3 = "90.0";
		String quemadores3 = "4";

		// Datos de cocina 4
		String modelo4 = "Coldex CX602";
		String precio4 = "629.0";
		String profundidad4 = "51.5";
		String ancho4 = "61.6";
		String alto4 = "95.0";
		String quemadores4 = "5";

		// Datos de cocina 5
		String modelo5 = "Reco Dakota";
		String precio5 = "849.0";
		String profundidad5 = "66.0";
		String ancho5 = "75.4";
		String alto5 = "94.5";
		String quemadores5 = "5";

		// Concatenar todos los datos en una sola cadena
		listarCocinas += crearFormatoCocina(modelo1, precio1, profundidad1, ancho1, alto1, quemadores1);
		listarCocinas += crearFormatoCocina(modelo2, precio2, profundidad2, ancho2, alto2, quemadores2);
		listarCocinas += crearFormatoCocina(modelo3, precio3, profundidad3, ancho3, alto3, quemadores3);
		listarCocinas += crearFormatoCocina(modelo4, precio4, profundidad4, ancho4, alto4, quemadores4);
		listarCocinas += crearFormatoCocina(modelo5, precio5, profundidad5, ancho5, alto5, quemadores5);

		return listarCocinas;
	}
	
	// metodo para concatenar
	private String crearFormatoCocina(String modelo, String precio, String profundidad, String ancho, String alto,
			String quemadores) {
		
		return "Modelo       : " + modelo + "\n" + 
               "Precio       : S/ " + precio + "\n" + 
               "Profundidad  : " + profundidad + " cm\n" + 
               "Ancho        : " + ancho + " cm\n" + 
               "Alto         : " + alto + " cm\n" + 
               "Quemadores   : " + quemadores + "\n\n";
	}
		
	
	private void mostrarListado(String listado) {
		textAreaListar.setText(listado);
	}

	
	
}
