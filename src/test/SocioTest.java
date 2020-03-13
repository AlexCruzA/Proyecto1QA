package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.Socio;

public class SocioTest {
	Socio socio;
	@Test
	public void crear_Horario_True() throws ClassNotFoundException {
		socio = new Socio();
		Socio socio2= new Socio(1, "Juan Carlos", "Rojas Castro", "Buenos Aires", 5, 54, "Maria Rojas Chavarria", "Juliana Perez Torres", true);
		Assert.assertEquals(socio.crear_Socio(socio2), true);
	}
	@Test
	public void crear_Horario_False() throws ClassNotFoundException {
		socio = new Socio();
		Socio socio2= new Socio(1, "Juan Carlos", "Rojas Castro", "Buenos Aires", 5, 54, "Maria Rojas Chavarria", "Juliana Perez Torres", true);
		Assert.assertEquals(socio.crear_Socio(socio2), false);
	}
}
 