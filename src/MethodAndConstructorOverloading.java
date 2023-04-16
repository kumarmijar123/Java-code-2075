

class Shape{
	private int length, breadth;
	float radius;
	
	//Method Overloading
	public void setData(int length) {
		this.length = this.breadth = length;
	
	}
	
	public void setData(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void setData(float radius) {
		this.radius = radius;
	}
	
	public int area() {
		return length * breadth;
	}
	
	public float areaC() {
		return (float) Math.PI * radius * radius;
	}
}
public class MethodAndConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		shape.setData(3, 4);
		System.out.println("Area of a rectangle = "+ shape.area());
		shape.setData(5);
		System.out.println("Area of square = "+ shape.area());
		shape.setData(20.5f);
		System.out.println("Area of circle = " + shape.areaC());

	}

}
