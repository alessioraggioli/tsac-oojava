
public class Videoteca {
	
	protected Film f[];
	
	public Videoteca(Film f[]){
		this.f=f;
	}
		public double ricavoTot(){
			double ricavo = 0;
			for(int i = 0; i<f.length;i++){
				ricavo += f[i].costoNoleggio();
			}
				return ricavo;
		}

}


