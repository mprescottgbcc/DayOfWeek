public class DayOfWeek
{
	private int month, day, year;

	private static String months[] = {
		"", "January", "February","March","April", "May", "June",
		"July", "August", "September", "October", "November", "December"
	};
	
	private static String days[] = {
		
	}

	public DayOfWeek()
	{
		this(1,1,1);
	}
	
	public DayOfWeek(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	private int getJulian(int y, int m)
	{
		return (5+day+y+(y/4)+(31*m/12))%7;
	}
	
	private int getGregorian(int y, int m)
	{
		return (day+y+(y/4)-(y/100)+(y/400)+(31*m/12))%7;
	}
	
	public String getMonthName()
	{
		return months[month];
	}
	
	public String getDayName(int d)
	{
		return 
	}
}