package com.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Listing1 {
public static void main(String[] args) {
	
	ArrayList<Integer> list= new ArrayList<>();
	list.add(19);
	list.add(14);
	list.add(13);
	list.add(13);
	list.add(11);
	list.add(29);
	list.add(13);
	
	Iterator<Integer> itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
