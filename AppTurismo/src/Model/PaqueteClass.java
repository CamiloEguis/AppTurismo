package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class PaqueteClass {

	public int codigo;
	public int iddestino; 
	public int idorigen; 
	public String fechaventa; 
	public String horaventa;
	public String horasalida;
	public String fechaejecucion;
	public String observaciones;
	public String precio;
	public PaqueteClass(int codigo, int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observaciones, String precio) {
		super();
		this.codigo = codigo;
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.horasalida = horasalida;
		this.fechaejecucion = fechaejecucion;
		this.observaciones = observaciones;
		this.precio = precio;
	
	}
	public PaqueteClass() {		
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getobservaciones() {
		return observaciones;
	}
	public void setobservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
Conexion conector = new Conexion();
	
	public void create(int codigo, int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observaciones, String precio) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblpaquete (codigo, iddestino, idorigen, fechaventa, horaventa, horasalida, fechaejecucion, observaciones, precio) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(1, codigo);
			pst.setInt(2, iddestino);
			pst.setInt(3, idorigen);
			pst.setString(4, fechaventa);
			pst.setString(5, horaventa);
			pst.setString(6, horasalida);
			pst.setString(7, fechaejecucion);
			pst.setString(8, observaciones);
			pst.setString(9, precio);
			;
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	
		}
	}
	
	public void delete(int codigo) {

		Connection dbConnection = null;

		PreparedStatement pst = null; //Preparar la trx

		String script = "DELETE FROM tblpaquete WHERE codigo = ?";

		try {

		dbConnection = conector.conectarBD(); //Abrir la conexión

		pst = dbConnection.prepareStatement (script); //Abrir el buffer

		//Parametrizar el campo

		pst.setInt(1, codigo);

		//Confirmar la operación

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registo No. "+ codigo + "?");

		if (resp == JOptionPane.OK_OPTION) {

		//Ejecutar la Trx

		pst.executeUpdate();

		JOptionPane.showConfirmDialog(null, "Registro No. "+codigo+" eliminado");

		}

		} catch (SQLException e) {

		System.out.println(e.getMessage());

		}
	}
	
}
