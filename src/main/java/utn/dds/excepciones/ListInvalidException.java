package utn.dds.excepciones;

public class ListInvalidException extends RuntimeException{
	
	 	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  ListInvalidException() {
		  super ("La lista no puede estar vacía");
		  
	  }
		
	
}
