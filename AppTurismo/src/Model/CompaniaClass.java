package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class CompaniaClass {

	public String razonsocial;
	public String direccion;
	public String telefono; 
	public String fechacreacion; 
	public String correo;
	public String web;
	public CompaniaClass(String razonsocial, String direccion, String telefono, String fechacreacion,
			String correo, String web) {
		super();
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechacreacion = fechacreacion;
		this.correo = correo;
		this.web = web;
	
	}
	public CompaniaClass(){
		
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	Conexion conector = new Conexion();

	public void create(String razonsocial, String direccion, String correo, String telefono, String fechacreacion, String web) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblcompania (razonsocial, direccion, correo, telefono, fechacreacion, web) values(?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correo);
			pst.setString(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
}