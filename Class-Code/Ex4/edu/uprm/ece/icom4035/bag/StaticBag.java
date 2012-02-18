package edu.uprm.ece.icom4035.bag;

import java.util.Iterator;

public class StaticBag<E> implements Bag<E> {
	protected E[] elements;
	private int currentSize;
	
	protected class BagIterator implements Iterator<E> {
		// index to the current position (next available value)!
		private int currentPosition;
		
		public BagIterator(){
			this.currentPosition = 0;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return this.currentPosition < size();
		}

		@Override
		public E next() {
			if (hasNext()){
				return elements[currentPosition++];
			}
			else {
				return null;
			}
			// Coolness!!!
//			return (hasNext() ? elements[currentPosition++] : null);
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Remove is not supported.");
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public StaticBag(int maxSize){
		if (maxSize < 1){
			throw new IllegalArgumentException("Max size must be at least 1.");
		}
		this.elements = (E[]) new Object[maxSize];
		this.currentSize = 0;
	}
	
	

	@Override
	public void add(E obj) {
		if (currentSize < elements.length){
			this.elements[this.currentSize++] = obj;
		}
	}

	@Override
	public boolean remove(E obj) {
		for (int i=0; i < this.currentSize; ++i){
			if (this.elements[i].equals(obj)){
				this.elements[i] = this.elements[this.currentSize - 1];
				this.elements[--this.currentSize] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public int removeAll(E obj) {
		int result =0;
		while (remove(obj)){
			result++;
		}
		return result;
		
	}

	@Override
	public int count(E obj) {
		int result = 0;
		for (int i =0; i < this.currentSize; ++i){
			if (this.elements[i].equals(obj)){
				result++;
			}
		}
		return result;
	}

	@Override
	public int size() {
		return this.currentSize;
	}

	@Override
	public int capacity() {
		return this.elements.length;
	}

	@Override
	public boolean isMember(E obj) {
		return count(obj) > 0;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
		// Cafre!!!
//		if (size() == 0){
//			return true;
//		}
//		else {
//			return false;
//		}
	}

	@Override
	public void clear() {
		for (int i =0; i < currentSize;++i){
			this.elements[i] = null;
		}
		this.currentSize = 0;
	}



	@Override
	public Iterator<E> iterator() {
		return new BagIterator();
	}

}
