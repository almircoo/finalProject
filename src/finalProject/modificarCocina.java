package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.HashMap;
import java.util.Map;
import java.awt.Color;

public class modificarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	// guide https://www.w3schools.com/java/java_hashmap.asp
	// https://stackoverflow.com/questions/2792731/how-to-do-an-array-of-hashmaps
	private Map<String, Modelo> modelosActualizados = new HashMap<>(); // define constructor variable para actualizar modelos.

	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textFieldPrecio;
	private JTextField textFieldAncho;
	private JTextField textFieldAlto;
	private JTextField textFieldFondo;
	private JTextField textFieldQuemador;
	private JButton btnNewButtonCerrar;
	private JButton btnNewButtonGravar;
	
	
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
	private JComboBox comboBoxModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificarCocina dialog = new modificarCocina();
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
	public modificarCocina() {
		setBackground(new Color(204, 255, 204));
		setTitle("MODIFICAR COCINA");
		setBounds(100, 100, 521, 355);
		getContentPane().setLayout(null);
		
		//centrar ventanas
		this.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(40, 16, 61, 16);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(40, 58, 80, 16);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(40, 96, 101, 16);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(40, 143, 61, 16);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(40, 190, 101, 16);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Quemadores");
		lblNewLabel_5.setBounds(40, 234, 139, 16);
		getContentPane().add(lblNewLabel_5);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setBounds(146, 53, 130, 26);
		getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldAncho = new JTextField();
		textFieldAncho.setBounds(145, 91, 130, 26);
		getContentPane().add(textFieldAncho);
		textFieldAncho.setColumns(10);
		
		textFieldAlto = new JTextField();
		textFieldAlto.setBounds(145, 138, 130, 26);
		getContentPane().add(textFieldAlto);
		textFieldAlto.setColumns(10);
		
		textFieldFondo = new JTextField();
		textFieldFondo.setBounds(145, 185, 130, 26);
		getContentPane().add(textFieldFondo);
		textFieldFondo.setColumns(10);
		
		textFieldQuemador = new JTextField();
		textFieldQuemador.setBounds(146, 229, 130, 26);
		getContentPane().add(textFieldQuemador);
		textFieldQuemador.setColumns(10);
		
		btnNewButtonCerrar = new JButton("Cerrar");
		btnNewButtonCerrar.addActionListener(this);
		btnNewButtonCerrar.setBounds(363, 11, 117, 29);
		getContentPane().add(btnNewButtonCerrar);
		
		btnNewButtonGravar = new JButton("Gravar");
		btnNewButtonGravar.addActionListener(this);
		btnNewButtonGravar.setBounds(363, 53, 117, 29);
		getContentPane().add(btnNewButtonGravar);
		
		comboBoxModelo = new JComboBox();
		comboBoxModelo.addActionListener(this);
		comboBoxModelo.setModel(new DefaultComboBoxModel(new String[] {"Elegir Modelo", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		comboBoxModelo.setBounds(145, 12, 145, 27);
		getContentPane().add(comboBoxModelo);
		
//		https://medium.com/@sgowsu/array-hashmap-in-java-in-java-925aab52701e
//		https://stackoverflow.com/questions/9453522/initialize-hashmap-with-an-array-of-items
		// Inicializar datos predeterminados en el mapa https://stackoverflow.com/questions/2792731/how-to-do-an-array-of-hashmaps
	    modelosActualizados.put("Mabe EMP6120PG0", new Modelo(949.00, 60.0, 91.0, 58.6, 4));
	    modelosActualizados.put("Indurama Parma", new Modelo(1089.00, 80.0, 94.0, 67.5, 6));
	    modelosActualizados.put("Sole COSOL027", new Modelo(850.00, 60.0, 90.0, 50.0, 4));
	    modelosActualizados.put("Coldex CX602", new Modelo(629.00, 61.6, 95.0, 51.5, 5));
	    modelosActualizados.put("Reco Dakota", new Modelo(849.00, 75.4, 94.5, 66.0, 5));
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonGravar) {
			actionPerformedBtnNewButtonGravar(e);
		}
		if (e.getSource() == comboBoxModelo) {
            actionPerformedComboBox(e);
        }
		if (e.getSource() == btnNewButtonCerrar) {
			actionPerformedBtnNewButtonCerrar(e);
		}
	}
	
	
	//Guardar cambios 
	protected void actionPerformedBtnNewButtonGravar(ActionEvent e) {
		
		// entrda datos
		String modeloSeleccionado = comboBoxModelo.getSelectedItem().toString();
		
		//proceso
        if (!modeloSeleccionado.equals("Elegir Modelo")) {
            try {
                double precio = Double.parseDouble(textFieldPrecio.getText());
                double ancho = Double.parseDouble(textFieldAncho.getText());
                double alto = Double.parseDouble(textFieldAlto.getText());
                double fondo = Double.parseDouble(textFieldFondo.getText());
                int quemadores = Integer.parseInt(textFieldQuemador.getText());

                modelosActualizados.put(modeloSeleccionado, new Modelo(precio, ancho, alto, fondo, quemadores));
                
                JOptionPane.showMessageDialog(this, "Datos guardados correctamente para el modelo: " + modeloSeleccionado);
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error: Asegúrese de ingresar valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un modelo válido antes de guardar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
		
	}
	
	//cerrar ventana
	protected void actionPerformedBtnNewButtonCerrar(ActionEvent e) {
		dispose();
	}
	
	
	// Mostrar los datos del modelo seleccionado
    protected void actionPerformedComboBox(ActionEvent e) {

        String modeloSeleccionado = comboBoxModelo.getSelectedItem().toString();
        
        //proceso
        if (!modeloSeleccionado.equals("Elegir Modelo")) {
        	
            Modelo datos = modelosActualizados.get(modeloSeleccionado); // llama a los nuevos valores del hashmap clase Metodo : datos
            
            if (datos != null) {
            	colocarDatosFields(datos.obtenerPrecio(), datos.obtenerAncho(), datos.obtenerAlto(), datos.obtenerFondo(), datos.obtenerQuemadores());
            }
            
        } else {
            limpiarTextFields();
        }
    }
    
 // Actualizar campos con la información del modelo seleccionado
//    private void actualizarTextField(String modelo) {
//        switch (modelo) {
//            case "Mabe EMP6120PG0":
//            	colocarDatosFields(precioModelo0, ancho0, alto0, fondo0, quemadores0);
//                break;
//            case "Indurama Parma":
//            	colocarDatosFields(precioModelo1, ancho1, alto1, fondo1, quemadores1);
//                break;
//            case "Sole COSOL027":
//            	colocarDatosFields(precioModelo2, ancho2, alto2, fondo2, quemadores2);
//                break;
//            case "Coldex CX602":
//            	colocarDatosFields(precioModelo3, ancho3, alto3, fondo3, quemadores3);
//                break;
//            case "Reco Dakota":
//            	colocarDatosFields(precioModelo4, ancho4, alto4, fondo4, quemadores4);
//                break;
//        }
//    }

    // Asignar valores a los campos desde el hashmap
    private void colocarDatosFields(double precio, double ancho, double alto, double fondo, int quemadores) {
        textFieldPrecio.setText(Double.toString(precio));
        textFieldAncho.setText(Double.toString(ancho));
        textFieldAlto.setText(Double.toString(alto));
        textFieldFondo.setText(Double.toString(fondo));
        textFieldQuemador.setText(Integer.toString(quemadores));
    }
 // Habilitar los campos de texto para edición
//    private void activarEditField(boolean enable) {
//        textFieldPrecio.setEditable(enable);
//        textFieldAncho.setEditable(enable);
//        textFieldAlto.setEditable(enable);
//        textFieldFondo.setEditable(enable);
//        textFieldQuemador.setEditable(enable);
//    }

 // Limpiar los campos
    private void limpiarTextFields() {
        textFieldPrecio.setText("");
        textFieldAncho.setText("");
        textFieldAlto.setText("");
        textFieldFondo.setText("");
        textFieldQuemador.setText("");
    }
    
    
 // Clase para almacenar los datos modificado del modelo
//    https://www.w3schools.com/java/java_classes.asp
//    https://www.geeksforgeeks.org/classes-objects-java/
    private static class Modelo {
    	//variables
        private double precio, ancho, alto, fondo;
        private int quemadores;
        
        //metodo con parametros 
//        https://es.stackoverflow.com/questions/145422/java-pasar-método-como-valor-en-hashmap
        public Modelo(double precio, double ancho, double alto, double fondo, int quemadores) {
            this.precio = precio;
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
            this.quemadores = quemadores;
        }
        //metodos de retorno 
        public double obtenerPrecio() { 
        	return precio; 
        }
        public double obtenerAncho() { 
        	return ancho; 
        }
        public double obtenerAlto() { 
        	return alto; 
        }
        public double obtenerFondo() { 
        	return fondo; 
        }
        public int obtenerQuemadores() { 
        	return quemadores; 
        }
    }
}


