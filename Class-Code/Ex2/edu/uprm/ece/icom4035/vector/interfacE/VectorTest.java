package edu.uprm.ece.icom4035.vector.interfacE;


public class VectorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting.");
		test1();
		System.out.println("Test 1 Done, Test 2 Start");
		test2();
		System.out.println("Done!");

	}

	private static void test1() {
		Vector V0 = new Vector2d(1, 2);
		Vector V1 = new Vector2d(3, 4);
		
		System.out.printf("V0: %s, V1: %s\n", V0, V1);
		Vector V2 = V0.sum(V1);
		System.out.printf("V2 = V0 + V1: %s\n", V2);
		System.out.printf("V2 = V0 - V1: %s\n", V0.substract(V1));
		System.out.printf("V2 = V0 * V1: %f\n", V0.dot(V1));
		System.out.printf("||V0||: %f\n", V0.magnitude());
	}

	private static void test2() {
		double[] vals1 = {1, 2};
		double[] vals2 = {3, 4};
		Vector V0 = new VectorN(vals1);
		Vector V1 = new VectorN(vals2);
		
		System.out.printf("V0: %s, V1: %s\n", V0, V1);
		Vector V2 = V0.sum(V1);
		System.out.printf("V2 = V0 + V1: %s\n", V2);
		System.out.printf("V2 = V0 - V1: %s\n", V0.substract(V1));
		System.out.printf("V2 = V0 * V1: %f\n", V0.dot(V1));
		System.out.printf("||V0||: %f\n", V0.magnitude());
	}

}
