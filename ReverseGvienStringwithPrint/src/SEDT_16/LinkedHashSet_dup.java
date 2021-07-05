package SEDT_16;

import java.util.LinkedHashSet;

public class LinkedHashSet_dup {

	public static void main(String[] args) {
		String s="sahiba welcome to indore";
		
		char[] ch= s.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		
	for(Character c: set)
	{
		System.out.print
		
		  (c);
	}

	}
}

