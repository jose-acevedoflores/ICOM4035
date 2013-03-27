package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}

	public double getTerm(int n)
	{
		double term = this.firstValue()*Math.pow(commonFactor, n-1);
		return term;
	}
	
	public String toString()
	{
		return "Geom(" + (int) this.firstValue() + ", "  +  (int) this.commonFactor +")";
	}

}
