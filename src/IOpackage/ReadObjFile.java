package IOpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjFile {

	public static void main(String[] args) {
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		try {
			fi = new FileInputStream("E:\\javafiles\\objectfile.txt");
			oi = new ObjectInputStream(fi);
			Student s1 = (Student) fi.ReadObject();// type casting
			Student s2 = (Student) oi.readObject();
			System.out.println(s1.toString());
			System.out.println(s2.toString());
		}
		    catch (IOException ex) {
		    	
		    }

	}

}
