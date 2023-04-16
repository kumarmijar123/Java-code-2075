package IOpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException
import java.io.ObjectOutputStream;

public class WriteObjToFile {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;
		Student s1 = new Student(1, "Kumar",23);
		Student s2 = new Student(2, "Subash",19);
		File file = new File("E:\\javafiles\\objectfile.txt");
		try {
			FileOutputStream fo1 = new FileOutputStream(file);
			ObjectOutputStream oo1 = new ObjectOutputStream(fo1);
			oo.writeObject(s1);
			oo.writeObject(s2);
		} catch (IOException ex) {
			
		}finally {
			fo.close();
			oo.close();
		}
		

	}

}
