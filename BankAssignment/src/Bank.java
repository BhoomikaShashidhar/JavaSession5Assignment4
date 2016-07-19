
public class Bank {
	protected int rateOfIntrest;
	
public int getRateOfIntrest() {
		return rateOfIntrest;
	}

	public void setRateOfIntrest(int rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}

public static void main(String args[])
{
	
	SBI sbi=new SBI();
	System.out.println("Intrest value of SBI is "+sbi.rateOfIntrest);
	ICICI icici=new ICICI();
	System.out.println("Intrest value of ICICI is "+icici.rateOfIntrest);
	Axis axis=new Axis();
	System.out.println("Intrest value of Axis is "+axis.rateOfIntrest);
	
	
	}
}
