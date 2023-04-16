package InheritancePackage;//user defined

abstract class Employee {//base / parent / super class
	int id;
	String name;
	float salary;
}

class Developer extends Employee { //derived / child / sub class
	float bonus;
	void display() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Total Salary = " + (salary + bonus));
		
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e = new Employee;
		Developer emp = new Developer();
		emp.id = 1011;
		emp.name ="Kumar";
		emp.salary = 30000.00045f;
		emp.bonus = 15000.50f;
		emp.display();
		

	}

}
