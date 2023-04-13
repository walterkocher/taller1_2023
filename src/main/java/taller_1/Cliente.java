package taller_1;

import java.util.ArrayList;
import taller_1.Compra;

public class Cliente {
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private String estCivil;
	private String ciudad;
	private ArrayList<Compra> compra = new ArrayList<Compra>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstCivil() {
		return this.estCivil;
	}

	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Cliente(Sting nombre, String apellido, String correo, String telefono, String estCivil, String ciudad) {
		throw new UnsupportedOperationException();
	}
}