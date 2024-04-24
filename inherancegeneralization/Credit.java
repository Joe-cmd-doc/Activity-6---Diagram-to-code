package inherancegeneralization;

import java.util.Date;

public class Credit extends Payment {
	
	private final String type;
	private final String number;
	private final Date expDate;
	

	public Credit(float Amount, String type,String number, Date expDate) {
		super(Amount);
		this.type=type;
		this.number=number;
		this.expDate=expDate;
	}

	
}
