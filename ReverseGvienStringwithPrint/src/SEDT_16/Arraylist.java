package SEDT_16;

import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {

	public static void main(String[] args) {
ArrayList lst=new ArrayList<>();
		
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(200);
		lst.add(500);
				
		
		 ArrayList lst2 = new ArrayList<>();
		
		lst2.add(100111);
		lst2.add(200);
	    lst2.add(300);
		lst2.add(200);
		lst2.add(400);
		

	
			//	System.out.println(lst.contains("sahiba"));
				//Collection.sort(lst);
			//	System.out.println(lst);
				//Collection.reverse(lst);
			//	lst.retainAll(lst2);
	        //lst.removeAll(lst2);
		lst.remove(2);
		lst2.remove(4);
		        System.out.println(lst);
				System.out.println(lst2);
				
				//lst.addAll(lst2);
				
				//System.out.println(lst);   
	}

}
