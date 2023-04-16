
public class Rectangle {
	int length, breadth;//instance variables
	
	void getParameters(int length, int breadth) {//method-non return
		//length = l;//instance variable initialize
		//breadth = b;//instance variable initialize
		this.length = length;
		this.breadth = breadth;
	}
	
	int getArea() {
		return length * breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Rectangle rec1 = new Rectangle();//object of rectangle
         //initializing instance variables
         rec1.length = 5;
         rec1.breadth = 6;
         System.out.println(rec1.getArea());
         //using method
         rec1.getParameters(3,  4);//method call
         System.out.println(rec1.getArea());
	}

}
