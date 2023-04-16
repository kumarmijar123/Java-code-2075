package package2;
import package1.prortectionlevel;

public class differentpackagenonsubclass {
	public differentpackagenonsubclass() {
		prortectionlevel p = new prortectionlevel();

		System.out.println("Default Number =  " +p.num);
		System.out.println("private Number =  " +p.numpri);
		System.out.println("protected Number =  " +p.numpro);
		System.out.println("public Number =  " +p.numpub);
	}
}
