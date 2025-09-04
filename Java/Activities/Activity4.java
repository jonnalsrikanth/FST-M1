package activities;

import java.util.Arrays;

public class Activity4 {
	
	public static void ascendingarray(int array[]) {
		int size = array.length;
		for (int i=1; i<size;i++) {
			int key=array[i]; //index 1
			int j=i-1; //index 0
			while(j>=0 && key<array[j]) { //3<5; j=0; i=1
				array[j+1] = array[j];
				j--;				
			}
		array[j+1]=key;
		}		
	}
	
	public static void main(String[] args) {	
		int a[]= {5,3,2,9,7,6};
		ascendingarray(a);
		System.out.println(Arrays.toString(a));		
		
	}

}
