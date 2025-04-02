package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.PromotoresClass;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmPromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTipoDocumento;
	private JTextField textCorreoCorp;
	private JTextField textCorreoPers;
	private JTextField textFechaNacimiento;
	private JTextField textDocumento;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JLabel lblIdPromotor;
	private JTextField textIdPromotor;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPromotores frame = new FrmPromotores();
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
	public FrmPromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(0, 24, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(0, 49, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTipoDocuemento = new JLabel("Tipo De Documento:");
		lblTipoDocuemento.setBounds(0, 74, 97, 14);
		contentPane.add(lblTipoDocuemento);
		
		JLabel lblCorrepCorp = new JLabel("Correo Corporativo:");
		lblCorrepCorp.setBounds(0, 99, 97, 14);
		contentPane.add(lblCorrepCorp);
		
		JLabel lblCorreoPers = new JLabel("Correo Personal:");
		lblCorreoPers.setBounds(0, 124, 97, 14);
		contentPane.add(lblCorreoPers);
		
		JLabel lblFechaNaciemiento = new JLabel("Fecha De Nacimiento:");
		lblFechaNaciemiento.setBounds(0, 149, 118, 14);
		contentPane.add(lblFechaNaciemiento);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(0, 174, 63, 14);
		contentPane.add(lblDocumento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(0, 199, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(0, 224, 74, 14);
		contentPane.add(lblDireccion);
		
		textNombre = new JTextField();
		textNombre.setBounds(128, 21, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(128, 46, 86, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setBounds(128, 71, 86, 20);
		contentPane.add(textTipoDocumento);
		textTipoDocumento.setColumns(10);
		
		textCorreoCorp = new JTextField();
		textCorreoCorp.setBounds(128, 96, 86, 20);
		contentPane.add(textCorreoCorp);
		textCorreoCorp.setColumns(10);
		
		textCorreoPers = new JTextField();
		textCorreoPers.setBounds(128, 121, 86, 20);
		contentPane.add(textCorreoPers);
		textCorreoPers.setColumns(10);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setBounds(128, 146, 86, 20);
		contentPane.add(textFechaNacimiento);
		textFechaNacimiento.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(128, 171, 86, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(128, 196, 86, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(128, 221, 86, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				PromotoresClass cr = new PromotoresClass();
				cr.create(Integer.parseInt(textIdPromotor.getText()),textNombre.getText(), textApellido.getText(),textTipoDocumento.getText(),Integer.parseInt(textDocumento.getText()),
						textDireccion.getText(), textCorreoPers.getText(), textCorreoCorp.getText(), textFechaNacimiento.getText(), textTelefono.getText());
			}
		});
		btnGuardar.setBounds(291, 120, 89, 23);
		contentPane.add(btnGuardar);
		
		lblIdPromotor = new JLabel("Id Promotor:");
		lblIdPromotor.setBounds(232, 24, 74, 14);
		contentPane.add(lblIdPromotor);
		
		textIdPromotor = new JTextField();
		textIdPromotor.setBounds(324, 21, 86, 20);
		contentPane.add(textIdPromotor);
		textIdPromotor.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
		            int id = Integer.parseInt(textIdPromotor.getText());
		            PromotoresClass obj = new PromotoresClass();
		            obj.delete(id);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		}});
			
		btnEliminar.setBounds(291, 170, 89, 23);
		contentPane.add(btnEliminar);
	}

}
