package edu.uprm.ece.icom4035.bag;

public class DynamicBag<E> extends StaticBag<E> {

	public DynamicBag(int maxSize) {
		super(maxSize);
	}

	public void add(E obj){
		if (this.size() == this.capacity()){
			// new array
			@SuppressWarnings("unchecked")
			E[] temp = (E[]) new Object[this.capacity()*2];
			for (int i=0; i < this.size() ; ++i){
				// copy old array into temp
				temp[i] = this.elements[i];
			}
			// make temp become the array in the object bag
			this.elements = temp;
		}
		super.add(obj);
	}
}
