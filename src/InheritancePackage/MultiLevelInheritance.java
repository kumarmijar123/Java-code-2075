package InheritancePackage;

class Car {
	
	final int wheels=4;
	Car(){
		System.out.println("Car Constructor");
		
	}
	
	public void VehicleType() {
		System.out.println("Type: Car");
	}
}

class Maruti extends Car { //Sub class
	public Maruti() {
		System.out.println("Maruti Constructor");
	}
	public void brand() {
		System.out.println("Brand: Suzuki");
	}
	
	public void speed() {
		System.out.println("80km/hr");
	}
}

class Maruti800 extends Maruti { //sub class
	@Override//Data Annotation
	public void speed() {
		System.out.println("120km/hr");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti800 car = new Maruti800();
		car.VehicleType();
		car.brand();
		car.speed();//calls overridden method
		System.out.println("No. of wheels=" + car.wheels);

	}

}
