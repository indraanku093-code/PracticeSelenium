package demonew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class listprograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> ls=new ArrayList<String>();
//adding in list
ls.add("one");
ls.add("two");
ls.add("three");
/*//retrieving the data
System.out.println(ls.get(0));
//updating the list
System.out.println(ls.set(1, "hi"));
//removing from list
System.out.println(ls.remove(1));
//sorting from list
Collections.sort(ls);
System.out.println("after sorting:"+ls);*/
//reversing from list
Collections.reverse(ls);
System.out.println("after reversing:"+ls);



	}

}
