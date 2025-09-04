package activities;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> colours = new HashMap();
		
		colours.put(1, "red");
		colours.put(2, "yellow");
		colours.put(3, "orange");
		colours.put(4, "blue");
		colours.put(5, "green");
		
		System.out.println(colours.size());
		System.out.println(colours);
		
		for(int k:colours.keySet()) {
			System.out.println(k + " " + colours.get(k));
		}
		
		//entryset() is used to pull each record pair at a time
		for(Entry<Integer, String> item: colours.entrySet()  ) {
			System.out.println(item.getKey() + " " + item.getValue());
		}
		
		colours.remove(1);
		
		System.out.println(colours);
		
		System.out.println(colours.containsValue("yellow"));
		
		System.out.println(colours.size());
	}

}
