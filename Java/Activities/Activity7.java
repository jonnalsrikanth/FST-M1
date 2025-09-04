package activities;

interface BicycleParts {
	public int tyres=4;
	public int maxspeed=80;
		
	}

interface BicycleOperations {
	public void applyBrake(int decrement);
	public void speedUp(int increment);
		
	}

class Bicycle implements BicycleParts, BicycleOperations{	
	
	int gears;
	int currentSpeed ;

	public Bicycle(int gears, int currentSpeed) {
		// TODO Auto-generated constructor stub
		this.gears = gears;
		this.currentSpeed=currentSpeed;
	}
	
	public void applyBrake(int decrement) {
		currentSpeed = currentSpeed - decrement;	
		System.out.println("current speed "+currentSpeed);
	}
	public void speedUp(int increment) {
		currentSpeed = currentSpeed + increment;
		System.out.println("current speed "+ currentSpeed);
	}
    //Method to print info of Bicycle
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxspeed);
	}
}
//derived class
class MountainBike extends Bicycle {
	int seatHeight;
	//constructor
	MountainBike(int gears, int currentSpeed, int startHeight) {
		super(gears, currentSpeed);
		seatHeight=startHeight;		
		
	}
	void setHeight(int newvalue) {
		seatHeight = newvalue;
	}
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    } 
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike obj = new MountainBike(4,20,10);
		System.out.println(obj.bicycleDesc());
		
		

	}

}
