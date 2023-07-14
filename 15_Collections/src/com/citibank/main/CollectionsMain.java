package com.citibank.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain extends Object {
	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		List<Integer> numbersList = new ArrayList<>();

		numbersList.add(23);
		numbersList.add(43);
		numbersList.add(32);
		numbersList.add(43);
		numbersList.add(10);
		numbersList.add(43);

		System.out.println(numbersList);
		System.out.println(numbersList.size());
		System.out.println(numbersList.contains(43));
		System.out.println(numbersList.indexOf(43));

		for (Integer integer : numbersList) {
			System.out.println(integer);
//			if(integer == 43) {
//				numbersList.remove(integer);
//			}
		}

		numbersList.remove(Integer.valueOf(43));
		System.out.println(numbersList);
		System.out.println(numbersList.size());

		System.out.println("2. HashSet");
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Mohan");
		nameSet.add("Samrat");
		nameSet.add("Samarth");
		nameSet.add("Jimit");
		nameSet.add("Samrat");
		nameSet.add("Jhon");
		nameSet.add("Mohan");
		nameSet.add("Jimit");
		nameSet.add("Meena");

		System.out.println(nameSet);
	
		
		

		System.out.println("3. TreeSet");
		TreeSet<String> sortedNameSet = new TreeSet<>();
		sortedNameSet.add("Mohan");
		sortedNameSet.add("Samrat");
		sortedNameSet.add("Samarth");
		sortedNameSet.add("Jimit");
		sortedNameSet.add("Samrat");
		sortedNameSet.add("Jhon");
		sortedNameSet.add("Mohan");
		sortedNameSet.add("Jimit");
		sortedNameSet.add("Meena");
		System.out.println(sortedNameSet);

		System.out.println("4. HashMap");
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "Vivek");
		hashMap.put(102, "Reema");
		hashMap.put(102, "Seema");
		hashMap.put(104, "Vivek");

		System.out.println(hashMap.get(104));
		
		Set<Integer> keys =  hashMap.keySet();
		System.out.println(keys);
		
		
		

	}
	
	
	
}
