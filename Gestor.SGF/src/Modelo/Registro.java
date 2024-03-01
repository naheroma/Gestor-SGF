package Modelo;

import java.time.LocalDate;

public class Registro {
	
	private int numeroDeOrden;
	private LocalDate fecha;
	private String nombre;
	private String arreglo;
	private float precio;
	private String estado;
	private String contraseña;

	
	// Creacion del constructor
	public Registro() {
		numeroDeOrden = 1;
		fecha = LocalDate.of(2024, 3, 1);
		nombre = "Leandro";
		arreglo = "zzz";
		precio = 0;
		estado = "reparado";
		contraseña = "lalala";
	}
	
	// Metodos
	
	private int getNumeroDeOrden() {
		return numeroDeOrden;
	}


	private void setNumeroDeOrden(int numeroDeOrden) {
		this.numeroDeOrden = numeroDeOrden;
	}


	private LocalDate getFecha() {
		return fecha;
	}


	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	private String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private String getArreglo() {
		return arreglo;
	}


	private void setArreglo(String arreglo) {
		this.arreglo = arreglo;
	}


	private float getPrecio() {
		return precio;
	}


	private void setPrecio(float precio) {
		this.precio = precio;
	}


	private String getEstado() {
		return estado;
	}


	private void setEstado(String estado) {
		this.estado = estado;
	}


	private String getContraseña() {
		return contraseña;
	}


	private void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}


