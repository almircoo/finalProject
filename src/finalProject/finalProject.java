package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class finalProject extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBarProject;
	private JMenu mnNewMenuArchivo;
	private JMenu mnNewMenuManteni;
	private JMenu mnNewMenuVentas;
	private JMenu mnNewMenuConfig;
	private JMenu mnNewMenuAyuda;
	private JMenuItem mntmNewMenuItemSalir;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmModificarCocina;
	private JMenuItem mnListarCocina;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReporte;
	private JMenuItem mntmConfigurarDescuento;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalProject frame = new finalProject();
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
	public finalProject() {
		setTitle("TIENDA 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 474);
		
		menuBarProject = new JMenuBar();
		setJMenuBar(menuBarProject);
		
		this.setLocationRelativeTo(null);
		
		mnNewMenuArchivo = new JMenu("Archivo");
		menuBarProject.add(mnNewMenuArchivo);
		
		mntmNewMenuItemSalir = new JMenuItem("Salir");
		mntmNewMenuItemSalir.addActionListener(this);
		mnNewMenuArchivo.add(mntmNewMenuItemSalir);
		
		mnNewMenuManteni = new JMenu("Mantenimiento");
		menuBarProject.add(mnNewMenuManteni);
		
		mnListarCocina = new JMenuItem("Listar Cocina");
		mnListarCocina.addActionListener(this);
		mnNewMenuManteni.add(mnListarCocina);
		
		mntmModificarCocina = new JMenuItem("Modificar Cocina");
		mntmModificarCocina.addActionListener(this);
		mnNewMenuManteni.add(mntmModificarCocina);
		
		mntmConsultarCocina = new JMenuItem("Consultar Cosina");
		mntmConsultarCocina.addActionListener(this);
		mnNewMenuManteni.add(mntmConsultarCocina);
		
		mnNewMenuVentas = new JMenu("Ventas");
		menuBarProject.add(mnNewMenuVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnNewMenuVentas.add(mntmVender);
		
		mntmGenerarReporte = new JMenuItem("Generar Reporte");
		mntmGenerarReporte.addActionListener(this);
		mnNewMenuVentas.add(mntmGenerarReporte);
		
		mnNewMenuConfig = new JMenu("Configuracion");
		menuBarProject.add(mnNewMenuConfig);
		
		mntmConfigurarDescuento = new JMenuItem("Configurar Descuento");
		mntmConfigurarDescuento.addActionListener(this);
		mnNewMenuConfig.add(mntmConfigurarDescuento);
		
		mntmNewMenuItem = new JMenuItem("Configurar obsequios");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenuConfig.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Configurar cantidad optima");
		mntmNewMenuItem_1.addActionListener(this);
		mnNewMenuConfig.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Configurar cuota diaria");
		mntmNewMenuItem_2.addActionListener(this);
		mnNewMenuConfig.add(mntmNewMenuItem_2);
		
		mnNewMenuAyuda = new JMenu("Ayuda");
		menuBarProject.add(mnNewMenuAyuda);
		
		mntmNewMenuItem_3 = new JMenuItem("Acerca de la Tienda");
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenuAyuda.add(mntmNewMenuItem_3);
		
		lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/principal.gif")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_3) {
			actionPerformedMntmNewMenuItem_3(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		if (e.getSource() == mntmConfigurarDescuento) {
			actionPerformedMntmConfigurarDescuento(e);
		}
		if (e.getSource() == mntmGenerarReporte) {
			actionPerformedMntmGenerarReporte(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mnListarCocina) {
			actionPerformedMnListarCocina(e);
		}
		if (e.getSource() == mntmConsultarCocina) {
			actionPerformedMntmConsultarCocina(e);
		}
		if (e.getSource() == mntmModificarCocina) {
			actionPerformedMntmModificarCocina(e);
		}
		if (e.getSource() == mntmNewMenuItemSalir) {
			actionPerformedMntmNewMenuItemSalir(e);
		}
	}
	//button salir
	protected void actionPerformedMntmNewMenuItemSalir(ActionEvent e) {
		System.exit(0);
	}
	//button modificar  cocina
	protected void actionPerformedMntmModificarCocina(ActionEvent e) {
		modificarCocina mC = new modificarCocina();
		mC.setVisible(true);
	}
	// button consultar cocina
	protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		consultarCocina cC = new consultarCocina();
		cC.setVisible(true);
	}
	// listar cocina
	protected void actionPerformedMnListarCocina(ActionEvent e) {
		listarCocina lC = new listarCocina();
		lC.setVisible(true);
	}
//	vender
	protected void actionPerformedMntmVender(ActionEvent e) {
		vender vC = new vender();
		vC.setVisible(true);
	}
	// generar reporte
	protected void actionPerformedMntmGenerarReporte(ActionEvent e) {
		generarReporte gR = new generarReporte();
		gR.setVisible(true);
	}
	// config descuento
	protected void actionPerformedMntmConfigurarDescuento(ActionEvent e) {
		configDescuento cD = new configDescuento();
		cD.setVisible(true);
	}
	// OBSEQUIO
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {
		configObsequio cO = new configObsequio();
		cO.setVisible(true);
	}
	// cantida optima
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		configCantOptima cCO = new configCantOptima();
		cCO.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		configCuotaDiaria cCD = new configCuotaDiaria();
		cCD.setVisible(true);
	}
	// acerca de la tienda
	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
		about aT = new about();
		aT.setVisible(true);
	}
}
