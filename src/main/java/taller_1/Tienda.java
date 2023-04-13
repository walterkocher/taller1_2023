package taller_1;

import java.util.ArrayList;
import taller_1.Dispositivo;
import taller_1.Cliente;
import taller_1.Compra;

public class Tienda {
	private String direccion;
	private ArrayList<Dispositivo> dispositivo = new ArrayList<Dispositivo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Compra> compra = new ArrayList<Compra>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Dispositivo buscarDispMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	public Dispositivo buscarDispModelo(String modelo) {
		throw new UnsupportedOperationException();
	}

	public Dispositivo buscarDispTipo(String tipo) {
		throw new UnsupportedOperationException();
	}

	public void realizarCompra(Compra compra) {
		throw new UnsupportedOperationException();
	}
}