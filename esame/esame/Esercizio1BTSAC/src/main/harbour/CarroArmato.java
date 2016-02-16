package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class CarroArmato extends Invasore{
	
	int missili;
	double stazza;
	
	public int getMissili() {
		return missili;
	}
	public void setMissili(int missili) {
		this.missili = missili;
	}
	public double getStazza() {
		return stazza;
	}
	public void setStazza(double stazza) {
		this.stazza = stazza;
	}
	
	public int potenzaFuoco(){
		double fire = (missili * stazza) * 0.3;
		return (int) Math.round(fire);
	}
	
	
}
