package utn.dds.modelo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dds.utn.modelo.Vestidor;

import org.junit.Assert;
import org.junit.Before;



public class VestidorTest {
	List<String> torso = new  ArrayList<String>();
	List<String> piernas = new  ArrayList<String>();
	List<String> pies = new  ArrayList<String>();

	@Before
	public void initialize(){
		torso.add("remera");
		
		piernas.add("jeans");
		piernas.add("pollera");
		
		pies.add("chatitas");
		
	}
		
	@Test 
	public void testCombinaciones1() throws Exception{

	Vestidor vestidor = new Vestidor(torso,piernas,pies);
		
	Assert.assertEquals(2, vestidor.realizarCombinacion().size());
	//Resultado: ("remera","jeans","chatitas");  ("remera","pollera","chatitas");
		
	}
	
	@Test 
	public void testCombinaciones2() throws Exception{
		torso.add("blusa");
				
	Vestidor vestidor = new Vestidor(torso,piernas,pies);
		
	Assert.assertEquals(4, vestidor.realizarCombinacion().size());
	Assert.assertTrue(vestidor.realizarCombinacion().get(0).getTorso().toString() =="remera" );
	Assert.assertTrue(vestidor.realizarCombinacion().get(0).getPiernas().toString() =="jeans" );
	Assert.assertTrue(vestidor.realizarCombinacion().get(0).getPies().toString() =="chatitas");
	//Resultado: (remera,jeans,chatitas) , (remera,pollera,chatitas) , (blusa,jeans,chatitas) ,(blusa;pollera,chatitas);
		
	}
	
	
}
