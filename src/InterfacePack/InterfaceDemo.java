package InterfacePack;


interface First {
	int a=12;//must be initialized
	void method();
	public abstract void method1();
}

interface Second extends First {
	void display();
}

class A
{
	
}



public class InterfaceDemo extends A implements First{
	
	public static void main(String[] args) {
		First f;//reference is okay
		 
		//f=new First();//invalid
		
		System.out.println(a);
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
