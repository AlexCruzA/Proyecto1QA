package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.Horario;

public class HorarioTest {
	Horario horario;
	@Test
	public void crear_Horario_True() {
		horario = new Horario();
		Horario horario2= new Horario(1, 1, "Horario #1", "5:00pm", "6:00pm", true);
		Assert.assertEquals(horario.create_Horarios(horario2), true);
	}
	@Test
	public void crear_Horario_False() {
		horario = new Horario();
		Horario horario2= new Horario(1, 1, "Horario #1", "5:00pm", "6:00pm", true);
		Assert.assertEquals(horario.create_Horarios(horario2), false);
	}
	@Test
	public void buscar_Horario_True() {
		horario = new Horario();
		Assert.assertEquals(horario.buscar_Horario(1).getCod_Horario(), 1);
	}
	@Test
	public void buscar_Horario_False() {
		horario = new Horario();
		Assert.assertEquals(horario.buscar_Horario(1).getCod_Horario(), 2);
	}
	@Test
	public void editar_Horario_True() {
		horario= new Horario(1, 1, "Horario #1", "5:00pm", "6:00pm", true);
		Horario horario2= new Horario();
		Assert.assertEquals(horario2.editar_horario(1, horario), true);
	}
	@Test
	public void editar_Horario_False() {
		horario= new Horario(1, 1, "Horario #1", "5:00pm", "6:00pm", true);
		Horario horario2= new Horario();
		Assert.assertEquals(horario2.editar_horario(1, horario), false);
	}
	@Test
	public void eliminar_Horario_True() {
		horario = new Horario();
		Assert.assertEquals(horario.eliminar_Horario(1), true);
	}
	@Test
	public void restablecer_Horario_True() {
		horario = new Horario();
		Assert.assertEquals(horario.restablecer_Horario(1), true);
	}
	
	@Test
	public void generar_reporte() {
		horario= new Horario(1, 1, "Horario #1", "5:00pm", "6:00pm", true);
		Horario horario2= new Horario();
		Assert.assertEquals(horario.mostrar_Reporte_Horario(1).toString(), horario2.toString());
	}
}
