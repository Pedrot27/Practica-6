package actividadesPOO;

import java.time.LocalDate;

public  class Lavado extends Maquina {
	private float capacidadL;
	private float timelavado;
	
	public Lavado(String descripcion, LocalDate fechaAdqui, float costo, float capacidadL, float timelavado) {
		super(descripcion, fechaAdqui, costo);
		this.capacidadL= capacidadL;
		this.timelavado= timelavado;
	}
	public void mostrarDatos() {
		System.out.println("Descripcion:"+getdescripcion()+
				"\nFecha Adquisicion:"+getfechaAdqui()+
				"\nCosto:"+getcosto()+
				"\nCapacidad Litros:"+capacidadL+
				"\nTiempo de Lavado:"+timelavado+" minutos");
			}
	
	
	
	@Override
	public String toString() {
		return "Lavado [capacidadL=" + capacidadL + ", timelavado=" + timelavado + "]";
	}
	

}
