package r4_5;

public class Pow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("result "+power(3,5));
		
	}

	
	public static double power(double x, int n)
	{
		double y=0;
		if(n==0 )
		{
			System.out.println("return 1");
			return 1;
		}
		
		if(n%2 != 0 )
		{
			y = power(x, (n-1)/2);
			System.out.println("odd - return " + y*y*x + " --- n = " +n + "--- y = "+y);
			return x*y*y;
		}
		
		else
		{
			y = power(x, n/2);
			System.out.println("even - return " + y*y + " --- n = " +n + "--- y = "+y);
			return y*y;
		}
	}
}
