package SEDT_16;

public class Max_Min {
	public static void main(String[] args) {
		
		int a[]= {30,40,10,50,70};
		
		  for (int i = 0; i < a.length; i++) {
			
			  for (int j = 0; j < a.length; j++) {
				
				  if(a[i]<a[j])
				  {
					  int temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
					  	  
				  }
				  
			}
		
		  }
		  
	}

}
