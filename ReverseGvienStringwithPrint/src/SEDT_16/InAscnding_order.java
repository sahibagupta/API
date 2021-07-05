package SEDT_16;

public class InAscnding_order {
   public static void main(String[] args) {
	int a[]= {30,40,10,50,70};
	
	  for (int i = 0; i < a.length; i++) {
		
		  for (int j = 0; j < a.length; j++) {
			
			  if(a[i]>a[j])
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				  	  
			  }
			  
		}
	
	  }
	  System.out.println(a[1]);
	  System.out.println(a[a.length-2]);
	  System.out.println("first max"+a[0]);
	  System.out.println("second max"+a[1]);
	  System.out.println("first min"+ a[a.length-1]);
	  System.out.println("second min" +a[a.length-2]);
}
   
}
