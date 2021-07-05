  package SEDT_16;

import java.util.HashSet;

public class Arraymethod {

	

	public static void main(String[] args) {
		String s = "welcome to india";
	
    
	   String[] str= s.split(" ");
	   
	   HashSet<String> set= new HashSet<String>();
	   for (int i = 0; i < str.length; i++) {
		   set.add(str[i]);
	   }
	   System.err.println(set);
		
	}
	}
	


