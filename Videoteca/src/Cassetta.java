
public class Cassetta extends Film {

	public Cassetta(String titolo, String regista, int annoProduzione, String[] attori, int giorniNoleggio) {
		super(titolo, regista, annoProduzione, attori, giorniNoleggio);
		
	}
	
	public double costoNoleggio(){
		return 1 + ((giorniNoleggio - 1) * 2); 
	}
	
	

}
