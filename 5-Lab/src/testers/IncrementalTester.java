package testers;

import indexList.IndexList;
import myPackage.LLIndexList2;
import myPackage.SLList2;

public class IncrementalTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testSize( new LLIndexList2<Integer>(new SLList2<Integer>()));

	}

	private static void testSize(IndexList<Integer> list)
	{
		System.out.println("is emtpy = " + list.isEmpty() );

		list.add(23); //0
		list.add(45); //1
		list.add(43); //2
		list.add(5673); //3
		
		displayList(list);
		
		System.out.println("is emtpy = " + list.isEmpty() );
		System.out.println("Size = " + list.size());
		
		list.add(45); //4
		
		displayList(list);

		System.out.println("Size = " + list.size());
		
		list.add(0, 89);
		
		displayList(list);

		System.out.println("Size = " + list.size());

		list.add(4,894);
		
		displayList(list);

		System.out.println("removed "+list.remove(3)+ " at pos 3");
		displayList(list);
		System.out.println("Size = " + list.size());
		
		System.out.println("removed "+list.remove(5) + " at pos 5");
		
		displayList(list);
		
		System.out.println("set: "+list.set(4, 654) + " pos 4");
		
		displayList(list);

	}
	
	
	private static void displayList(IndexList<Integer> list)
	{
		int max = list.size();
		
		System.out.println("------List content------");
		for(int i = 0 ; i < max ; i++)
		{
			System.out.println(i+" - "+list.get(i));
		}
		
		System.out.println("-------");
	}
}
