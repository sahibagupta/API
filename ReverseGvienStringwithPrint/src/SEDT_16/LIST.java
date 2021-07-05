package SEDT_16;

import java.util.ArrayList;

public class LIST {
public static void main(String[] args) {
	 ArrayList lst= new ArrayList<>();
	 
	 lst.add("sahiba");
	 lst.add(100);
	 lst.add(null);
	 lst.add("int");
	 System.out.println(lst);
for(int i=0;i<lst.size();i++) {
	System.out.println(lst.get(i));
}
}
}