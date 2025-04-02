package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class CompaniaClass {

	public int idcompania;
	public String razonsocial;
	public String direccion;
	public String telefono; 
	public String fechacreacion; 
	public String correo;
	public String web;
	public CompaniaClass(int idcompania, String razonsocial, String direccion, String telefono, String fechacreacion,
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
	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
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

	public void create(int idcompania, String razonsocial, String direccion, String correo, String telefono, String fechacreacion, String web) {
		Connection dbConnection = null;
		PreparedStatement pst = null;

		String script = "INSERT INTO tblcompania (idcompania, razonsocial, direccion, correo, telefono, fechacreacion, web) values(?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			pst.setInt(1, idcompania);
			pst.setString(2, razonsocial);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, telefono);
			pst.setString(6, fechacreacion);
			pst.setString(7, web);
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	

	public void delete(int idcompania) {

		Connection dbConnection = null;

		PreparedStatement pst = null; //Preparar la trx

		String script = "DELETE FROM tblcompania WHERE idcompania = ?";

		try {

		dbConnection = conector.conectarBD(); //Abrir la conexión

		pst = dbConnection.prepareStatement (script); //Abrir el buffer

		//Parametrizar el campo

		pst.setInt(1,idcompania);

		//Confirmar la operación

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registo No. "+ idcompania + "?");

		if (resp == JOptionPane.OK_OPTION) {

		//Ejecutar la Trx

		pst.executeUpdate();

		JOptionPane.showConfirmDialog(null, "Registro No. "+idcompania+" eliminado");

		}

		} catch (SQLException e) {

		System.out.println(e.getMessage());

		}
	}
	
}