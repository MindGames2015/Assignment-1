package assignment_1;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.text.DateFormat;
import java.text.ParseException;

import java.util.Set;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class RegularAmountValidatorTest 
{

    private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    

    // Invalid Amount
    @Test
    public void givenAnyFrequency_whenANonNumericOrBlankAmountIsProvided_shouldNotValidate() 
    {
        RegularAmount regularAmount = new RegularAmount();
		regularAmount.setFrequency(Frequency.TWO_WEEK);
		regularAmount.setAmount("  ");
        Set<ConstraintViolation<RegularAmount>> violations = validator.validateProperty(regularAmount, "amount");
        assertThat(violations.size()).isEqualTo(1);
    }
    
    // Null Frequency
    @Test
    public void givenAnyAmount_when_A_NullFrequencyIsProvided_shouldNotValidate() 
	{
		RegularAmount regularAmount = new RegularAmount();
		regularAmount.setFrequency(null);
		regularAmount.setAmount("50.99");

        Set<ConstraintViolation<RegularAmount>> violations = validator.validateProperty(regularAmount, "frequency");
        assertThat(violations.size()).isEqualTo(1);
    }

    // Weekly
 	@Test
 	public void given_A_WEEK_Frequency_whenAnyAmountIsProvided_shouldNotValidate() 
 	{
 		RegularAmount regularAmount = new RegularAmount();
 		regularAmount.setFrequency(Frequency.WEEK);
 		regularAmount.setAmount("150.99");
        Set<ConstraintViolation<RegularAmount>> violations = validator.validate(regularAmount);
        assertThat(violations.size()).isEqualTo(1);
    }

 	// Monthly
 	@Test
 	public void given_A_MONTH_Frequency_whenAnyAmountIsProvided_shouldNotValidate() 
 	{
 		RegularAmount regularAmount = new RegularAmount();
 		regularAmount.setFrequency(Frequency.MONTH);
 		regularAmount.setAmount("200.00");
        Set<ConstraintViolation<RegularAmount>> violations = validator.validate(regularAmount);
        assertThat(violations.size()).isEqualTo(1);
    }

 	// Validated as valid
 	@Test
 	public void given_Validated_As_Valid()
 	{
 		RegularAmount regularAmount = new RegularAmount();
 		regularAmount.setFrequency(Frequency.TWO_WEEK);
 		regularAmount.setAmount("50.00");
        Set<ConstraintViolation<RegularAmount>> violations = validator.validate(regularAmount);
        assertThat(violations.size()).isEqualTo(0);
    }

 	// Validated as invalid
 	@Test
 	public void given_Validated_As_Invalid()
 	{
 		RegularAmount regularAmount = new RegularAmount();
 		regularAmount.setFrequency(Frequency.YEAR);
 		regularAmount.setAmount("2004.53");
        Set<ConstraintViolation<RegularAmount>> violations = validator.validateProperty(regularAmount, "amount");
        assertThat(violations.size()).isEqualTo(1);
    }

	/*
	 * // challenge solutions
	 * 
	 * @Test public void
	 * givenTransactionPOJO_whenQuantityNegative_shouldNotValidate() { RegularAmount
	 * regularAmount = new RegularAmount(); transaction.setQuantity(-1);
	 * Set<ConstraintViolation<Transaction>> violations =
	 * validator.validateProperty(transaction, "quantity");
	 * assertThat(violations.size()).isEqualTo(1); }
	 * 
	 * @Test public void givenTransactionPOJO_whenQuantityPositive_shouldValidate()
	 * { RegularAmount regularAmount = new RegularAmount();
	 * regularAmount.setQuantity(10); Set<ConstraintViolation<regularAmount>>
	 * violations = validator.validateProperty(regularAmount, "quantity");
	 * assertThat(violations.size()).isEqualTo(0); }
	 */
}