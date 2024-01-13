package JavaCollections;

public class Application {

	public static void main(String[] args) {
		
		Contract contract = new ContractImpl();
		printTerms(contract);
	}
	
	public static void printTerms(Contract contract) {
		contract.term1();
		contract.term2();
	}
}
