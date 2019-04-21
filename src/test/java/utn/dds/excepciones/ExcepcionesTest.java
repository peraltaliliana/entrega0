package utn.dds.excepciones;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dds.utn.modelo.Vestidor;

public class ExcepcionesTest {
	List<String> torsos = new  ArrayList<String>();
	List<String> piernas = new  ArrayList<String>();
	List<String> pies = new  ArrayList<String>();
	
	
	
	@Test  (expected= ListInvalidException.class)
	public void testListTorsosVacio() throws Exception{
		piernas.add("jeans");
		pies.add("zapatilla");
		
	Vestidor vestidor = new Vestidor(torsos,piernas,pies);
	vestidor.combinar();
	}
	
	
	@Test  (expected= ListInvalidException.class)
	public void testListVacias() throws Exception{
		pies.add("zapatilla");
	Vestidor vestidor = new Vestidor(torsos,piernas,pies);
	vestidor.combinar();
	}
}
