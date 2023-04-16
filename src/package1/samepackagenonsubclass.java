package package1;

public class samepackagenonsubclass {
	public samepackagenonsubclass() {
		prortectionlevel p= new prortectionlevel();

		System.out.println("Default Number =  " + p.num);
//		System.out.println("private Number =  " + p.numpri);
		System.out.println("protected Number =  " + p.numpro);
		System.out.println("public Number =  " + p.numpub);
	}
}
