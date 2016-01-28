
public class Gioco {

	private Porto p;

	public Gioco(Porto p) {
		this.p = p;
	}
	public void attacco(Invasore invasori []){
		for(int i = 0; i < invasori.length; i++){
			p.setMq(p.getMq() - invasori[i].potenzaFuoco()*1.5);
			}
		
	}
	public boolean portoDistrutto(){
		return p.getMq() <= 0; 
	}

	
}
