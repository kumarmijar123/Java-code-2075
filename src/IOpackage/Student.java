package IOpackage;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age = age;
	}
	
	public String toString() {
		return "My name is " + name + " of age " + age + " with id " + id;
	}

	public static void main(String[] args) {
		

	}

}
