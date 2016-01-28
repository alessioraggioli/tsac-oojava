
public class Porto {

	private String nome;
	private int nImbarcazioni;
	private double dimensione; //m^2
	
	public Porto(String nome, int nImbarcazioni, int dimensione){
		this.nome = nome;
		this.nImbarcazioni = nImbarcazioni;
		this.dimensione = dimensione;
	}
	
	public double getMq(){
		return dimensione;
	}
	public void setMq(double d){
		dimensione = d;
	}
	
}
