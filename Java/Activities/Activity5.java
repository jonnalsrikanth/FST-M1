package activities;

abstract class Book {
	String title;
	
	 abstract void setTitle(String t);
	
	String getTitle() { //Concrete method
		return title;
	}
}	
class MyBook extends Book {
	 void setTitle(String s) {
			title = s;
		}
}
	
public class Activity5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title = "Hover Car Racer";
		Book newNovel = new MyBook();
		newNovel.setTitle(title);	
		
		System.out.println("Book title is "+ newNovel.getTitle());	

	}

}
