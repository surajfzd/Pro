package com.LinkedListOperations.view;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add("Java");
		System.out.println(ll);
		ll.add("123");
		System.out.println(ll);
		System.out.println(ll);
		ll.add(9876);
		System.out.println(ll);
		ll.addLast("Suraj18");
		System.out.println(ll);
		ll.add(3,"replaced");
		System.out.println(ll);

	}

}
