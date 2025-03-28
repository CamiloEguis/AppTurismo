package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class MedioClass {

	
	public String nombre;
	public String observacion;
	public int idtipomedio;
	public MedioClass(String nombre, String observacion, int idtipomedio) {
		super();
		
		this.nombre = nombre;
		this.observacion = observacion;
	
	}
	public MedioClass() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getidtipomedio() {
		return idtipomedio;
	}
	
	Conexion conector = new Conexion();
	
	public void createMedio(String nombre, String observacion, int idtipomedio) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblmedio (nombre, observacion, idtipomedio) values(?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setInt(3, idtipomedio);
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}
	
	}
}