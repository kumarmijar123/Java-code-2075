

class Shapes{
	private int length, breadth;
	float radius;
	
	//Method Overloading
	public Shapes(int length) {
		this.length = this.breadth = length;
	
	}
	
	public Shapes(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public Shapes(float radius) {
		this.radius = radius;
	}
	
	public int area() {
		return length * breadth;
	}
	
	public float areaC() {
		return (float) Math.PI * radius * radius;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes rect = new Shapes(5, 5);//calls constructor (1 par)
		System.out.println("Area of a rectangel:" + rect.area());
		Shapes square = new Shapes(5);
		System.out.println("Area of square = "+ square.area());
		Shapes circle = new Shapes(23.45f);
		System.out.println("Area of circle = " + circle.areaC());

	}

}
