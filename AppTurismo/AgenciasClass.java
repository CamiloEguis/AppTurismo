package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class AgenciasClass {
	
	public String nombre;
	public String direccion;
	public String telefono;
	public String correo;
	public String web;
	public int idagencia;
	public AgenciasClass(String nombre, String direccion, String telefono, String correo, String web,
			int idagencia) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.web = web;
		this.idagencia = idagencia;
		
	}
	public AgenciasClass() {
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWed() {
		return web;
	}
	public void setWed(String web) {
		this.web = web;
	}
	public int getIdcompania() {
		return idagencia;
	}
	public void setIdcompania(int idagencia) {
		this.idagencia = idagencia;
	}
	
	Conexion conector = new Conexion();

	public void create(String nombre, String direccion, String telefono, String correo, String web,
			int idagencia) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblagencias (nombre, direccion, telefono, correo,  web, Idagencia) values(?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setString(1, nombre);
			pst.setString(2, direccion);
			pst.setString(3, telefono);
			pst.setString(4, correo);
			pst.setString(5, web);
			pst.setLong(6, idagencia);
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
