package inherancegeneralization;

public class Check extends Payment {
	
	private final String name;
	private final String bankID;

	public Check(float Amount,String name, String bankID) {
		super(Amount);
		
		this.name=name;
		this.bankID=bankID;
	}
	
	// This is the method of the class Check
	public void authorized() {
	}
		
	

}
