    
public class CharArray {

	public static void main(String[] args) {
	
	 String st ="sahiba";
 
		
		char[] ch =st.toCharArray();
		
		String rev =" ";
		
		for (int  i=ch.length-1; i>=0;i--) {
			rev=rev+ch[i];
			
		}
		System.out.println(rev);

	}
	

}
