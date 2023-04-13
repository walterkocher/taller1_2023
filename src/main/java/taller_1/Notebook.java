package taller_1;

public class Notebook extends Dispositivo {
	private String resolucion;
	private String tipTeclado;
	private String bateria;

	public String getResolucion() {
		return this.resolucion;
	}

	public String getTipTeclado() {
		return this.tipTeclado;
	}

	public String getBateria() {
		return this.bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public String getTipo() {
		return "notebook";
	}

	public String toString() {
		return "marca:"+getMarca()+" ram: "+getRam()+" alamacenamiento: "+getAlmacenamiento()+" procesador: "+getProcesador()+"modelo: "+getModelo()+" año de fabricacion: "+getAnoFab()+" precio: "+getPrecio()+" stock: "+getStock()+" resolucion: "+getResolucion()+" tipo de teclado: "+getTipTeclado()+" bateria: "+getBateria();
	}

	public Notebook(String marca, String ram, String almacenamiento, String procesador, String modelo, int anoFab, int precio, int stock, String resolucion, String tipTeclado, String bateria) {
		super(marca, ram, almacenamiento, procesador, modelo, anoFab, precio, stock);
		this.resolucion=resolucion;
		this.tipTeclado=tipTeclado;
		this.bateria=bateria;
	}
}