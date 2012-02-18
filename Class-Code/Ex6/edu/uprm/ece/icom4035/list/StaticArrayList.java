package edu.uprm.ece.icom4035.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StaticArrayList<E> implements List<E> {
	
	protected E[] elements;
	protected int currentSize;
	
	@SuppressWarnings("unchecked")
	public StaticArrayList(int maxCapacity){
		if (maxCapacity < 1){
			throw new IllegalArgumentException("Max capacity must be at least 1.");
		}
		this.currentSize = 0;
		this.elements = (E[])new Object[maxCapacity];
	} 
	
	private class StaticArrayListIterator implements Iterator<E>{
		private int currentPosition;

		public StaticArrayListIterator(int currentPosition) {
			super();
			this.currentPosition = currentPosition;
		}

		public StaticArrayListIterator() {
			super();
			this.currentPosition = 0;

		}

		@Override
		public boolean hasNext() {
			return this.currentPosition < currentSize;
		}

		@Override
		public E next() {
			if (!hasNext()){
				throw new NoSuchElementException("No more elements available");
			}
			return elements[this.currentPosition++];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Remove not supported");
		}
		
		
	}
	

	@Override
	public boolean add(E obj) {
		if (this.currentSize == this.elements.length){
			throw new IllegalStateException("List is full.");
		}
		else {
			this.elements[this.currentSize++] = obj;
			return true;
		}
	}

	@Override
	public boolean add(int index, E obj) {
		if (index < 0 || index >= currentSize){
			throw new IllegalArgumentException("Parameter index is out of bounds.");
		}
		if (this.currentSize == this.elements.length){
			throw new IllegalStateException("List is full.");
		}
		// open up space
		for (int i = this.currentSize; i > index; --i){
			this.elements[i] = this.elements[i-1];
		}
		this.elements[index] = obj;
		this.currentSize++;
		return true;
	}

	@Override
	public int size() {
		return this.currentSize;
	}

	@Override
	public boolean remove(E obj) {
		int target = this.firstIndex(obj);
		if (target < 0){
			return false;
		}
		else {
			return remove(target);
		}
	}

	@Override
	public boolean remove(int index) {
		if (index < 0 || index >= this.currentSize){
			throw new IllegalArgumentException("Parameter index is out of bounds.");
		}
		for (int i=index; i < this.currentSize - 1; ++i){
			this.elements[i] = this.elements[i+1];
		}
		this.elements[--this.currentSize] = null;
		return true;
	}

	@Override
	public int removeAll(E obj) {
		int result = 0;
		while(remove(obj)){
			result++;
		}
		return result;
	}

	@Override
	public E first() {
		return this.elements[0];
	}

	@Override
	public E last() {
		return this.elements[this.currentSize-1];
	}

	@Override
	public E get(int index) {
		if (index < 0 || index >= this.currentSize){
			throw new IllegalArgumentException("index is out of bounds.");
		}
		return this.elements[index];
	}

	@Override
	public void clear() {
		for (int i=0; i < this.currentSize; ++i){
			this.elements[i] = null;
		}
		this.currentSize = 0;
	}

	@Override
	public boolean contains(E obj) {
		for (E e : this){
			if (e!= null && e.equals(obj)){
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
	public Iterator<E> iterator() {
		return new StaticArrayListIterator();
	}

	@Override
	public Iterator<E> iterator(int index) {
		if (index < 0 || index >= this.currentSize){
			throw new IllegalArgumentException("index is out of bounds.");
		}
		return new StaticArrayListIterator(index);
	}

	@Override
	public int firstIndex(E obj) {
		// Assume obj is not null :)
		for (int i=0; i < this.currentSize; ++i){
			if (this.elements[i] != null && this.elements[i].equals(obj)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndex(E obj) {
		// Assume obj is not null :)
		for (int i=this.currentSize-1; i >= 0; --i){
			if (this.elements[i] != null && this.elements[i].equals(obj)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public E set(int index, E e) {
		if (index < 0 || index >= this.currentSize){
			throw new IllegalArgumentException("index is out of bounds.");
		}
		E temp = this.elements[index];
		this.elements[index] = e;
		return temp;
	}

}
