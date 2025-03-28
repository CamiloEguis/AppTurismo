package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textModelo;
	private JTextField textMarca;
	private JTextField textCategoria;
	private JTextField textPlaca;
	private JTextField textNumeroMotor;
	private JTextField textPuestos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmVehiculo frame = new FrmVehiculo();
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
	public FrmVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(10, 11, 65, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 43, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 80, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(10, 119, 65, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(10, 155, 46, 14);
		contentPane.add(lblPlaca);
		
		JLabel lblNumeroMotor = new JLabel("Numero De Motor:");
		lblNumeroMotor.setBounds(10, 192, 90, 14);
		contentPane.add(lblNumeroMotor);
		
		JLabel lblPuestos = new JLabel("Puestos:");
		lblPuestos.setBounds(10, 217, 46, 14);
		contentPane.add(lblPuestos);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(110, 8, 86, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setBounds(110, 40, 86, 20);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(110, 77, 86, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textCategoria = new JTextField();
		textCategoria.setBounds(110, 116, 86, 20);
		contentPane.add(textCategoria);
		textCategoria.setColumns(10);
		
		textPlaca = new JTextField();
		textPlaca.setBounds(110, 155, 86, 20);
		contentPane.add(textPlaca);
		textPlaca.setColumns(10);
		
		textNumeroMotor = new JTextField();
		textNumeroMotor.setBounds(110, 189, 86, 20);
		contentPane.add(textNumeroMotor);
		textNumeroMotor.setColumns(10);
		
		textPuestos = new JTextField();
		textPuestos.setBounds(110, 214, 86, 20);
		contentPane.add(textPuestos);
		textPuestos.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(274, 115, 89, 23);
		contentPane.add(btnGuardar);
	}

}
