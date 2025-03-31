package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class OperadorClas {

	public int tipodocumento; 
	public int documento; 
	public String nombre; 
	public String apellido; 
	public String direccion; 
	public String correo; 
	public String telefono;
	public OperadorClas(int tipodocumento, int documento, String nombre, String apellido,
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
	
	public void create(int tipodocumento, int documento, String nombre, String apellido,
			String direccion, String correo, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tbloperador (tipodocumento, documento, nombre, apellido, direccion, correo, telefono) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, telefono);
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	
		}
	}
}