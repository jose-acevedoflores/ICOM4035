package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}

	public double getTerm(int n)
	{
		double term = this.firstValue() + (this.commonDifference) * (n-1);
		return term;
	}
	
	public String toString()
	{
		
		return "Arith(" +  (int) this.firstValue() + ", "+ (int) this.commonDifference +")";
	}
	
}
