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
		for(Dispositivo dispositivo1: this.dispositivo) {
			if (dispositivo1.getMarca().equals(marca)) {
				return dispositivo1;
			}
		}
		return null;
	}

	public Dispositivo buscarDispModelo(String modelo) {
		for(Dispositivo dispositivo1: this.dispositivo) {
			if (dispositivo1.getModelo().equals(modelo)) {
				return dispositivo1;
			}
		}
		return null;
	}

	public Dispositivo buscarDispTipo(String tipo) {
		for(Dispositivo dispositivo1: this.dispositivo) {
			if (dispositivo1.getTipo().equals(tipo)) {
				return dispositivo1;
			}
		}
		return null;
	}

	public void realizarCompra(Compra compra) {


	}
	public Cliente agregarClientes(Cliente cliente) {
		for(Cliente cliente1: this.clientes) {
			if (cliente1.getNombre().equals(cliente.getNombre()) && cliente1.getApellido().equals(cliente.getApellido())) {
				clientes.add(cliente);
			}
		}
		return null;
	}
}