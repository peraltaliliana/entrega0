package utn.dds.modelo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dds.utn.modelo.Vestidor;

import org.junit.Assert;



public class VestidorTest {
	List<String> torso = new  ArrayList<String>();
	List<String> piernas = new  ArrayList<String>();
	List<String> pies = new  ArrayList<String>();

		
	@Test 
	public void testCombinaciones1() throws Exception{
		torso.add("remera");
				
		piernas.add("jeans");
		piernas.add("pollera");
		
		pies.add("chatitas");
	Vestidor vestidor = new Vestidor(torso,piernas,pies);
		
	Assert.assertEquals(2, vestidor.realizarCombinacion().size());
	//Resultado: ("remera","jeans","chatitas");  ("remera","pollera","chatitas");
		
	}
	
	@Test 
	public void testCombinaciones2() throws Exception{
		torso.add("remera");
		torso.add("blusa");
		
		piernas.add("jeans");
		piernas.add("pollera");
		
		pies.add("chatitas");
	Vestidor vestidor = new Vestidor(torso,piernas,pies);
		
	Assert.assertEquals(4, vestidor.realizarCombinacion().size());
	Assert.assertTrue(vestidor.realizarCombinacion().get(1).getTorso().toString() =="remera" );
	Assert.assertTrue(vestidor.realizarCombinacion().get(1).getPiernas().toString() =="pollera" );
	//Assert.assertTrue(vestidor.realizarCombinacion().get(1).getPies().toString() =="chatitas");
	//Resultado: (remera,jeans,chatitas) , (remera,pollera,chatitas) , (blusa,jeans,chatitas) ,(blusa;pollera,chatitas);
		
	}
	
	
}
