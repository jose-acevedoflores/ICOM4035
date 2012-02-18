package edu.uprm.ece.icom4035.set;

public interface Set<E> extends Iterable<E> {
	public boolean add(E obj);
	public boolean remove(E obj);
	public boolean isMember(E obj);
	public boolean isEmpty();
	public Set<E> union(Set<E> S);
	public Set<E> intersection(Set<E> S);
	public Set<E> difference(Set<E> S);
	public void clear();
	public int size();
}
