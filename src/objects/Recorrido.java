package objects;

import DCC.recorridoCRUD;

public class Recorrido {
	int cod_Recorrido;
	int num_Bus;
	String desc_Recorrido;
	String tiempo_Demora;
	String zona_Recorrido;
	int cantidad_Recorridos;
	Boolean estado;
	Boolean state= true;

	public Recorrido(int cod_Recorrido, int num_bus, String desc_Recorrido, String tiempo_Demora, String zona_Recorrido,
			int cantidad_Recorridos ,Boolean estado) {
		this.cod_Recorrido = cod_Recorrido;
		this.num_Bus = num_bus;
		this.desc_Recorrido = desc_Recorrido;
		this.tiempo_Demora = tiempo_Demora;
		this.zona_Recorrido = zona_Recorrido;
		this.cantidad_Recorridos = cantidad_Recorridos;
		this.estado = estado;
	}
	
	public Recorrido() {
		
	}
	
	public boolean create_Recorrido(Recorrido recorrido) throws ClassNotFoundException {
		recorridoCRUD rCrud = new recorridoCRUD();
		rCrud.insertRecorrido(recorrido);
		return state;
	}
	public Recorrido buscar_Recorrido(int cod_Recorrido) {
		recorridoCRUD rCrud = new recorridoCRUD();
		return rCrud.find_By_Id(cod_Recorrido);
	}
	public boolean eliminar_Recorrido(int cod_Recorrido) throws ClassNotFoundException {
		recorridoCRUD rCrud = new recorridoCRUD();
		rCrud.deleteRecorrido(cod_Recorrido);
		return state;
	}
	public boolean restablecer_Recorrido(int cod_Recorrido) {
		Recorrido h= buscar_Recorrido(cod_Recorrido);
		h.estado=true;
		return true;
	}
	public boolean editar_Recorrido(int cod_Recorrido,Recorrido recorrido_param) throws ClassNotFoundException {
		recorridoCRUD rCrud = new recorridoCRUD();
	    rCrud.updateRecorrido("1", "1",recorrido_param.getDesc_Recorrido(), recorrido_param.getTiempo_Demora(), 
	    					  recorrido_param.getZona_Recorrido(), recorrido_param.getCod_Recorrido(), recorrido_param.getEstado());
		return true;
	}
	public Recorrido mostrar_Reporte_Recorrido(int cod_Recorrido) {
		recorridoCRUD rCrud = new recorridoCRUD();
		return rCrud.find_By_Id(cod_Recorrido);
	}
	
	public int getCod_Recorrido() {
		return cod_Recorrido;
	}

	public void setCod_Recorrido(int cod_Recorrido) {
		this.cod_Recorrido = cod_Recorrido;
	}

	public int getNum_Bus() {
		return num_Bus;
	}

	public void setNum_Bus(int num_Bus) {
		this.num_Bus = num_Bus;
	}

	public String getDesc_Recorrido() {
		return desc_Recorrido;
	}

	public void setDesc_Recorrido(String desc_Recorrido) {
		this.desc_Recorrido = desc_Recorrido;
	}

	public String getTiempo_Demora() {
		return tiempo_Demora;
	}

	public void setTiempo_Demora(String tiempo_Demora) {
		this.tiempo_Demora = tiempo_Demora;
	}

	public String getZona_Recorrido() {
		return zona_Recorrido;
	}

	public void setZona_Recorrido(String zona_Recorrido) {
		this.zona_Recorrido = zona_Recorrido;
	}

	public int getCantidad_Recorridos() {
		return cantidad_Recorridos;
	}

	public void setCantidad_Recorridos(int cantidad_Recorridos) {
		this.cantidad_Recorridos = cantidad_Recorridos;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
