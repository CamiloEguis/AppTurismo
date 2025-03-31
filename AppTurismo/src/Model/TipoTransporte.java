package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class TipoTransporte {
	
	public String nombre;
	public String observacion;
	public TipoTransporte(int idtipo, String nombre, String observacion) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
	
	}
	
	public TipoTransporte() {
		super();
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
	
Conexion conector = new Conexion();
	
	public void create(int idtipo, String nombre, String observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tbltipotransporte (idtipo, nombre, observacion) values(?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(1, idtipo);
			pst.setString(2, nombre);
			pst.setString(3, observacion);
			;
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	

}
}
}