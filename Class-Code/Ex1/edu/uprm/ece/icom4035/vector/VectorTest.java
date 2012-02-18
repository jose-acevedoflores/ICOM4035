package edu.uprm.ece.icom4035.vector;

//import edu.uprm.ece.icom4035.vector.interfacE.Vector;

public class VectorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector V0 = new Vector(1, 2);
		Vector V1 = new Vector(3, 4);
		
		System.out.printf("V0: %s, V1: %s\n", V0, V1);
		Vector V2 = V0.sum(V1);
		System.out.printf("V2 = V0 + V1: %s\n", V2);
		System.out.printf("V2 = V0 - V1: %s\n", V0.substract(V1));
		System.out.printf("V2 = V0 * V1: %f\n", V0.dot(V1));
		System.out.printf("||V0||: %f\n", V0.magnitude());

	}

}
