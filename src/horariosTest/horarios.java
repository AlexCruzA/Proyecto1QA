package horariosTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import Objects.Horario;

public class horarios {
	Horario horario;
	@Test
	public void crear_Horario_True(Horario h) {
		horario = new Horario();
		horario.create_Horarios(h);
		Assert.assertTrue(horario.create_Horarios(h));
	}
	@Test
	public void crear_Horario_False(Horario h) {
		horario = new Horario();
		horario.create_Horarios(h);
		Assert.assertFalse(horario.create_Horarios(h));
	}
}
