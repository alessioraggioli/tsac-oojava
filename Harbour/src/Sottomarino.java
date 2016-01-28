
public class Sottomarino extends Invasore{
	
	private int nArmamenti;
	private int stazza;

	public Sottomarino(String id, String modello, int nArmamenti, int stazza) {
		super(id, modello);
		this.nArmamenti=nArmamenti;
		this.stazza=stazza;
	}
	
	public int potenzaFuoco(){
		return nArmamenti * stazza;
	}
	

}
