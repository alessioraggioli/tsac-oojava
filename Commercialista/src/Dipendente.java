
public class Dipendente extends Cliente{
	
	String nome;
	String cognome;
	String cF;
	
	public Dipendente(String nome, String cognome, String cF) {
		super(nome, cognome, cF);
		this.nome = nome;
		this.cognome = cognome;
		this.cF = cF;
	}
	
	public double parcella(){
		return 50;
	}

}
