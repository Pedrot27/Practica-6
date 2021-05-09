package actividadesPOO;

import java.time.LocalDate;

public class Empacado extends Maquina {
	private int carton;
	private float empaquesMinuto;
	
	public Empacado(String descripcion, LocalDate fechaAdqui, float costo,int carton, float empaquesMinuto){
		super(descripcion, fechaAdqui, costo);
		this.carton= carton;
		this.empaquesMinuto= empaquesMinuto;
	}
	public void mostrarDatos3() {
		System.out.println("Descripcion:"+getdescripcion()+
				"\nFecha Adquisicion:"+getfechaAdqui()+
				"\nCosto:"+getcosto()+
				"\nCarton de:"+carton+
				"\nCantidad de empaques por minuto:"+empaquesMinuto);
			}
	@Override
	public String toString() {
		return "Empacado [carton=" + carton + ", empaquesMinuto=" + empaquesMinuto + "]";
	}
	

}
