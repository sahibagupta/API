import java.util.HashSet;

public class FindNoOfOuccrnce {

	public static void main(String[] args) {
		String s= "sahiba";
		char[] ch=s.toCharArray();
		
		HashSet<Character> set= new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		
		for(Character chr:set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(chr==ch[i])
				{
					count++;
				}
				
			}
			System.out.println(chr+"=" +count);
			
		}
	}

}
