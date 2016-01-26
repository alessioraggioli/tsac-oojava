
public class Imprenditore extends Cliente {
	
	String nome;
	String cognome;
	String cF;
	String pIVA;
	String ragioneSociale;
	int fatture;
	
	public Imprenditore(String nome, String cognome, String cF, String pIVA, String ragioneSociale, int fatture) {
		super(nome, cognome, cF);
		this.nome = nome;
		this.cognome = cognome;
		this.cF = cF;
		this.pIVA = pIVA;
		this.ragioneSociale = ragioneSociale;
		this.fatture = fatture;
	}
	
	public double parcella(){
		return 50 + (0.5*fatture);
	}
	
	
}
