package actividadesPOO;
import java.time.LocalDate;

public class Myapp {

	public static void main(String[] args) {
		Lavado maquina1= new Lavado("Maquina de lavado 1 ",LocalDate.of(2021, 6, 27), 2300,50, 60);
		maquina1.mostrarDatos();
		
		Llenado maquina2= new Llenado("Maquina de Llenado 1",LocalDate.of(2021, 6, 27),3000,10,null);
		maquina2.mostrarDatos2();
		
		Empacado maquina3= new Empacado("Maquina de Empacado 1",LocalDate.of(2021, 6, 27),27000,7,4);
		maquina3.mostrarDatos3();
	}

}
