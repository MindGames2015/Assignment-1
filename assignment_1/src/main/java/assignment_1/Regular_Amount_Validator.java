package assignment_1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Regular_Amount_Validator {
	public static void main(String[] args) {
		BigDecimal oneHundred, oneWeek, twoWeek, four_week, month, quarter, year, wholeWeekAmount, wholeTwoWeekAmount,
				wholeFourWeekAmount, wholeMonthAmount, wholeQuarterAmount, wholeYearAmount, regularAmount, size, index;

		// Used as multiplicator for whole pennies
		oneHundred = new BigDecimal("100");
		
		// Mathcontext
		 MathContext mc1;

		BigDecimal WEEK = new BigDecimal(1);
		BigDecimal TWO_WEEK = new BigDecimal(2);
		BigDecimal FOUR_WEEK = new BigDecimal(4);
		BigDecimal MONTH = new BigDecimal(3);
		BigDecimal QUARTER = new BigDecimal(13);
		BigDecimal YEAR = new BigDecimal(52);
		
		MathContext mc = new MathContext(3,RoundingMode.HALF_UP);

		// Example #1 - One Week
		// Take amount as pounds and pence, separated by period
		oneWeek = new BigDecimal("80.00");

		// Convert pounds and pence to whole pennies
		wholeWeekAmount = oneWeek.multiply(oneHundred);
		System.out.println("----------------------------------------------------------");
		System.out.println("Week");
		System.out.println("Whole amount in pennies for one week amount " + wholeWeekAmount);

		// Divide wholeAmount by multiple(s) of weeks
		regularAmount = wholeWeekAmount.divide(WEEK);
		System.out.println("Whole amount in pennies divided by week(s) = " + regularAmount);

		// --------------------------------------------------------------

		// Example #2 - Two Week
		// Take amount as pounds and pence, separated by period
		twoWeek = new BigDecimal("180.00");

		// Convert pounds and pence to whole pennies
		wholeTwoWeekAmount = twoWeek.multiply(oneHundred);
		System.out.println("----------------------------------------------------------");
		System.out.println("Two Week");
		System.out.println("Whole amount in pennies for 2 weeks(s) " + wholeTwoWeekAmount);

		// Divide wholeWeekAmount by multiple(s) of weeks
		regularAmount = wholeTwoWeekAmount.divide(TWO_WEEK);
		System.out.println("Whole amount in pennies divided by week = " + regularAmount);

		// ------------------------------------------------------------------------------

		// Example #3 - Four Week
		// Take amount as pounds and pence, separated by period
		four_week = new BigDecimal("300.00");

		// Convert pounds and pence to whole pennies
		wholeFourWeekAmount = four_week.multiply(oneHundred);
		System.out.println("----------------------------------------------------------");
		System.out.println("Four Week");
		System.out.println("Whole amount in pennies for 4 weeks(s) " + wholeFourWeekAmount);

		// Divide wholeWeekAmount by multiple(s) of weeks
		regularAmount = wholeFourWeekAmount.divide(FOUR_WEEK);
		System.out.println("Whole amount in pennies divided by week(s) = " + regularAmount);

		// Example #4 - Month
		// Take amount as pounds and pence, separated by period
		month = new BigDecimal("556.21");

		// Convert pounds and pence to whole pennies
		wholeMonthAmount = month.multiply(oneHundred);
		System.out.println("----------------------------------------------------------");
		System.out.println("Month");
		System.out.println("Whole amount in pennies for month " + wholeMonthAmount);
		
		 //System.out.println((wholeMonthAmount, mc(2, RoundingMode.HALF_UP)));
		 //System.out.println(new BigDecimal("354.765", new MathContext(3, RoundingMode.HALF_UP)));

		// Divide wholeWeekAmount by multiple(s) of weeks
		regularAmount = wholeMonthAmount.divide((MONTH), mc);
		System.out.println("Whole amount in pennies divided by week(s) = " + regularAmount);

		// Example #5 - Quarter
		// Take amount as pounds and pence, separated by period
		quarter = new BigDecimal("556.21");

		// Convert pounds and pence to whole pennies
		wholeQuarterAmount = quarter.multiply(oneHundred);
		System.out.println("----------------------------------------------------------");
		System.out.println("Month");
		System.out.println("Whole amount in pennies divided month " + wholeQuarterAmount);

		// Divide wholeWeekAmount by multiple(s) of weeks
		regularAmount = wholeQuarterAmount.divide(QUARTER);
		System.out.println("Whole amount in pennies divided by week(s) = " + regularAmount);

		// Example #6 - Year
		// Take amount as pounds and pence, separated by period
		year = new BigDecimal("245.00");

		// Convert pounds and pence to whole pennies
		wholeYearAmount = year.multiply(oneHundred);
		System.out.println("----------------------------------------------------------");
		System.out.println("Month");
		System.out.println("Whole amount in pennies for year " + wholeYearAmount);

		// Divide wholeWeekAmount by multiple(s) of weeks
		regularAmount = wholeYearAmount.divide(YEAR);
		System.out.println("Whole amount in pennies divided by week(s) = " + regularAmount);


	}
}
