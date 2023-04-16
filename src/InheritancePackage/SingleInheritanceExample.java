package InheritancePackage;

class Room {
	int length, breadth;
	public Room(int length, int breadth) { //Constructor
		this.length = length;
		this.breadth = breadth;
	}
	
	int area() {
		return length * breadth;
	}
}

class BedRoom extends Room {
	int height;
	public BedRoom(int length, int breadth, int height) {
		super(length, breadth);//calls the base constructor
		this.height = height;
	}
	
	int volume() {
		return length * breadth * height;
	}
	
}

public class SingleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BedRoom room = new BedRoom(3, 5, 7);
        System.out.println("Are = "+room.volume());
        System.out.println("Volume = "+ room.volume());
	}

}
