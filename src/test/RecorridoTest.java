package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.Recorrido;

public class RecorridoTest { 
	Recorrido recorrido;
	@Test
	public void registrar_Recorrido_True() throws ClassNotFoundException {
		recorrido = new Recorrido(1, 1, "Sabano Norte", "10 min", "San Jose", 15, true);
		Recorrido recorrido2= new Recorrido();
		Assert.assertEquals(recorrido2.create_Recorrido(recorrido), true);
	}
	@Test
	public void registrar_Recorrido_False() throws ClassNotFoundException {
		recorrido = new Recorrido(1, 1, "Sabano Norte", "10 min", "San Jose", 15, true);
		Recorrido recorrido2= new Recorrido();
		Assert.assertEquals(recorrido2.create_Recorrido(recorrido), false);
	}
	@Test
	public void buscar_Recorrido_True() {
		recorrido = new Recorrido();
		Assert.assertEquals(recorrido.buscar_Recorrido(1).getCod_Recorrido(), 1);
	}
	@Test
	public void buscar_Recorrido_False() {
		recorrido = new Recorrido();
		Assert.assertEquals(recorrido.buscar_Recorrido(1).getCod_Recorrido(), 1);
	}
	@Test
	public void editar_Horario_True() throws ClassNotFoundException {
		recorrido = new Recorrido(1, 1, "Sabano Norte", "10 min", "San Jose", 15, true);
		Recorrido recorrido2= new Recorrido();
		Assert.assertEquals(recorrido2.editar_Recorrido(1, recorrido), true);
	}
	@Test
	public void editar_Horario_False() throws ClassNotFoundException {
		recorrido = new Recorrido(1, 1, "Sabano Norte", "10 min", "San Jose", 15, true);
		Recorrido recorrido2= new Recorrido();
		Assert.assertEquals(recorrido2.editar_Recorrido(1, recorrido), false);
	}
	@Test
	public void eliminar_Horario_True() throws ClassNotFoundException {
		recorrido = new Recorrido();
		Assert.assertEquals(recorrido.eliminar_Recorrido(1), true);
	}
	@Test
	public void restablecer_Horario_True() {
		recorrido = new Recorrido();
		Assert.assertEquals(recorrido.restablecer_Recorrido(1), true);
	}
	@Test
	public void generar_reporte() {
		recorrido= new Recorrido(1, 1, "Sabano Norte", "10 min", "San Jose", 15, true);
		Recorrido recorrido2= new Recorrido();
		Assert.assertEquals(recorrido.mostrar_Reporte_Recorrido(1).toString(), recorrido2.toString());
	}
	
}
