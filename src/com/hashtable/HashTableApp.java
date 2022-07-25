package com.hashtable;

public class HashTableApp {
	public static void main(String[] args) {
		
		System.out.println("-----------WELCOME TO HASH TABLE-----------\n");

		String string = "To be or not to be";  
		String[] words = string.split(" ");  

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			Integer value = linkedHashMap.get(word);
			if (value == null) {               
				value = 1;
			} 
			else {
				value += 1;  
			}
			linkedHashMap.put(word, value);
		}
		System.out.println(linkedHashMap);
	}

}
