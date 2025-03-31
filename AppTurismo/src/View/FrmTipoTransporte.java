package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Model.TipoTransporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmTipoTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textObservacion;
	private JTextField textIdTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTipoTransporte frame = new FrmTipoTransporte();
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
	public FrmTipoTransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(70, 74, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion:");
		lblObservacion.setBounds(70, 139, 70, 14);
		contentPane.add(lblObservacion);
		
		textNombre = new JTextField();
		textNombre.setBounds(175, 71, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textObservacion = new JTextField();
		textObservacion.setBounds(175, 136, 86, 20);
		contentPane.add(textObservacion);
		textObservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TipoTransporte cr = new TipoTransporte();
				cr.create(Integer.parseInt(textIdTipo.getText()),textNombre.getText(),textObservacion.getText());
			}
		});
		btnGuardar.setBounds(301, 104, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdTipo = new JLabel("Id Tipo:");
		lblIdTipo.setBounds(70, 35, 46, 14);
		contentPane.add(lblIdTipo);
		
		textIdTipo = new JTextField();
		textIdTipo.setBounds(175, 32, 86, 20);
		contentPane.add(textIdTipo);
		textIdTipo.setColumns(10);
	}
}
