package cf_3_34_BinarySum;

public class BinarySum {

	public static int times = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[] = {1,3,5,6};
		
		System.out.println(sum(a, 0, 4));
		
	}
	
	public static int sum(int A[], int i , int n)
	{
		times++;
		if (n==1)
		{
			return A[i];
		}
		System.out.println(times+"enter: i = "+i +" n = " +(int) Math.ceil(n/2)  );
		int a = sum(A,i, (int) Math.ceil(n/2) );
		System.out.println(times+"return a = " +a);
		
		System.out.println(times+"enter: i = "+(i + (int) Math.ceil(n/2))  +" n = " +(int) Math.floor(n/2)  );
		int a2 = sum(A,i + (int) Math.ceil(n/2) , (int) Math.floor(n/2));
		System.out.println(times+"return a2 = " + a2);
		
		return a + a2;
	}

}
