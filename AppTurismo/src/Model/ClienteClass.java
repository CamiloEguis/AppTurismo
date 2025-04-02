package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class ClienteClass {

	public int idcliente;	
	public int tipodocumento;
	public int documento;
	public String nombre;
	public String apellidos;
	public String eps;
	public String alergias;
	public String fechanacimiento;
	public String correo;
	public String estadocivil;
	public String direccion;
	public String telefonico;
	public ClienteClass(int idcliente, int tipodocumento, int documento, String nombre, String apellidos, String eps,
			String alergias, String fechanacimiento, String correo, String estadocivil, String direccion, String telefonico) {
		super();
		
		this.idcliente = idcliente;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.eps = eps;
		this.alergias = alergias;
		this.fechanacimiento = fechanacimiento;
		this.correo = correo;
		this.estadocivil = estadocivil;
		this.direccion = direccion;
		this.telefonico = telefonico;
	
	}
	public ClienteClass() {
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefonico() {
		return telefonico;
	}
	public void setTelefonico(String telefonico) {
		this.telefonico = telefonico;
	}
	

	Conexion conector = new Conexion();

	public void create(int idcliente, int tipodocumento, int documento, String nombre, String apellidos, String eps,
			String alergias, String fechanacimiento, String correo, String estadocivil, String direccion, String telefonico) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblcliente (idcliente, tipodocumento, documento, nombre, apellidos, eps, alergias, fechanacimiento, correo, estadocivil, direccion, telefonico) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(1, idcliente);
			pst.setInt(2, tipodocumento);
			pst.setInt(3, documento);
			pst.setString(4, nombre);
			pst.setString(5, apellidos);
			pst.setString(6, eps);
			pst.setString(7, alergias);
			pst.setString(8, fechanacimiento);
			pst.setString(9, correo);
			pst.setString(10, estadocivil);
			pst.setString(11, direccion);
			pst.setString(12, telefonico);
			
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	
		}
	}
	
	public void delete(int idcliente) {

		Connection dbConnection = null;

		PreparedStatement pst = null; //Preparar la trx

		String script = "DELETE FROM tblcliente WHERE idcliente = ?";

		try {

		dbConnection = conector.conectarBD(); //Abrir la conexión

		pst = dbConnection.prepareStatement (script); //Abrir el buffer

		//Parametrizar el campo

		pst.setInt(1, idcliente);

		//Confirmar la operación

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registo No. "+ idcliente + "?");

		if (resp == JOptionPane.OK_OPTION) {

		//Ejecutar la Trx

		pst.executeUpdate();

		JOptionPane.showConfirmDialog(null, "Registro No. "+idcliente+" eliminado");

		}

		} catch (SQLException e) {

		System.out.println(e.getMessage());

		}
	}
	
}