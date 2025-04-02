package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoMedioClass;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmTipoMedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textObservacion;
	private JTextField textIdTipoMedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTipoMedio frame = new FrmTipoMedio();
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
	public FrmTipoMedio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(52, 98, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblObservacion = new JLabel("Observacion:");
		lblObservacion.setBounds(52, 163, 72, 14);
		contentPane.add(lblObservacion);
		
		textNombre = new JTextField();
		textNombre.setBounds(183, 95, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textObservacion = new JTextField();
		textObservacion.setBounds(183, 160, 86, 20);
		contentPane.add(textObservacion);
		textObservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				TipoMedioClass cr = new TipoMedioClass();
				cr.create(Integer.parseInt(textIdTipoMedio.getText()),textNombre.getText(), textObservacion.getText());
			}
		});
		btnGuardar.setBounds(301, 121, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
		            int id = Integer.parseInt(textIdTipoMedio.getText());
		            TipoMedioClass obj = new TipoMedioClass();
		            obj.delete(id);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		}});
			
		btnEliminar.setBounds(301, 189, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblIdTipoMedio = new JLabel("Id Tipo Medio:");
		lblIdTipoMedio.setBounds(52, 35, 72, 14);
		contentPane.add(lblIdTipoMedio);
		
		textIdTipoMedio = new JTextField();
		textIdTipoMedio.setBounds(183, 32, 86, 20);
		contentPane.add(textIdTipoMedio);
		textIdTipoMedio.setColumns(10);
	}
}
