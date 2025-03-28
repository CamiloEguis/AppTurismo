package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Model.ClienteClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textAlergias;
	private JTextField textDocumento;
	private JTextField textTipoDocumento;
	private JTextField textEps;
	private JTextField textEstadoCivil;
	private JTextField textFechaNacimiento;
	private JTextField textTelefonico;
	private JTextField textCorreo;
	private JTextField textDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCliente frame = new FrmCliente();
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
	public FrmCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlergias = new JLabel("Alergias:");
		lblAlergias.setBounds(10, 59, 46, 14);
		contentPane.add(lblAlergias);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 36, 46, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 109, 63, 14);
		contentPane.add(lblDocumento);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(10, 234, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblEps = new JLabel("Eps:");
		lblEps.setBounds(10, 134, 46, 14);
		contentPane.add(lblEps);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 159, 63, 14);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha De Nacimiento:");
		lblFechaNacimiento.setBounds(10, 184, 104, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblTelefonico = new JLabel("Telefonico:");
		lblTelefonico.setBounds(10, 209, 46, 14);
		contentPane.add(lblTelefonico);
		
		JLabel lblTipoDocumento = new JLabel("Tipo De Documento:");
		lblTipoDocumento.setBounds(10, 84, 104, 14);
		contentPane.add(lblTipoDocumento);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(266, 11, 71, 14);
		contentPane.add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(324, 8, 86, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(122, 8, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(122, 33, 86, 20);
		contentPane.add(textApellidos);
		textApellidos.setColumns(10);
		
		textAlergias = new JTextField();
		textAlergias.setBounds(122, 56, 86, 20);
		contentPane.add(textAlergias);
		textAlergias.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(122, 106, 86, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setBounds(122, 81, 86, 20);
		contentPane.add(textTipoDocumento);
		textTipoDocumento.setColumns(10);
		
		textEps = new JTextField();
		textEps.setBounds(122, 131, 86, 20);
		contentPane.add(textEps);
		textEps.setColumns(10);
		
		textEstadoCivil = new JTextField();
		textEstadoCivil.setBounds(122, 156, 86, 20);
		contentPane.add(textEstadoCivil);
		textEstadoCivil.setColumns(10);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setBounds(122, 181, 86, 20);
		contentPane.add(textFechaNacimiento);
		textFechaNacimiento.setColumns(10);
		
		textTelefonico = new JTextField();
		textTelefonico.setBounds(122, 206, 86, 20);
		contentPane.add(textTelefonico);
		textTelefonico.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(122, 231, 86, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ClienteClass cr = new ClienteClass();
				cr.create(Integer.parseInt(textTipoDocumento.getText()),Integer.parseInt(textDocumento.getText()), textNombre.getText(), textApellidos.getText(), textEps.getText(),
				textAlergias.getText(),textFechaNacimiento.getText(),textCorreo.getText(), textEstadoCivil.getText(), textDireccion.getText(),  textTelefonico.getText());
			
			}
		});
		btnRegistrar.setBounds(324, 105, 89, 23);
		contentPane.add(btnRegistrar);

	}
}
