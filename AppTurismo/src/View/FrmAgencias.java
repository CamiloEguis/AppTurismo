package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.AgenciasClass;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmAgencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCorreo;
	private JTextField textDireccion;
	private JTextField textIdAgencia;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textWeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAgencias frame = new FrmAgencias();
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
	public FrmAgencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(154, 25, 86, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(154, 56, 86, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textIdAgencia = new JTextField();
		textIdAgencia.setBounds(154, 98, 86, 20);
		contentPane.add(textIdAgencia);
		textIdAgencia.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(154, 129, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(154, 160, 86, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textWeb = new JTextField();
		textWeb.setBounds(154, 191, 86, 20);
		contentPane.add(textWeb);
		textWeb.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(78, 28, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(78, 59, 66, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblIdAgencia = new JLabel("IdAgencia:");
		lblIdAgencia.setBounds(66, 93, 66, 14);
		contentPane.add(lblIdAgencia);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(78, 132, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(78, 163, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setBounds(88, 194, 46, 14);
		contentPane.add(lblWeb);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AgenciasClass cr = new AgenciasClass();
				cr.create(textNombre.getText(), textDireccion.getText(), textTelefono.getText(), textCorreo.getText(), textWeb.getText(),Integer.parseInt(textIdAgencia.getText()));
			}
		});
		btnGuardar.setBounds(291, 117, 89, 23);
		contentPane.add(btnGuardar);
	}
}
