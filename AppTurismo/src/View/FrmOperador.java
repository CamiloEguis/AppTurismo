package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmOperador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTipoDocumento;
	private JTextField textDocumento;
	private JTextField textCorreo;
	private JTextField textDireccion;
	private JTextField textTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmOperador frame = new FrmOperador();
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
	public FrmOperador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 21, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 52, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTipoDocumento = new JLabel("Tipo De Documento:");
		lblTipoDocumento.setBounds(10, 77, 97, 14);
		contentPane.add(lblTipoDocumento);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 102, 77, 14);
		contentPane.add(lblDocumento);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(10, 127, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 152, 62, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 177, 46, 14);
		contentPane.add(lblTelefono);
		
		textNombre = new JTextField();
		textNombre.setBounds(139, 18, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(108, 49, 86, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setBounds(151, 77, 86, 20);
		contentPane.add(textTipoDocumento);
		textTipoDocumento.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(151, 102, 86, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(93, 127, 86, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(121, 149, 86, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(75, 174, 86, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(299, 102, 89, 23);
		contentPane.add(btnGuardar);
	}

}
