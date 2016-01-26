
public class BluRay extends Film{

	public BluRay(String titolo, String regista, int annoProduzione, String[] attori, int giorniNoleggio) {
		super(titolo, regista, annoProduzione, attori, giorniNoleggio);
		
	}
	
	public double costoNoleggio(){
		
		 if (giorniNoleggio == 0) return 0;
	        double amount = 1;
	        for (int i = 0; i < giorniNoleggio - 1; i++){
	        	amount += amount * (1 + (0.1 * (i + 1)));
	        }
	        return amount;
	    }
}
