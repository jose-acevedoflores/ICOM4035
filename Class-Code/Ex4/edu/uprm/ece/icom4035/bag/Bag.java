package edu.uprm.ece.icom4035.bag;

public interface Bag<E> extends Iterable<E>{
	public void add(E obj);
	public boolean remove(E obj);
	public int removeAll(E obj);
	public int count(E obj);
	public int size();
	public int capacity();
	public boolean isMember(E obj);
	public boolean isEmpty();
	public void clear();
	
}
