package edu.uprm.ece.icom4035.set;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StaticImpSet<E> implements Set<E> {
	private E[] elements;
	private int currentSize;
	
	public StaticImpSet(int maxCapacity){
		if (maxCapacity < 1){
			throw new IllegalArgumentException("Max Capacity must be at least 1.");
		}
		this.elements = (E[]) new Object[maxCapacity];
		this.currentSize = 0;
	}

	public int maxCapacity(){
		return this.elements.length;
	}
	
	protected void reset(E[] newElements){
		if (newElements == null){
			throw new IllegalArgumentException("Cannot pass elements array as null.");
		}
		this.elements = newElements;
	}
	
	private class SetIterator implements Iterator<E> {
		
		private int currentPosition;
		
		private  SetIterator(){
			this.currentPosition = 0;
		}

		@Override
		public boolean hasNext() {
			return this.currentPosition < currentSize;
		}

		@Override
		public E next() {
			if (!hasNext()){
				throw new NoSuchElementException("There is no next element.");
			}
			return elements[this.currentPosition++];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Remove is not supported.");
		}
		
	}
	
	@Override
	public Iterator<E> iterator() {
		return new SetIterator();
	}

	@Override
	public boolean add(E obj) {
		if (this.currentSize == this.elements.length){
			throw new IllegalStateException("Set is full.");
		}
		if (isMember(obj)){
			return false;
		}
		else{
			this.elements[this.currentSize++] = obj;
			return true;
		}
		
	}

	@Override
	public boolean remove(E obj) {
		for (int i=0; i < this.currentSize; ++i){
			if (this.elements[i].equals(obj)){
				this.elements[i] = this.elements[--currentSize];
				this.elements[this.currentSize] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isMember(E obj) {
		// loop to traverse array to find obj
//		for (E e: this.elements){
//			if (e != null && e.equals(obj)){
//				return true;
//			}
//		}
		
		for (E e: this){
			if (e.equals(obj)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		return this.currentSize == 0;
	}

	@Override
	public Set<E> union(Set<E> S) {
		Set<E> result = new StaticImpSet<E>(this.size() + S.size());
		
		// Add all elements of this set into the result;
		for (E e: this){
			result.add(e);
		}
		
		for (E e: S){
			if (!result.isMember(e)){
				result.add(e);
			}
		}
		return result;
	}

	@Override
	public Set<E> intersection(Set<E> S) {
		int resultSize = Math.min(this.size(), S.size());
		Set<E> result = new StaticImpSet<E>(resultSize);
		
		for (E e: this){
			if (S.isMember(e)){
				result.add(e);
			}
		}
		return result;
		
		// cooler
		// return S.difference(S.difference(this)); 
		
	}

	@Override
	public Set<E> difference(Set<E> S) {
		Set<E> result = new StaticImpSet<E>(this.size());
		
		for (E e: this){
			if (!S.isMember(e)){
				result.add(e);
			}
		}
		return result;
	}

	@Override
	public void clear() {
		for (int i=0; i < this.currentSize; ++i){
			this.elements[i] = null;
		}
		this.currentSize = 0;
	}

	@Override
	public int size() {
		return this.currentSize;
	}

}
