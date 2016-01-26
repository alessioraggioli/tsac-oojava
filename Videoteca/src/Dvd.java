
public class Dvd extends Film {

	public Dvd(String titolo, String regista, int annoProduzione, String[] attori, int giorniNoleggio) {
		super(titolo, regista, annoProduzione, attori, giorniNoleggio);
		
	}

	public double costoNoleggio(){
		if(giorniNoleggio == 1) return 1.5;
		else if(giorniNoleggio == 2) return 3;
		else return 3 + ((giorniNoleggio-2) * 2);
	}
}
