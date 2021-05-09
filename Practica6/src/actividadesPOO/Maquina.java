package actividadesPOO;

import java.time.LocalDate;

public class Maquina {
	private String descripcion;
	private java.time.LocalDate fechaAdqui = null;
	private float costo;
	
	public Maquina(String descripcion, LocalDate fechaAdqui, float costo) {
		super();
		this.descripcion = descripcion;
		this.fechaAdqui = fechaAdqui;
		this.costo = costo;
	}
	
	public String getdescripcion() {
		return descripcion;
	}
	public java.time.LocalDate getfechaAdqui() {
		return fechaAdqui;
	}
	public void setFechaAdqui(java.time.LocalDate fechaAdqui) {
		this.fechaAdqui = fechaAdqui;
	}
	public float getcosto() {
		return costo;
	}
	public void setcosto(float costo) {
		this.costo = costo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}
