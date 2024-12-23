package finalProject;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vender extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox comboBoxModelo;
	private JTextField textFieldPrecio;
	private JTextField textFieldCantidad;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButtonVender;
	private JButton btnNewButtonCerrar;
	
	// Variables globales
    private static final double porcentaje1 = 5.0;
    private static final double porcentaje2 = 10.0;
    private static final double porcentaje3 = 15.0;
    private static final double porcentaje4 = 20.0;

    private static final String obsequio1 = "Cafetera";
    private static final String obsequio2 = "Licuadora";
    private static final String obsequio3 = "Extractor";

    private static final double cuotaDiaria = 10000.0;

    private int ventasRealizadas = 0;
    private double totalAcumulado = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vender dialog = new vender();
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
	public vender() {
		setTitle("VENDER");
		setBounds(100, 100, 585, 353);
		getContentPane().setLayout(null);
		
		//centrar ventanas
		this.setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(49, 24, 61, 16);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(49, 70, 81, 16);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(49, 98, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		comboBoxModelo = new JComboBox();
		comboBoxModelo.addActionListener(this);
		comboBoxModelo.setModel(new DefaultComboBoxModel(new String[] {"Selecionar Modelo", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		comboBoxModelo.setBounds(136, 20, 163, 27);
		getContentPane().add(comboBoxModelo);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(146, 65, 130, 26);
		getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(146, 98, 130, 26);
		getContentPane().add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 134, 515, 174);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButtonVender = new JButton("Vender");
		btnNewButtonVender.addActionListener(this);
		btnNewButtonVender.setBounds(423, 19, 117, 29);
		getContentPane().add(btnNewButtonVender);
		
		btnNewButtonCerrar = new JButton("Cerrar");
		btnNewButtonCerrar.addActionListener(this);
		btnNewButtonCerrar.setBounds(423, 65, 117, 29);
		getContentPane().add(btnNewButtonCerrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBoxModelo) {
			actionPerformedComboBoxModelo(e);
		}
		if (e.getSource() == btnNewButtonVender) {
			actionPerformedBtnNewButtonVender(e);
		}
		if (e.getSource() == btnNewButtonCerrar) {
			actionPerformedBtnNewButtonCerrar(e);
		}
	}
	
	protected void actionPerformedBtnNewButtonCerrar(ActionEvent e) {
		dispose();
	}
	
	
	public void venderReporte() {
		 try {
            String modelo = (String) comboBoxModelo.getSelectedItem();
            double precioUnitario = Double.parseDouble(textFieldPrecio.getText());
            int cantidad = Integer.parseInt(textFieldCantidad.getText());

            // Calcular importe de compra
            double importeCompra = precioUnitario * cantidad;

            // Calcular descuento
            double porcentajeDescuento;
            if (cantidad >= 1 && cantidad <= 5) {
                porcentajeDescuento = porcentaje1;
            } else if (cantidad >= 6 && cantidad <= 10) {
                porcentajeDescuento = porcentaje2;
            } else if (cantidad >= 11 && cantidad <= 15) {
                porcentajeDescuento = porcentaje3;
            } else {
                porcentajeDescuento = porcentaje4;
            }
            double importeDescuento = importeCompra * (porcentajeDescuento / 100);
            double importePagar = importeCompra - importeDescuento;

            // Determinar obsequio
            String obsequio;
            if (cantidad == 1) {
                obsequio = obsequio1;
            } else if (cantidad >= 2 && cantidad <= 5) {
                obsequio = obsequio2;
            } else {
                obsequio = obsequio3;
            }

            // Actualizar boleta
            textArea.setText("BOLETA DE VENTA\n" +
                    "Modelo         : " + modelo + "\n" +
                    "Precio         : S/. " + String.format("%.2f", precioUnitario) + "\n" +
                    "Cantidad       : " + cantidad + "\n" +
                    "Importe compra : S/. " + String.format("%.2f", importeCompra) + "\n" +
                    "Importe desc.  : S/. " + String.format("%.2f", importeDescuento) + "\n" +
                    "Importe pagar  : S/. " + String.format("%.2f", importePagar) + "\n" +
                    "Obsequio       : " + obsequio);

            // Actualizar totales y ventas
            totalAcumulado += importePagar;
            ventasRealizadas++;

            // Mostrar mensaje cada cinco ventas
            if (ventasRealizadas % 5 == 0) {
                double porcentajeCuota = (totalAcumulado / cuotaDiaria) * 100;
                JOptionPane.showMessageDialog(this,
                        "Número de venta actual: " + ventasRealizadas + "\n" +
                                "Importe total acumulado: S/. " + String.format("%.2f", totalAcumulado) + "\n" +
                                "Porcentaje de cuota diaria: " + String.format("%.2f", porcentajeCuota) + "%",
                        "Resumen de Ventas",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
	
	
	protected void actionPerformedComboBoxModelo(ActionEvent e) {
		String modelo1 = "Mabe EMP6120PG0";
		String modelo2 = "Indurama Parma";
		String modelo3 = "Sole COSOL027";
		String modelo4 = "Coldex CX602";
		String modelo5 = "Reco Dakota";
		
		String selectedModel = (String) comboBoxModelo.getSelectedItem();
        if (selectedModel.equals(modelo1)) {
            textFieldPrecio.setText("949.0");
        } else if (selectedModel.equals(modelo2)) {
            textFieldPrecio.setText("1089.0");
        } else if (selectedModel.equals(modelo3)) {
            textFieldPrecio.setText("850.0");
        }
        else if (selectedModel.equals(modelo4)) {
            textFieldPrecio.setText("629.0");
        }
        else if (selectedModel.equals(modelo5)) {
            textFieldPrecio.setText("849.0");
        }
	}
	
	protected void actionPerformedBtnNewButtonVender(ActionEvent e) {
//		double precios = ;
		venderReporte();
	}
}
