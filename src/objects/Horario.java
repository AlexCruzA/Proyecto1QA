package objects;

import DCC.horarioCRUD;

public class Horario {
int cod_Horario;
int num_Bus;
String desc_Horario;
String tiempo_Salida;
String tiempo_llegada;
Boolean estado;
 
public Horario(int cod_Horario, int num_Bus, String desc_Horario, String tiempo_Salida, String tiempo_llegada,
		Boolean estado) {
	this.cod_Horario = cod_Horario;
	this.num_Bus = num_Bus;
	this.desc_Horario = desc_Horario;
	this.tiempo_Salida = tiempo_Salida;
	this.tiempo_llegada = tiempo_llegada;
	this.estado = estado;
}
public Horario() {
	
}
public boolean create_Horarios() throws ClassNotFoundException {
	horarioCRUD hcrud = new horarioCRUD();
	Horario horario2= new Horario(1, 1, "Horario #1", "5:00pm", "6:00pm", true);
	hcrud.insertHorario(horario2);
	return true;
}
public Horario buscar_Horario(int cod_Horario) {
	Horario horar =  new Horario();
	return horar;
}
public boolean eliminar_Horario(int cod_Horario) {
	return true;
}
public boolean editar_Horario(int cod_Horario) {
	return true;
}

public int getCod_Horario() {
	return cod_Horario;
}
public void setCod_Horario(int cod_Horario) {
	this.cod_Horario = cod_Horario;
}
public int getNum_Bus() {
	return num_Bus;
}
public void setNum_Bus(int num_bus) {
	this.num_Bus = num_bus;
}
public String getDesc_Horario() {
	return desc_Horario;
}
public void setDesc_Horario(String desc_Horario) {
	this.desc_Horario = desc_Horario;
}
public String getTiempo_Salida() {
	return tiempo_Salida;
}
public void setTiempo_Salida(String tiempo_Salida) {
	this.tiempo_Salida = tiempo_Salida;
}
public String getTiempo_llegada() {
	return tiempo_llegada;
}
public void setTiempo_llegada(String tiempo_llegada) {
	this.tiempo_llegada = tiempo_llegada;
}
public Boolean getEstado() {
	return estado;
}
public void setEstado(Boolean estado) {
	this.estado = estado;
}

}
