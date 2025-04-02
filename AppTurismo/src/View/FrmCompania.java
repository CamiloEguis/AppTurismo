package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Model.CompaniaClass;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmCompania extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCorreo;
	private JTextField textDireccion;
	private JTextField textFechaCreacion;
	private JTextField textRazonSocial;
	private JTextField textTelefono;
	private JTextField textWeb;
	private JLabel lblIdCompania;
	private JTextField textIdCompania;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCompania frame = new FrmCompania();
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
	public FrmCompania() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(10, 30, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 69, 61, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblFechaCreacion = new JLabel("Fecha De Creacion:");
		lblFechaCreacion.setBounds(10, 106, 94, 14);
		contentPane.add(lblFechaCreacion);
		
		JLabel lblRazonSocial = new JLabel("Razon Social:");
		lblRazonSocial.setBounds(10, 144, 73, 14);
		contentPane.add(lblRazonSocial);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 184, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setBounds(10, 221, 46, 14);
		contentPane.add(lblWeb);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(118, 27, 86, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(128, 66, 86, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textFechaCreacion = new JTextField();
		textFechaCreacion.setBounds(138, 103, 86, 20);
		contentPane.add(textFechaCreacion);
		textFechaCreacion.setColumns(10);
		
		textRazonSocial = new JTextField();
		textRazonSocial.setBounds(118, 141, 86, 20);
		contentPane.add(textRazonSocial);
		textRazonSocial.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(98, 181, 86, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textWeb = new JTextField();
		textWeb.setBounds(58, 218, 86, 20);
		contentPane.add(textWeb);
		textWeb.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CompaniaClass cr = new CompaniaClass();
				cr.create(Integer.parseInt(textIdCompania.getText()),textRazonSocial.getText(), textDireccion.getText(), textCorreo.getText(), textTelefono.getText(), textFechaCreacion.getText(), textWeb.getText());

			}
		});
		btnGuardar.setBounds(272, 102, 89, 23);
		contentPane.add(btnGuardar);
		
		lblIdCompania = new JLabel("Id Compania:");
		lblIdCompania.setBounds(241, 30, 73, 14);
		contentPane.add(lblIdCompania);
		
		textIdCompania = new JTextField();
		textIdCompania.setBounds(320, 27, 86, 20);
		contentPane.add(textIdCompania);
		textIdCompania.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
		            int id = Integer.parseInt(textIdCompania.getText());
		            CompaniaClass obj = new CompaniaClass();
		            obj.delete(id);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		}});
				
		
		btnEliminar.setBounds(272, 157, 89, 23);
		contentPane.add(btnEliminar);
	}

}
