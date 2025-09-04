package activities;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<String>() ;
		myList.add("Srikanth");
		myList.add("Ram");
		myList.add("Bala");
		myList.add("Ravi");
		myList.add(2, "Chandu"); //adds values at index 2
		
		for(String i : myList) {
		System.out.println(i);
		}
		
		System.out.println("name at 2nd index is "+ myList.get(2));
		
		System.out.println(myList.contains("Srik"));
		System.out.println(myList.size());
		
		System.out.println(myList.remove("Bala"));
		System.out.println(myList.size());
		
		for(String i : myList) {
			System.out.println(i);
			}
			

	}

}
