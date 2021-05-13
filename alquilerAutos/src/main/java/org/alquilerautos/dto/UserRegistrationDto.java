package org.alquilerautos.dto;

import javax.persistence.Column;

public class UserRegistrationDto {
	

	private String firstName;

	private String lastName;
	
	private String email;

	private String password;
	private String facceso;
	
	private String telefono;
	
	private String tipo;
	
	private String estado;
	
	private String dni;
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String firstName, String lastName, String email, String password,String facceso,String telefono, String tipo,String estado,String dni) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.facceso = facceso;
		this.telefono = telefono;
		this.tipo = tipo;
		this.estado = estado;
		this.dni = dni;
		
	}
	
	
	
	public String getFacceso() {
		return facceso;
	}

	public void setFacceso(String facceso) {
		this.facceso = facceso;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
