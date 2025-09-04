package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car() { //is a constructor which should be same as class name
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics() {
		System.out.println("car colour is " + color);
		System.out.println("transmission type is " + transmission);
		System.out.println("car made in " + make);
		System.out.println("car tyres are " + tyres);
		System.out.println("car has " + doors + " doors");
	}
	public void accelarate() {
		System.out.println ("Car is moving forward");
	}
	public void brake() {
		System.out.println ("Car is stopped");
	}

}
