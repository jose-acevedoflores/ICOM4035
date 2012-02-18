package edu.uprm.ece.icom4035.list.test;

import edu.uprm.ece.icom4035.list.DynamicArrayList;
import edu.uprm.ece.icom4035.list.List;
import edu.uprm.ece.icom4035.list.StaticArrayList;

public class StaticArrayListTest {
	public static void main(String[] args){
		List<String> L = new StaticArrayList<String>(10);
		test(L);
		System.out.println("\n\n\n Dynamic test\n\n\n");
		List<String> L2 = new DynamicArrayList<String>(10);
		test2(L2);
	}

	private static void test2(List<String> L)
	{
		// add some values
		L.add("Bob");
		L.add("Joe");
		L.add("Ned");
		L.add("Bob");
		L.add("Joe");
		L.add("Ned");
		L.add("Jil");
		L.add("Amy");
		L.add("Dan");
		System.out.println("Size = "+L.size());
		print(L);
		L.add(1,"Ron");
		System.out.println("Size = " + L.size());
		print(L);
		System.out.println("Add more to get new size");
		L.add("Ned");
		L.add("Bull");
		L.add(5, "Bill");
		System.out.println("Size= " + L.size());
		print(L);
		System.out.println("1st index Ned: " + L.firstIndex("Ned"));
		System.out.println("last index Ned: " + L.lastIndex("Ned"));
		System.out.println("First: " + L.first());
		System.out.println("Last: " + L.last());
		System.out.println("Remove Joe: " + L.remove("Joe"));
		System.out.println("Remove Apu: " + L.remove("Apu"));
		System.out.println("Remove All Ned: " + L.removeAll("Ned"));
		System.out.println("Remove All Xi: " + L.removeAll("Xi"));
		print(L);
	}

	private static void test(List<String> L) {
		// add some values
		L.add("Bob");
		L.add("Joe");
		L.add("Ned");
		L.add("Bob");
		L.add("Joe");
		L.add("Ned");
		L.add("Jil");
		L.add("Amy");
		L.add("Dan");
		print(L);
		L.add(1,"Ron");
		System.out.println();
		print(L);
		// Totriger the exception (capacity exceeded from 10 to 11) the exception L.add("pep");
		System.out.println("1st index Ned: " + L.firstIndex("Ned"));
		System.out.println("last index Ned: " + L.lastIndex("Ned"));
		System.out.println("First: " + L.first());
		System.out.println("Last: " + L.last());
		System.out.println("Remove Joe: " + L.remove("Joe"));
		System.out.println("Remove Apu: " + L.remove("Apu"));
		System.out.println("Remove All Ned: " + L.removeAll("Ned"));
		System.out.println("Remove All Xi: " + L.removeAll("Xi"));
		print(L);
	}

	public static void print(List<String> L){
		int i =0;
		for (String s: L ){
			System.out.println(i + " " + s);
			++i;
		}

	}

}
