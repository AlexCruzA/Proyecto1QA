package objects;

import DCC.horarioCRUD;
import DCC.recorridoCRUD;
import DCC.socioCRUD;

public class index {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Horario hor = new Horario();
		horarioCRUD hcrud = new horarioCRUD();
		Socio soc = new Socio();
		socioCRUD scrud= new socioCRUD();
		Recorrido rec = new Recorrido();
		recorridoCRUD rcrud= new recorridoCRUD();
		
		//rec.create_Recorrido();
		//rcrud.updateRecorrido("1", "13", "Recorrido ruta caldera", "40 minutos", "De x a y", 10, true);
		//hor.create_Horarios();
		//hcrud.updateHorario("1", "33", "mmmm", "7:30am", "4:00pm", true);
		soc.create_Socio();
		
		
	}
}
