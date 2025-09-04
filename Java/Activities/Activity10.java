package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set does not have the index number 
		Set<Object> hs = new HashSet<Object>(); //can store any datatype as it is object
		hs.add("Ram"); 
		hs.add("Srikanth");
		hs.add("Cherry");
		hs.add("Bala");
		hs.add("Ravi");
		hs.add(100);
		
		System.out.println("Size of set is " + hs.size());
		for (Object o:hs) {
			System.out.println(o);
		}
				
		hs.remove("Ram");
		System.out.println("Size of set is " + hs.size());
		hs.remove("aaaa");
		System.out.println(hs.contains(100));
		System.out.println(hs);

	}

}
