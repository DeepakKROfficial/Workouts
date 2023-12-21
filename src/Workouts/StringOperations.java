package Workouts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringOperations {
	public static void main(String args[]) {

		String str = "Welcome to eclipse";
		//length
		System.out.println("Lengh : "+str.length());
		
		//To uppercase
		System.out.println("Uppercase "+str.toUpperCase());
		
		String txt = "     banana    mine     ";

		String		x = txt.strip();

		System.out.println("of all fruits"+ x + "is my favorite");
		
		
		//Contains
		String substring = "to";
		if(str.contains("Welcome")) {
			System.out.println("Found");}else{System.out.println("Not Found");
			}
		if(str.contains("Welcomes")) {
			System.out.println("Found");}else{System.out.println("Not Found");
			}
		
		//Find index of a substring
		System.out.println("Index of character "+str.indexOf(substring));
		System.out.println("Index of character "+str.indexOf(substring,9));
		
		//Replace
		System.out.println(str.replace("eclipse", "intelliJ"));
		
		 
		
		//Split
		String[] words = str.split("\\s");
		for(String word : words) {
			System.out.println(word);
		}
		
		String [] wordsWithCount = str.split("\\s",2); // Split to two words
		for(String word : wordsWithCount) {
			System.out.println(word);
		}
		
		
		//Methods
		//Reverse String
		System.out.println(reverseString("akipeeD"));
		
		//Alphabetic order
		System.out.println(alphabeticOrder("Deepika"));
		
		//No of occurrence
		System.out.println(noOfOccurance(str,substring));
		
		//Find common strings in two lists
		List<String> list1 = new ArrayList<>();
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Bye");
		List<String> list2 = new ArrayList<>();
		list2.add("Hi");
		list2.add("Welcome");
		list2.add("Hello");
		findCommonStrings(list1,list2);
		
		//Count words
		str = "Welcome to ootty Nice to meet you Welcome you warmly";
		countWords(str);
		
		List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
		
		System.out.println(myList.get(0));

        String searchItem = "banana";

        boolean containsItem = myList.stream()
                .anyMatch(item -> item.equals(searchItem));

        if (containsItem) {
            System.out.println("List contains " + searchItem);
        } else {
            System.out.println("List does not contain " + searchItem);
        }
        
        StringJoiner joiner = new StringJoiner(", "); // Create a StringJoiner with a delimiter
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        String result = joiner.toString(); // Get the joined string
        System.out.println(result);
	}

	private static void findCommonStrings(List<String> list1, List<String> list2) {
		List<String> newList = new ArrayList<>();
		for(String word : list1) {
			if(list2.contains(word)) {
				newList.add(word);
			}
		}
		
		List<String> newList2 = list1.stream().filter(list2 :: contains).collect(Collectors.toList());
		System.out.println(newList);
		System.out.println(newList2);
	}

	public static String reverseString(String str) {
		String revString = new String(); 
		for(Integer i = str.length()-1;i>=0;i--) {
			revString+= str.charAt(i);
		}
		return revString;
	}
	
	public static String alphabeticOrder(String str) {
		String newString = new String(); 
		for(int i = 65;i<=90;i++) {
			for (int j=0;j<str.length();j++) {
				if(str.charAt(j)==(char)i||str.charAt(j)==(char)(i+32)) {
					newString+= str.charAt(j);
				}
			}
		}
		return newString;
	}
	
	public static Integer noOfOccurance(String str, String subStr) {
		int count = 0, lastIndex = 0;
		while(lastIndex!=-1) {
			lastIndex = str.indexOf(subStr, lastIndex);

			if(lastIndex!=-1) {
				lastIndex+=subStr.length();
				count ++;}
		}
		return count;
	}
	
	public static void countWords(String str) {
		String []words = str.split("\\s"); 
		HashMap<String,Integer> wordMap = new HashMap<>();
		for(String word : words) {
			if(wordMap.containsKey(word)) {
				wordMap.put(word,  wordMap.get(word)+1);
			}else {
				wordMap.put(word,1);
			}
		}
		for(Map.Entry<String, Integer> map : wordMap.entrySet()) {
			System.out.println(map.getKey()+ " : " +map.getValue());
		}
	}
	
	
}

