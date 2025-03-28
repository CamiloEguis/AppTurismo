package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.MedioClass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textObservaciones;
	private JTextField textIdTipoMedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMedio frame = new FrmMedio();
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
	public FrmMedio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(54, 86, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(54, 142, 83, 14);
		contentPane.add(lblObservaciones);
		
		textNombre = new JTextField();
		textNombre.setBounds(147, 83, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textObservaciones = new JTextField();
		textObservaciones.setBounds(147, 139, 86, 20);
		contentPane.add(textObservaciones);
		textObservaciones.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MedioClass medio = new MedioClass();
				medio.createMedio(textNombre.getText(), textObservaciones.getText(), Integer.parseInt(textIdTipoMedio.getText()));

				
			}
		});
		btnGuardar.setBounds(282, 106, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdTipoMedio = new JLabel("Id Tipo Medio:");
		lblIdTipoMedio.setBounds(54, 188, 83, 14);
		contentPane.add(lblIdTipoMedio);
		
		textIdTipoMedio = new JTextField();
		textIdTipoMedio.setBounds(147, 185, 86, 20);
		contentPane.add(textIdTipoMedio);
		textIdTipoMedio.setColumns(10);
	}

}
