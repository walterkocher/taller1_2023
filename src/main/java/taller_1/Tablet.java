package taller_1;

import java.util.ArrayList;

public class Tablet extends Dispositivo {
	private String resolucion;
	private ArrayList<String> accesorios;

	public String getResolucion() {
		return this.resolucion;
	}

	public ArrayList<String> getAccesorios() {
		throw new UnsupportedOperationException();
	}

	public void setAccesorios(ArrayList<String> accesorios) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		return "tablet";
	}

	public String toString() {
		return "marca:"+getMarca()+" ram: "+getRam()+" alamacenamiento: "+getAlmacenamiento()+" procesador: "+getProcesador()+"modelo: "+getModelo()+" año de fabricacion: "+getAnoFab()+" precio: "+getPrecio()+" stock: "+getStock()+" resolucion: "+getResolucion()+" accesorios: "+getAccesorios();
	}

	public Tablet(String marca, String ram, String almacenamiento, String procesador, String modelo, int anoFab, int precio, int stock, String resolucion, ArrayList<String> accesorios) {
		super(marca, ram, almacenamiento, procesador, modelo, anoFab, precio, stock);
		this.resolucion=resolucion;
		this.accesorios=accesorios;
	}
}