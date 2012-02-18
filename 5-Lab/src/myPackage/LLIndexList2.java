package myPackage;

import indexList.IndexList;
import linkedLists.Node;
import linkedLists.NodeOutOfBoundsException;

public class LLIndexList2<E> implements IndexList<E> {
	private LinkedList2<E> internalLL;  

	/**
		Creates an empty instance of a list. 
	 **/ 
	public LLIndexList2(LinkedList2<E> theList) 
	{ 
		internalLL = theList;
	}

	@Override
	public int size() {

		int size = 0;

		Node<E> temp;

		try{
			temp = this.internalLL.getFirstNode(); //Here it corresponds to the first element
		}
		catch(NodeOutOfBoundsException r)
		{
			return size; // But we know it's 0
		}

		while(true)
		{
			try{
				size++;	
				temp = this.internalLL.getNodeAfter(temp);
			}	
			catch(NodeOutOfBoundsException r)
			{
				return size;
			}
		}

	}

	@Override
	public boolean isEmpty() {

		try{
			this.internalLL.getFirstNode();
		}
		catch (NodeOutOfBoundsException r) 
		{
			return true;
		}

		return false;
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {

		int max = this.size();
		if(i < 0 || i > max)
		{
			throw new IndexOutOfBoundsException("add: " 
					+ "index=" + i + " is out of bounds. size = " + 
					max);
		}

		int size = 0;



		if( i  ==  max)
		{
			this.add(e);
		}
		else if(i == 0)
		{
			Node<E> newNode = this.internalLL.createNewNode();
			newNode.setElement(e);
			this.internalLL.addFirstNode(newNode);
		}
		
		else{
			Node<E> temp = this.internalLL.getFirstNode();
			while(size < i-1)
			{
				temp = this.internalLL.getNodeAfter(temp);
				size++;	
			}

			Node<E> newNode = this.internalLL.createNewNode();
			newNode.setElement(e);

			this.internalLL.addNodeAfter(temp, newNode);
		}
	}

	@Override
	public void add(E e) {

		Node<E> newE = this.internalLL.createNewNode();
		newE.setElement(e);
		boolean empty = false;

		try{

			this.internalLL.getFirstNode();
		}
		catch(NodeOutOfBoundsException r)
		{
			this.internalLL.addFirstNode(newE);
			empty = true;
		}

		if(!empty)
		{
			Node<E> temp = internalLL.getLastNode();
			this.internalLL.addNodeAfter(temp, newE);
		}

	}

	@Override
	public E get(int i) throws IndexOutOfBoundsException {

		int max = this.size();
		if(i < 0 || i >= max )
		{
			throw new IndexOutOfBoundsException("get: " 
					+ "index=" + i + " is out of bounds. size = " + 
					max);
		}

		int pos = 0;
		
		Node<E> temp = this.internalLL.getFirstNode();
		
		while(pos < i)
		{
			pos++;
			temp = this.internalLL.getNodeAfter(temp);
		}
		
		return temp.getElement();
	}

	@Override
	public E remove(int i) throws IndexOutOfBoundsException {

		int max = this.size();
		if(i < 0 || i >= max )
		{
			throw new IndexOutOfBoundsException("remove: " 
					+ "index=" + i + " is out of bounds.");
		}

		int pos = 0;
		
		Node<E> temp = this.internalLL.getFirstNode();
		
		while(pos < i)
		{
			pos++;
			temp = this.internalLL.getNodeAfter(temp);
		}
		
		Node<E> toErase = temp;
		
		this.internalLL.removeNode(temp);
		
		return toErase.getElement();
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		
		E removed = null;
		try{
			
			this.add(i, e);
			removed = this.remove(i+1);
		}
		catch(IndexOutOfBoundsException r)
		{
			
			throw new IndexOutOfBoundsException("set: " 
					+ "index=" + i + " is out of bounds.");
		}
		return removed;
	}




}
