import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {

	@Test
	public void PlanetaPrueba1() {
		Planeta p = new Planeta("Tierra",43991.5,9.14);
	}
	
	@Test
	public void PlanetaPrueba2() {
		Planeta p = new Planeta("Saturno",6234.23,21.14);
		if(!p.getNombre().equals("Saturno"))
			fail();
		if(p.getDiametro()!=6234.23)
			fail();
		if(p.getGravedad()!=21.14)
			fail();
	}
	
	@Test
	public void PlanetaPrueba3() {
		Planeta p = new Planeta("Tierra",43991.5,9.14);
		p.setNombre("Marte");
		p.setDiametro(73219.43);
		p.setGravedad(3.1);
		if(!p.getNombre().equals("Marte"))
			fail();
		if(p.getDiametro()!=73219.43)
			fail();
		if(p.getGravedad()!=3.1)
			fail();
	}
	
	@Test
	public void AlumnoPrueba1() {
		Alumno a = new Alumno("Lolo", 80,90,70);
	}
	
	@Test
	public void AlumnoPrueba2() {
		Alumno a = new Alumno("Rufo", 75,70,72.5);
		if(a.getPromedio()!=72.5)
			fail();
	}
	
	@Test
	public void AlumnoPrueba3() {
		Alumno a = new Alumno("Rufo", 75,70,72.5);
		a.setNombre("Lola");
		if(!a.getNombre().equals("Lola"))
			fail();
	}
	
	@Test
	public void AlumnoPrueba4() {
		Alumno a = new Alumno("Momo", 60,75,75);
		if(a.getPromedio()!=70)
			fail();
	}
	
	@Test
	public void AlumnoPrueba5() {
		if(!new Alumno("Ruru", 60,75,75).aprobado())
			fail();
		if(new Alumno("Ruru", 45,60,40).aprobado())
			fail();
		if(!new Alumno("Ruru", 40,60,80).aprobado())
			fail();
		if(!new Alumno("Juan", 80,60,90).aprobado())
			fail();
		if(new Alumno("Ruru", 30,70,40).aprobado())
			fail();
	}
}
