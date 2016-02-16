package main.harbour;

import main.harbour.Invasore;
import main.harbour.AeroPorto;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {

	AeroPorto ap;
	
	public Gioco(AeroPorto ap){
		this.ap = ap;
	}
	
	public void attacco(Invasore invasori[]){
		int i = 0;
		while(i < invasori.length){
			ap.setDimensioneSqMetersNonDistrutta(ap.getDimensioneSqMetersNonDistrutta() - invasori[i].potenzaFuoco() * 2.5);
			i++;
		}
		
	}
	
	public boolean portoDistrutto(){
		return ap.getDimensioneSqMetersNonDistrutta() <= 0; 
	}
	
}
