package Workouts;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String args[]) {
		
		//Concat string
		String a=  "Hi";
		
		String b= "Hello";
		System.out.println(add(a,b));
		System.out.println(add1(10,20));
		
		person obj = new person();
		obj.printHi();
		
		String str = "india";
		count(str);
		
		
	}
	
	private static void count(String str) {
		HashMap<Character,Long> map = new HashMap<>();
		
		for(int i =0; i<str.length();i++ ) {
			
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), (long) 1);
			}
		}
		 for (Map.Entry<Character, Long> mapp : map.entrySet() ) {
			 System.out.println("Character "+ mapp.getKey()+ " Count " + mapp.getValue());
		 }	
	}

	public static String add(String a, String b) {
		String c = a+b;
		return c;
	}
	
	public static Integer add1(Integer a, Integer b) {
		Integer c = a+b;
		return c;
	}
	
	public static Integer add(Integer a, Integer b) {
		Integer c = a+b;
		return c;
	}	
}

class student extends person{
	
	public void printHi(){
		System.out.println("Hi this is sub class");
	}
}


class person{
	public void printHi(){
		System.out.println("Hi this is main class");
	}
}





