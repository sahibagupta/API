
public class Rev_StringwithoutArray {

	public static void main(String[] args) {
		String s="sahiba";
		
		char[] ch =s.toCharArray();
		
		
		for (int i = ch.length-1; i >0; i--) {
			System.out.print(s.charAt(i));
			System.out.println();
			
		}
	}

}
