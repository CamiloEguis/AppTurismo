package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class TipoMedioClass {
	
	public int idtipomedio;
	public String nombre;
	public String observacion;
	
	public TipoMedioClass(int idtipomedio, String nombre, String observacion) {
		super();
		this.nombre = nombre;
		this.observacion = observacion;
	
		
	}
	public TipoMedioClass() {	
		
	}
	public TipoMedioClass(int idtipomedio) {
		super();
		this.idtipomedio = idtipomedio;

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

	public void create(int idtipomedio, String nombre, String observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tbltipomedio (idtipomedio, Nombre, Observacion) values(?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(3, idtipomedio);
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void delete(int idtipomedio) {

		Connection dbConnection = null;

		PreparedStatement pst = null; //Preparar la trx

		String script = "DELETE FROM tbltipomedio WHERE idtipomedio = ?";

		try {

		dbConnection = conector.conectarBD(); //Abrir la conexión

		pst = dbConnection.prepareStatement (script); //Abrir el buffer

		//Parametrizar el campo

		pst.setInt(1, idtipomedio);

		//Confirmar la operación

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registo No. "+ idtipomedio + "?");

		if (resp == JOptionPane.OK_OPTION) {

		//Ejecutar la Trx

		pst.executeUpdate();

		JOptionPane.showConfirmDialog(null, "Registro No. "+idtipomedio+" eliminado");

		}

		} catch (SQLException e) {

		System.out.println(e.getMessage());

		}
	}
}