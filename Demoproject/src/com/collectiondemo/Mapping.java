package com.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Mapping {
public static void main(String[] args) {
	
	
	
	
	HashMap<Integer, String> map= new HashMap<>();
	map.put(1, "User1");
	map.put(2, "Usser2");
	map.put(3, "User3");
	map.put(4, "User4");
	
Set<Integer> s=	map.keySet() ;
	Iterator<Integer> itr= s.iterator();
while(itr.hasNext()) {
	int i= itr.next();
	System.out.println("key=="+i);
	System.out.println("value=="+map.get(i));
}
}
}
