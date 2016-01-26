
public class BluRay extends Film{

	public BluRay(String titolo, String regista, int annoProduzione, String[] attori, int giorniNoleggio) {
		super(titolo, regista, annoProduzione, attori, giorniNoleggio);
		
	}
	
	public double costoNoleggio(){
		double amount = 0;
		if(giorniNoleggio == 1) amount = 1;
		else amount = giorniNoleggio + ((giorniNoleggio - 1) * 0.1) ; 
			return amount;
	}

}
