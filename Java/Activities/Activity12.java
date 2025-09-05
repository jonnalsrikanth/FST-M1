package activities;

interface Addable {
	
	int add(int n1, int n2);
}

//class Addablenormal{
//	public int Add1(int a, int b) {
//		return a+b;
//}
//}
public class Activity12 {

	public static void main(String[] args) {
		
//		// using regular class/method process		
//		Addablenormal obj = new Addablenormal();		
//		System.out.println(obj.Add1(10, 20));	
		
		// Lambda expression without return keyword.
        Addable ad1 = (n1, n2) -> (n1 + n2);
        
        System.out.println(ad1.add(20, 20));
 
        // Lambda expression with return keyword.
        Addable ad2 = (int n1, int n2) -> {
            return (n1 + n2);
        };
        System.out.println(ad2.add(15, 20));
            		
	}
}
