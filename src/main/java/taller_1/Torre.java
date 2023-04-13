package taller_1;

import java.util.ArrayList;
import taller_1.Pantalla;

public class Torre extends Dispositivo {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private ArrayList<Pantalla> pantalla = new ArrayList<Pantalla>();

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getTipo() {
		return "torre";
	}

	public String toString() {
		return "marca:"+getMarca()+" ram: "+getRam()+" alamacenamiento: "+getAlmacenamiento()+" procesador: "+getProcesador()+"modelo: "+getModelo()+" año de fabricacion: "+getAnoFab()+" precio: "+getPrecio()+" stock: "+getStock()+" tarjeta de video: "+getTarjetaVideo()+" fuente de poder: "+getFuentePoder()+" chasis: "+getChasis();
	}

	public Torre(String marca, String ram, String almacenamiento, String procesador, String modelo, int anoFab, int precio, int stock, String tarjetaVideo, String fuentePoder, String chasis) {
		super(marca, ram, almacenamiento, procesador, modelo, anoFab, precio, stock);
		this.tarjetaVideo=tarjetaVideo;
		this.fuentePoder=fuentePoder;
		this.chasis=chasis;

	}
}