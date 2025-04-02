package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.Conexion;

public class Vehiculo {
	
	public int matricula;
	public int placa;
	public String marca;
	public int puestos;
	public String modelo;
	public String numeromotor;
	public String categoria;
	public Vehiculo(int matricula, int placa, String marca, int puestos, String modelo, String numeromotor,
			String categoria) {
		super();
		this.matricula = matricula;
		this.placa = placa;
		this.marca = marca;
		this.puestos = puestos;
		this.modelo = modelo;
		this.numeromotor = numeromotor;
		this.categoria = categoria;
	}
	public Vehiculo() {
	
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(String numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
Conexion conector = new Conexion();
	
	public void create(int matricula, int placa, int puestos, String marca, String modelo, String numeromotor,
			String categoria) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx

		String script = "INSERT INTO tblvehiculo (matricula, placa, marca, puestos, modelo, numeromotor, categoria) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			dbConnection = conector.conectarBD();
			pst = dbConnection.prepareStatement(script);
			// PARAMETRIZAR LOS CAMPOS
			pst.setInt(1, matricula);
			pst.setInt(2, placa);
			pst.setString(3, marca);
			pst.setInt(4, puestos);
			pst.setString(5, modelo);
			pst.setString(6, numeromotor);
			pst.setString(7, categoria);
			;
			
			// ejecutar la trx
			pst.execute();
			JOptionPane.showConfirmDialog(null, "Registro con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	

}
}
	
	public void delete(int matricula) {

		Connection dbConnection = null;

		PreparedStatement pst = null; //Preparar la trx

		String script = "DELETE FROM tblvehiculo WHERE matricula = ?";

		try {

		dbConnection = conector.conectarBD(); //Abrir la conexión

		pst = dbConnection.prepareStatement (script); //Abrir el buffer

		//Parametrizar el campo

		pst.setInt(1, matricula);

		//Confirmar la operación

		int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registo No. "+ matricula + "?");

		if (resp == JOptionPane.OK_OPTION) {

		//Ejecutar la Trx

		pst.executeUpdate();

		JOptionPane.showConfirmDialog(null, "Registro No. "+matricula+" eliminado");

		}

		} catch (SQLException e) {

		System.out.println(e.getMessage());

		}
	}
	
}


