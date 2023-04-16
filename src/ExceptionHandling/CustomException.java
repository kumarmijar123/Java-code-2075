package ExceptionHandling;

class OwnException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OwnException(String message) {
		super(message);
	}
}
public class CustomException {
	public static void studentAge(int age) throws OwnException //throws OwnException
	{
		if(age<0) {
			throw new OwnException("Age less than zero exception");
		}
		else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     try{
    	 studentAge(2);
     }
	catch(OwnException ex) {
		System.err.println(ex);
	}

	}
}
