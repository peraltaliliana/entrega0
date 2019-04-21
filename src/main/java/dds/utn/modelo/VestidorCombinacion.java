package dds.utn.modelo;

public class VestidorCombinacion {

	private String torso;
	private String piernas;
	private String Pies;
	
	public VestidorCombinacion(String torso, String piernas, String pies) {
		this.torso = torso;
		this.piernas= piernas;
		this.Pies = pies;
	}

	public String getTorso() {
		return torso;
	}

	public void setTorso(String torso) {
		this.torso = torso;
	}

	public String getPiernas() {
		return piernas;
	}

	public void setPiernas(String piernas) {
		this.piernas = piernas;
	}

	public String getPies() {
		return Pies;
	}

	public void setPies(String pies) {
		Pies = pies;
	}
}
