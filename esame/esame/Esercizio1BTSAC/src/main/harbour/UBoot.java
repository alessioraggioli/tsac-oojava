package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class UBoot extends Invasore{
	
	private int armaK;
	private int armaH;
	
	
	public int getArmaK() {
		return armaK;
	}


	public void setArmaK(int armaK) {
		this.armaK = armaK;
	}


	public int getArmaH() {
		return armaH;
	}


	public void setArmaH(int armaH) {
		this.armaH = armaH;
	}

	public int potenzaFuoco(){
		return (armaK * 20) + (armaH * 30);
	}
}