package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class AeroPorto {

	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;
	
	
	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}
	public void setDimensioneSqMeters(double dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMeters;
	}
	public double getDimensioneSqMetersNonDistrutta() {
		return dimensioneSqMetersNonDistrutta;
	}
	public void setDimensioneSqMetersNonDistrutta(double dimensioneSqMetersNonDistrutta) {
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMetersNonDistrutta;
	}
	public void addMetriQuadriDistrutti(double k){
		this.setDimensioneSqMetersNonDistrutta(this.getDimensioneSqMetersNonDistrutta() - k);
		if(this.getDimensioneSqMetersNonDistrutta() <= 0) this.setDimensioneSqMetersNonDistrutta(0);
	}
	
	
	
}
