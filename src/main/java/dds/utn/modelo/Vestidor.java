package dds.utn.modelo;

import java.util.ArrayList;
import java.util.List;

import utn.dds.excepciones.ListInvalidException;

public class Vestidor {
     private List<String> torsos = new ArrayList<String>();
	 private List<String> piernas = new ArrayList<String>(); 
	 private List<String> pies = new ArrayList<String>();
	 
   

public Vestidor(List<String> torsos, List<String> piernas, List<String> pies) {
	this.torsos= torsos;
    this.piernas = piernas;
    this.pies = pies;
} 


public void combinar() {
	this.validarPrendas();
	
}

public void validarPrendas() {
	
	 if (torsos.isEmpty() || piernas.isEmpty() || pies.isEmpty())
	 {	throw new ListInvalidException();
	  }
	this.realizarCombinacion();
	 	 
}
	 
   public List<VestidorCombinacion> realizarCombinacion()
   {
	   ArrayList<VestidorCombinacion> vestidores = new ArrayList<VestidorCombinacion>();
	     
	   for(int i= 0; i< torsos.size(); i++) {
			for (int j= 0; j< piernas.size(); j++) {
				for (int k= 0; k< pies.size(); k++) {
		   VestidorCombinacion lst= new VestidorCombinacion(torsos.get(i),piernas.get(j),pies.get(k));
			vestidores.add(lst);
				}
			}
		}
		 	   
	   return vestidores;
	  
	   
   }
	 
	 public List<String> getTorsos() {
		return torsos;
	}

	public void setTorsos(List<String> torsos) {
		this.torsos = torsos;
	}

	public List<String> getPiernas() {
		return piernas;
	}

	public void setPiernas(List<String> piernas) {
		this.piernas = piernas;
	}

	public List<String> getPies() {
		return pies;
	}

	public void setPies(List<String> pies) {
		this.pies = pies;
	}

	

    
}
