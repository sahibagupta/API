package SEDT_16;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class remove_duplicate {
	public static void main(String[] args) {
		String s= "sahiba welcome to india sahiba";
		
		//char[] ch=s.toCharArray();
	String[] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (int i = 0; i < str.length; i++) {
 
			set.add(str[i]);
			
		}
		for(String word: set) {
			
			System.err.println(word+" ");
			
		}
	}

}
