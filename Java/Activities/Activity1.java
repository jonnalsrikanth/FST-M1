package activities;

public class Activity1 {
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.make = 2024;
		obj.color = "black";
		obj.transmission = "Manual";
		
		obj.displayCharacteristics();
		obj.accelarate();
		obj.brake();
	}
}
