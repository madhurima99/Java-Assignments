package assgn2;

import java.util.Scanner;

public class DriverDate2 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        
      //Check date validity 
  		System.out.println("\nEnter date: ");
  		System.out.printf("Enter day: ");
  		int day = sc.nextInt();
  		System.out.printf("Enter month: ");
  		int month = sc.nextInt();
  		System.out.printf("Enter year: ");
  		int year = sc.nextInt();
  	
  		Date2 d = new Date2(day,month,year);
  		System.out.println("\nCurrent Date object:" + d.toString());

		
		//first date
		System.out.println("Enter first date: ");
		System.out.printf("Enter day: ");
		int day1 = sc.nextInt();
		System.out.printf("Enter month: ");
		int month1 = sc.nextInt();
		System.out.printf("Enter year: ");
		int year1 = sc.nextInt();
		//Date object creation
		Date2 d1 = new Date2(day1,month1,year1);
				
		//second date
		System.out.println("\nEnter Second date: ");
		System.out.printf("Enter day: ");
		int day2 = sc.nextInt();
		System.out.printf("Enter month: ");
		int month2 = sc.nextInt();
		System.out.printf("Enter year: ");
		int year2 = sc.nextInt();
		
		//Date object creation		
		Date2 d2 = new Date2(day2,month2,year2);
	
		System.out.println("\nFirst Date object:" + d1.toString());
		System.out.println("Second Date object:" + d2.toString());
		
		//check if dates are equal
		if(d1.equals(d2))
			System.out.println("\nTwo dates are same.");
		else
			System.out.println("\nTwo dates are different.");
		
		//Difference calculation 
		System.out.println("Difference between First Date and second date: " + Date2.getDifference(d1,d2) + " days");	
		
		//New date  to add/subtract days.
		System.out.println("\nEnter another date: ");
		System.out.printf("Enter day: ");
		int day3 = sc.nextInt();
		System.out.printf("Enter month: ");
		int month3 = sc.nextInt();
		System.out.printf("Enter year: ");
		int year3 = sc.nextInt();
	
		Date2 d3 = new Date2(day3,month3,year3);
		System.out.println("\nCurrent Date object:" + d3.toString());
	
		System.out.printf("Enter no. days to add to current date: ");
		int n1 = sc.nextInt();
		d3.addDays(n1);
		System.out.println("\nCurrent Date object:" + d3.toString());
		
		System.out.printf("\nEnter no. days to subtract from current date: ");
		int n2 = sc.nextInt();
		d3.subtractDays(n2);
		System.out.println("\nCurrent Date object:" + d3.toString());
		
    	sc.close();

		
	}

}

class Date2{
	
	private int day;
	private int month;
	private int year;
	static int monthDays[] = {31, 28, 31, 30, 31, 30, 
            31, 31, 30, 31, 30, 31};
	
	public Date2() {
		day = 1;
		month = 1;
		year = 1800;
	}
	public Date2(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		if(!validDate()) {
			System.out.println("\n**Invalid date object. Resetting date...");
			resetDate();			
		}
			
	}
	public Date2(Date2 other) {
		day = other.day;
		month = other.month;
		year = other.year;
		
	}
	
	//setter methods
	public void setDay(int day) {
		this.day = day;
		if(!validDate()) {
			System.out.println("\n**Invalid date object. Resetting date...");
			resetDate();			
		}
	}
	public void setMonth(int month) {
		this.month = month;
		if(!validDate()) {
			System.out.println("\n**Invalid date object. Resetting date...");
			resetDate();			
		}
	}
	public void setYear(int year) {
		this.year = year;
		if(!validDate()) {
			System.out.println("\n**Invalid date object. Resetting date...");
			resetDate();			
		}
	}
	
	//getter method
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	//ResetDate
	private void resetDate() {
		this.day=1;
		this.month=1;
		this.year=1800;
	}
	
	//counting leap years from 00/00/0000 till given date
	static int countLeapYears(Date2 d)  
    { 
        int years = d.year; 
  
        if (d.month <= 2)  
        { 
            years--; 
        } 
  
        return years / 4 - years / 100 + years / 400; 
    } 
	
		
	//difference between two dates
	public static long getDifference(Date2 first, Date2 second) {
		
		//for first date
		int n1 = first.year * 365 + first.day; 
		  
        //adding current no. of days for all months before 
		//the month in the date of the given year.
        for (int i = 0; i < first.month - 1; i++)  
        { 
            n1 += monthDays[i]; 
        }   
         
        // Add a day for every leap year 
        n1 += countLeapYears(first); 
  
        // for second date
        int n2 = second.year * 365 + second.day; 
        for (int i = 0; i < second.month - 1; i++) 
        { 
            n2 += monthDays[i]; 
        } 
        n2 += countLeapYears(second); 
  
        //difference between two counts 
        return (n2 - n1); 
		
	}
	
	//date after adding dates
    public void addDays(int n) {
		
		for(int i=1;i<=n;i++)
		{
			if(this.day + 1 <= perMonthDays(this.month, this.year))
			{
				this.day += 1;
			}
			else {
				if(this.month<12)
				{
					this.month += 1;
					this.day = 1;
				}
				else {
					this.year += 1;
					this.month = 1;
					this.day = 1;
				}
			}
		}
		
	}
   //date before subtracting days
  	public void subtractDays(int n) {
  		for(int i=1;i<=n;i++)
  		{
  			if(this.day - 1 >= 1)
  			{
  				this.day -= 1;
  			}
  			else {
  				if(this.month>1)
  				{
  					this.month -= 1;
  					this.day = perMonthDays(this.month, this.year);
  				}
  				else {
  					this.year -= 1;
  					this.month = 12;
  					this.day = 31;
  				}
  			}
  		}
  	}
  	
	private static int perMonthDays(int month, int year)
	{
			if(isLeapYear(year) && month==2)
			  return monthDays[1]+1;
			
			else
				return monthDays[month-1];				
			
	}
	private static boolean isLeapYear(int year)
	{
		if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
		{
			return true;
		}
		return false;
	}	
	
	//Check for valid date
	public boolean validDate() {
		
		if(isLeapYear(this.year) && this.month==2 )
		{  
			if(this.day>=1 && this.day <= monthDays[1]+1)
					 return true;
			 
		}
		
		else 
		{
			if(this.month>=1 && this.month<=12) {
				if(this.day>=1 && this.day <= monthDays[this.month-1])
					return true;
				
			}
			
		}
		
		return false;
	}
	
	
	
	//check two dates are equal or not
	@Override
	public boolean equals(Object obj) {
		Date2 other = (Date2) obj;
		if(this.getDay()==other.getDay() && this.getMonth()==other.getMonth() && this.getYear()== other.getYear())
		            return true;
		else
			return false;
	}	
	
	//return object
	@Override
	public String toString(){ 
		return day + "-" + month + "-" + year ;
	} 
	
	
	
}
