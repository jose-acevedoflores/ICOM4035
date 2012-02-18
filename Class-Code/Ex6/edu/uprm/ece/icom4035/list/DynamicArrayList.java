package edu.uprm.ece.icom4035.list;

public class DynamicArrayList<E> extends StaticArrayList<E> {

	public DynamicArrayList(int maxCapacity) {
		super(maxCapacity);

	}

	public boolean add(E obj)
	{
		if(currentSize == elements.length)
		{
			//create new array
			E[] temp = (E[]) new Object[elements.length*2];
			
			//copy elements from old array to new array
			for(int i = 0 ; i < elements.length; i++)
			{
				temp[i] = elements[i];
			}
			
			elements = temp;
		}

		return super.add(obj);
	}
	
	public boolean add(int index, E obj){
		
		
		if (this.currentSize == this.elements.length)
		{
			//create new array
			E[] temp = (E[]) new Object[elements.length*2];
			
			//copy elements from old array to new array
			for(int i = 0 ; i < elements.length; i++)
			{
				temp[i] = elements[i];
			}
			
			elements = temp;	
		}
		return super.add(index, obj);
	}
	
}
