
public class Libero extends Cliente {

	String nome;
	String cognome;
	String cF;
	String pIVA;
	int fatture;
	
	public Libero(String nome, String cognome, String cF, String pIVA, int fatture) {
		super(nome, cognome, cF);
		this.nome = nome;
		this.cognome = cognome;
		this.cF = cF;
		this.pIVA = pIVA;
		this.fatture = fatture;
	}

	public double parcella(){
		return 500 + (fatture-100);
	}
}
