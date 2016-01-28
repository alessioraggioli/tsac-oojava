
public class Commercialista {

	private Cliente c[];
			
		public Commercialista(Cliente c[]){
		this.c=c;
	}
		public double incassoTot(){
			double incasso = 0;
			for(int i = 0; i<c.length;i++){
				incasso += c[i].parcella();
			}
				return incasso;
		}

}
