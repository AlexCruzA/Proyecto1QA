package objects;

import DCC.horarioCRUD;

public class index {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Horario hor = new Horario();
		horarioCRUD hcrud = new horarioCRUD();
		hcrud.updateHorario("1", "33", "mmmm", "7:30am", "4:00pm", true);
		//hor.create_Horarios();
	}
}
