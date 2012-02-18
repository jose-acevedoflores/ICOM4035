package edu.uprm.ece.icom4035.set;

public class DynamicImpSet<E> extends StaticImpSet<E> {

	public DynamicImpSet(int maxCapacity) {
		super(maxCapacity);
		// TODO Auto-generated constructor stub
	}

	public boolean add(E obj){
		if (this.size() == this.maxCapacity()){
			E[] temp = (E[]) new Object[2*this.maxCapacity()];
			int i =0;
			for (E e: this){
				temp[i++] = e;
			}
			this.reset(temp);
		}
		return super.add(obj);
	}
}
