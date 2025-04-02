package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class OperadorClas {

	public int idoperador;
	public int tipodocumento; 
	public int documento; 
	public String nombre; 
	public String apellido; 
	public String direccion; 
	public String correo; 
	public String telefono;
	public OperadorClas(int idoperador, int tipodocumento, int documento, String nombre, String apellido,
			String direccion, String correo, String telefono) {
		super();
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
	
	}
	
	
	public OperadorClas() {
		super();
	}
	
	

	public int getIdoperador() {
		return idoperador;
	}


	public void setIdoperador(int idoperador) {
		this.idoperador = idoperador;
	}


	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
	
	Conexion conector = new Conexion();
	
	public void create(int idoperador, int tipodocumento, int documento, String nombre, String apellido,
			String direccion, String correo, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tbloperador (idoperador, tipodocumento, documento, nombre, apellido, direccion, correo, telefono) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(1, idoperador);
			pst.setInt(2, tipodocumento);
			pst.setInt(3, documento);
			pst.setString(4, nombre);
			pst.setString(5, apellido);
			pst.setString(6, direccion);
			pst.setString(7, correo);
			pst.setString(8, telefono);
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	
		}
	}
	
	public void delete(int idoperador) {

		Connection dbConnection = null;

		PreparedStatement pst = null; //Preparar la trx

		String script = "DELETE FROM tbloperador WHERE idoperador = ?";

		try {

		dbConnection = conector.conectarBD(); //Abrir la conexión

		pst = dbConnection.prepareStatement (script); //Abrir el buffer

		//Parametrizar el campo

		pst.setInt(1, idoperador);

		//Confirmar la operación

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registo No. "+ idoperador + "?");

		if (resp == JOptionPane.OK_OPTION) {

		//Ejecutar la Trx

		pst.executeUpdate();

		JOptionPane.showConfirmDialog(null, "Registro No. "+idoperador+" eliminado");

		}

		} catch (SQLException e) {

		System.out.println(e.getMessage());

		}
	}
	
}