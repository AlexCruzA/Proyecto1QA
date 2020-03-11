
public class Recorrido {
	int cod_Recorrido;
	int num_Bus;
	String desc_Recorrido;
	String tiempo_Demora;
	String zona_Recorrido;
	int cantidad_Recorridos;
	Boolean estado;

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
	
	public void create_Recorrido(Recorrido recorrido) {
		Recorrido rec =  new Recorrido();
		rec = recorrido;
	}
	public Recorrido buscar_Recorrido(int cod_Recorrido) {
		Recorrido rec =  new Recorrido();
		return rec;
	}
	public void eliminar_Recorrido(int cod_Recorrido) {
		
	}
	public void editar_Recorrido(int cod_Recorrido) {
		
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
