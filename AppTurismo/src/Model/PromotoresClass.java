package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class PromotoresClass {

	public int idpromotor;
	public String nombre; 
	public String apellido; 
	public String tipodocumento; 
	public int documento; 
	public String direccion; 
	public String correopersonal; 
	public String correocorp; 
	public String fechanacimiento; 
	public String telefono;
	public PromotoresClass(int idpromotor,String nombre, String apellido, String tipodocumento, int documento,
			String direccion, String correopersonal, String correocorp, String fechanacimiento, String telefono) {
		super();
		this.idpromotor = idpromotor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.correocorp = correocorp;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
	
	}
	public PromotoresClass() {		
		
	}
	public int getIdpromotor() {
		return idpromotor;
	}
	public void setIdpromotor(int idpromotor) {
		this.idpromotor = idpromotor;
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
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
	
Conexion conector = new Conexion();
	
	public void create(int idpromotor,String nombre, String apellido, String tipodocumento, int documento,
			String direccion, String correopersonal, String correocorp, String fechanacimiento, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblpromotores (idpromotor, nombre, apellido, tipodocumento, documento, direccion, correopersonal, correocorp, fechanacimiento, telefono) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(1, idpromotor);
			pst.setString(2, nombre);
			pst.setString(3, apellido);
			pst.setString(4, tipodocumento);
			pst.setInt(5, documento);
			pst.setString(6, direccion);
			pst.setString(7, correopersonal);
			pst.setString(8, correocorp);
			pst.setString(9, fechanacimiento);
			pst.setString(10, telefono);
			;
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	
		}
}
	
	public void delete(int idpromotor) {

		Connection dbConnection = null;

		PreparedStatement pst = null; //Preparar la trx

		String script = "DELETE FROM tblpromotores WHERE idpromotor = ?";

		try {

		dbConnection = conector.conectarBD(); //Abrir la conexión

		pst = dbConnection.prepareStatement (script); //Abrir el buffer

		//Parametrizar el campo

		pst.setInt(1, idpromotor);

		//Confirmar la operación

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registo No. "+ idpromotor + "?");

		if (resp == JOptionPane.OK_OPTION) {

		//Ejecutar la Trx

		pst.executeUpdate();

		JOptionPane.showConfirmDialog(null, "Registro No. "+idpromotor+" eliminado");

		}

		} catch (SQLException e) {

		System.out.println(e.getMessage());

		}
	}
	
}