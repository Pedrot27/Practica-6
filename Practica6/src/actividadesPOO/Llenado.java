package actividadesPOO;
import java.time.LocalDate;
import java.util.ArrayList;


public class Llenado extends Maquina{
	private float cantEnva;
	private ArrayList<Float> listaRegulacion;
	
	
	public Llenado(String descripcion, LocalDate fechaAdqui, float costo,float cantEnva,ArrayList<Float> listaRegulacion){
		super(descripcion, fechaAdqui, costo);
		this.cantEnva= cantEnva;
		}
	public void mostrarDatos2() {
		System.out.println("Descripcion:"+getdescripcion()+
				"\nFecha Adquisicion:"+getfechaAdqui()+
				"\nCosto:"+getcosto()+
				"\nCantidad de Envaces:"+cantEnva+
				"\nLista de regulacion de ml:"+listaRegulacion);
	
			}
	@Override
	public String toString() {
		return "Llenado [cantEnva=" + cantEnva + ", listaRegulacion=" + listaRegulacion + "]";
	}
	
}
