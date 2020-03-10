package assignment_1;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;


public class RegularAmount 
{
	@NotNull
	private Frequency frequency;
	
	@Positive
	@DecimalMin( value = "00.00", inclusive = false)
	@Digits(integer = 2, fraction = 2)
	@NotNull
	private String amount;

	public Frequency getFrequency() 
	{
		return frequency;
	}

	public void setFrequency(Frequency frequency) 
	{
		this.frequency = frequency;
	}

	public String getAmount() 
	{
		return amount;
	}

	public void setAmount(String amount) 
	{
		this.amount = amount;
	}
}