
public class Aereo extends Invasore{
	private int nA;
	private int nB;

	public Aereo(String id, String modello, int nA, int nB) {
		super(id, modello);
		this.nA=nA;
		this.nB=nB;
		
	}
	public int potenzaFuoco(){
		return (nA * 10) + (nB * 25);
	}

}
