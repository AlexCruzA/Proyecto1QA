package objects;

import DCC.horarioCRUD;
import DCC.socioCRUD;

public class Socio {
int cod_Socio;
String nombre;
String apellidos;
String linea;
int num_Bus;
int cap_Bus;
String ayudante;
String chofer;
Boolean estado;
Boolean state=  true;

public Socio() {
}
public Socio(int cod_Socio, String nombre, String apellidos, String linea, int num_Bus, int cap_Bus, String ayudante,
		String chofer, Boolean estado) {
	this.cod_Socio = cod_Socio;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.linea = linea;
	this.num_Bus = num_Bus;
	this.cap_Bus = cap_Bus;
	this.ayudante = ayudante;
	this.chofer = chofer;
	this.estado = estado;
}

public boolean crear_Socio(Socio socio) throws ClassNotFoundException {
	socioCRUD scrud = new socioCRUD();
	scrud.insertSocio(socio);
	return state;
}
public int getCod_Socio() {
	return cod_Socio;
}
public void setCod_Socio(int cod_Socio) {
	this.cod_Socio = cod_Socio;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getLinea() {
	return linea;
}
public void setLinea(String linea) {
	this.linea = linea;
}
public int getNum_Bus() {
	return num_Bus;
}
public void setNum_Bus(int num_Bus) {
	this.num_Bus = num_Bus;
}
public int getCap_Bus() {
	return cap_Bus;
}
public void setCap_Bus(int cap_Bus) {
	this.cap_Bus = cap_Bus;
}
public String getAyudante() {
	return ayudante;
}
public void setAyudante(String ayudante) {
	this.ayudante = ayudante;
}
public String getChofer() {
	return chofer;
}
public void setChofer(String chofer) {
	this.chofer = chofer;
}
public Boolean getEstado() {
	return estado;
}
public void setEstado(Boolean estado) {
	this.estado = estado;
}

}
