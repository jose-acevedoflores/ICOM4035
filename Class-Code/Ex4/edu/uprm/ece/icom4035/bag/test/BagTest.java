package edu.uprm.ece.icom4035.bag.test;

import java.util.Iterator;

import edu.uprm.ece.icom4035.bag.Bag;
import edu.uprm.ece.icom4035.bag.DynamicBag;
import edu.uprm.ece.icom4035.bag.StaticBag;

public class BagTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		staticBag();
		System.out.println("\n Dynamic !!! \n");
		dynamicBag();

		//int[] x = new int[10];
		
	}

	private static void staticBag() {
		Bag<String> B = new StaticBag<String>(7);
		
		B.add("Bob");
		B.add("Ned");
		B.add("Jil");
		B.add("Bob");
		B.add("Bob");
		B.add("Ned");
		B.add("Bob");
		B.add("Bob");
		B.add("Bob");
		
		printBag(B);
		System.out.println("Bag size: " + B.size());
		System.out.println("Copies of Bob: " + B.count("Bob"));
		System.out.println("Copies of Amy: " + B.count("Amy"));
		System.out.println("Is Ned Member: " + B.isMember("Ned"));
		System.out.println("Is Apu Member: " + B.isMember("Apu"));
		System.out.println("Remove Bob: " + B.remove("Bob"));
		System.out.println("Remove All Ned: "+ B.removeAll("Ned"));
		System.out.println("Bag is Empty: " + B.isEmpty());
		B.clear();
		System.out.println("Bag is Empty: " + B.isEmpty());
	}

	private static void dynamicBag() {
		Bag<String> B = new DynamicBag<String>(7);
		
		B.add("Bob");
		B.add("Ned");
		B.add("Jil");
		B.add("Bob");
		B.add("Bob");
		B.add("Ned");
		B.add("Bob");
		B.add("Bob");
		B.add("Bob");
		printBag(B);
		System.out.println("Bag size: " + B.size());
		System.out.println("Copies of Bob: " + B.count("Bob"));
		System.out.println("Copies of Amy: " + B.count("Amy"));
		System.out.println("Is Ned Member: " + B.isMember("Ned"));
		System.out.println("Is Apu Member: " + B.isMember("Apu"));
		System.out.println("Remove Bob: " + B.remove("Bob"));
		System.out.println("Remove All Ned: "+ B.removeAll("Ned"));
		System.out.println("Bag is Empty: " + B.isEmpty());
		B.clear();
		System.out.println("Bag is Empty: " + B.isEmpty());
	}
	
	private static void printBag(Bag<String> B){
		Iterator<String> I = B.iterator();
		while (I.hasNext()){
			System.out.println(I.next());
		}
	}

}
