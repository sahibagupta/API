import java.util.HashSet;
import java.util.concurrent.ForkJoinPool;

import javax.print.DocFlavor.STRING;

public class DuplicateWord {

	public static void main(String[] args) {
		String s= "welcome to bhopal";
		
		String[] st= s.split(" ");
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
			
		}
		System.out.println(set);
	}


	  int Totalnumofdup = 0;
	  {
	   
	  for(STRING word : set) 
	  {
		  
		  int count=0;
		  for (int i = 0; i < st.length; i++) {
			  if(word.equals(st[i]))
			  {
				  count++;
			  }
		  
			  if (count>1) {
				  count++;
			  }
		  }
			  System.out.println(Totalnumofdup);
				
			}
			  }
			
		

	  
	}
}
