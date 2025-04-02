package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.PaqueteClass;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmPaquete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textIdDestino;
	private JTextField textIdOrigen;
	private JTextField textHoraVenta;
	private JTextField textHoraSalida;
	private JTextField textFechaVenta;
	private JTextField textFechaEjecucion;
	private JTextField textPrecio;
	private JTextField textObservaciones;
	private JLabel lblCodigo;
	private JTextField textCodigo;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPaquete frame = new FrmPaquete();
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
	public FrmPaquete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdDestino = new JLabel("Id Destino:");
		lblIdDestino.setBounds(10, 28, 53, 14);
		contentPane.add(lblIdDestino);
		
		JLabel lblIdOrigen = new JLabel("Id Origen:");
		lblIdOrigen.setBounds(10, 53, 63, 14);
		contentPane.add(lblIdOrigen);
		
		JLabel lblHoraVenta = new JLabel("Hora De Venta:");
		lblHoraVenta.setBounds(10, 78, 74, 14);
		contentPane.add(lblHoraVenta);
		
		JLabel lblHoraSalida = new JLabel("Hora De Salida:");
		lblHoraSalida.setBounds(10, 103, 74, 14);
		contentPane.add(lblHoraSalida);
		
		JLabel lblFechaVenta = new JLabel("Fecha De Venta:");
		lblFechaVenta.setBounds(10, 128, 94, 14);
		contentPane.add(lblFechaVenta);
		
		JLabel lblFechaEjecucion = new JLabel("Fecha De Ejecucion:");
		lblFechaEjecucion.setBounds(10, 153, 94, 14);
		contentPane.add(lblFechaEjecucion);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 178, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(10, 203, 94, 14);
		contentPane.add(lblObservaciones);
		
		textIdDestino = new JTextField();
		textIdDestino.setBounds(114, 25, 86, 20);
		contentPane.add(textIdDestino);
		textIdDestino.setColumns(10);
		
		textIdOrigen = new JTextField();
		textIdOrigen.setBounds(114, 50, 86, 20);
		contentPane.add(textIdOrigen);
		textIdOrigen.setColumns(10);
		
		textHoraVenta = new JTextField();
		textHoraVenta.setBounds(114, 75, 86, 20);
		contentPane.add(textHoraVenta);
		textHoraVenta.setColumns(10);
		
		textHoraSalida = new JTextField();
		textHoraSalida.setBounds(114, 100, 86, 20);
		contentPane.add(textHoraSalida);
		textHoraSalida.setColumns(10);
		
		textFechaVenta = new JTextField();
		textFechaVenta.setBounds(114, 125, 86, 20);
		contentPane.add(textFechaVenta);
		textFechaVenta.setColumns(10);
		
		textFechaEjecucion = new JTextField();
		textFechaEjecucion.setBounds(114, 150, 86, 20);
		contentPane.add(textFechaEjecucion);
		textFechaEjecucion.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(114, 175, 86, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		textObservaciones = new JTextField();
		textObservaciones.setBounds(114, 200, 86, 20);
		contentPane.add(textObservaciones);
		textObservaciones.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				PaqueteClass cr = new PaqueteClass();
				cr.create(Integer.parseInt(textCodigo.getText()),Integer.parseInt(textIdDestino.getText()), Integer.parseInt(textIdOrigen.getText()),
					    textFechaVenta.getText(), textHoraVenta.getText(), textHoraSalida.getText(),
					    textFechaEjecucion.getText(), textObservaciones.getText(), textPrecio.getText());

			}
		});
		btnGuardar.setBounds(275, 99, 89, 23);
		contentPane.add(btnGuardar);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 236, 46, 14);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(114, 231, 86, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
		            int id = Integer.parseInt(textCodigo.getText());
		            PaqueteClass obj = new PaqueteClass();
		            obj.delete(id);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		}});
				
			
		btnEliminar.setBounds(275, 149, 89, 23);
		contentPane.add(btnEliminar);
	}

}
