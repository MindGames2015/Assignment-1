package assignment_1;


public enum Frequency
{
    WEEK(1),
    TWO_WEEK(2),
    FOUR_WEEK(4),
	MONTH(3),
	QUARTER(13),
	YEAR(52);
   
    private final int weeks;
    private Frequency(int weeks) 
	{
        this.weeks = weeks;
    }
    
   public final int getWeeks()
   {
	   return weeks;
   }
   
}