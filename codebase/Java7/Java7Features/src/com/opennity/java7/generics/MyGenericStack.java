package com.opennity.java7.generics;

/**
 * Implementing stack using generics.
 * This line is imp 	elements = ( E[] ) new Object[10]; as
 * 	not possible to crate array of elements =  new E[10];
 * @author prashant.purkar
 *
 * @param <E>
 */

public class MyGenericStack<E> {

	private E[] elements;
	//private String[] elements;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public MyGenericStack() {

		//elements = new String[10];
		//E<?> [] e1 = {};
		//elements = e1;
		elements = ( E[] ) new Object[10];
	}

	public void push(E e) {

		if (size < 10) {
			elements[size++] = e;

		} else {
			System.out.println("stack is full");
		}

	}

	public E pop(){

		if(size<=0){
			System.out.println("stack is empty");
		}

		// if Object array is used in place of E[] use below
		//E result = (E) elements[--size];
		E result =  elements[--size];
		elements[size] = null;

		return result;

	}

	public void myMethod(E e) {
		System.out.println(e);
		// do something
		return;

	}

	public boolean isEmpty(){

		return size==0;
	}

	/*
	 * public E getMethod(){
	 *
	 * return (E) e; }
	 */

	public static void main(String[] args) {

		MyGenericStack<String> stack = new MyGenericStack<>();
		for(String str :args){
			stack.push(str);
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().toUpperCase());
		}


	}
}
