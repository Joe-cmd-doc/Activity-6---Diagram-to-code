package inherancegeneralization;

public class Cash extends Payment {
	
	private final float CashTendered;

	public Cash(float Amount, float CashTendered) {
		super(Amount);
		this.CashTendered=CashTendered;
	}


}
