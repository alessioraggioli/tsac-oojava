
public class Film {
	
	protected String titolo;
	protected String regista;
	protected int annoProduzione;
	protected String attori[];
	protected int giorniNoleggio;
	
	public Film(String titolo, String regista, int annoProduzione, String[] attori, int giorniNoleggio) {
		this.titolo = titolo;
		this.regista = regista;
		this.annoProduzione = annoProduzione;
		this.attori = attori;
		this.giorniNoleggio= giorniNoleggio;
	}
	
	public double costoNoleggio(){
		return 0;
	}

}
