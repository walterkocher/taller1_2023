package taller_1;

public abstract class Dispositivo {
	private String marca;
	private String ram;
	private String almacenamiento;
	private String procesador;
	private String modelo;
	private int anoFab;
	private int precio;
	private int stock;

	public String getMarca() {
		return this.marca;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAnoFab() {
		return this.anoFab;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public abstract String getTipo();

	public Dispositivo(String marca, String ram, String almacenamiento, String procesador, String modelo, int anoFab, int precio, int stock) {
		this.marca=marca;
		this.ram=ram;
		this.almacenamiento=almacenamiento;
		this.procesador=procesador;
		this.modelo=modelo;
		this.anoFab=anoFab;
		this.precio=precio;
		this.stock=stock;
	}
}