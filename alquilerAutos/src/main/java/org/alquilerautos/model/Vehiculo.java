package org.alquilerautos.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name ="tb_vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int codVehiculo;
	
	private String placa;
	
	private String modelo;
	
	private int tipo;
	
	private String color;
	
	private int añofabrica;
	
	private String kilometro;
	
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "vehiculo_usuario",
			joinColumns = @JoinColumn(
		            name = "vehiculor_id", referencedColumnName = "codVehiculo"),
			inverseJoinColumns = @JoinColumn(
				            name = "usuario_id", referencedColumnName = "id"))
	
	private Collection<User> roles;
	

	public Vehiculo(int codVehiculo, String placa, String modelo, int tipo, String color, int añofabrica,
			String kilometro) {
		super();
		this.codVehiculo = codVehiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.color = color;
		this.añofabrica = añofabrica;
		this.kilometro = kilometro;
	}





	public int getCodVehiculo() {
		return codVehiculo;
	}




	public void setCodVehiculo(int codVehiculo) {
		this.codVehiculo = codVehiculo;
	}




	public String getPlaca() {
		return placa;
	}




	public void setPlaca(String placa) {
		this.placa = placa;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public int getTipo() {
		return tipo;
	}




	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getAñofabrica() {
		return añofabrica;
	}




	public void setAñofabrica(int añofabrica) {
		this.añofabrica = añofabrica;
	}




	public String getKilometro() {
		return kilometro;
	}




	public void setKilometro(String kilometro) {
		this.kilometro = kilometro;
	}
	
	
	
	

	
	
	
}
