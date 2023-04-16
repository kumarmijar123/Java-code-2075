package package1;

public class prortectionlevel {
	int num=20; //default modifie
	private int numpri= 30;
	protected int numpro = 90;
	public int numpub= 77;
	
	public prortectionlevel() {
		System.out.println("Default Number =  " +num);
		System.out.println("private Number =  " +numpri);
		System.out.println("protected Number =  " +numpro);
		System.out.println("public Number =  " +numpub);
	}

	public static void main(String[] args) {
		new prortectionlevel();
	}
}
