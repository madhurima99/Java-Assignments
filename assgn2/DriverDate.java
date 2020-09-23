package assgn2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DriverDate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//first date
		System.out.println("Enter first date: ");
		System.out.printf("Enter day: ");
		int day1 = sc.nextInt();
		System.out.printf("Enter month: ");
		int month1 = sc.nextInt();
		System.out.printf("Enter year: ");
		int year1 = sc.nextInt();		
				
		//second date
		System.out.println("\nEnter Second date: ");
		System.out.printf("Enter day: ");
		int day2 = sc.nextInt();
		System.out.printf("Enter month: ");
		int month2 = sc.nextInt();
		System.out.printf("Enter year: ");
		int year2 = sc.nextInt();
		
		//Date object creation
		Date d1 = new Date(day1,month1,year1);
		Date d2 = new Date(day2,month2,year2);
		
		System.out.println("\nFirst Date object:" + d1.toString());
		System.out.println("Second Date object:" + d2.toString());
		
		//check if dates are equal
		if(d1.equals(d2))
			System.out.println("\nTwo dates are same.");
		else
			System.out.println("\nTwo dates are different.");
		
		//Difference calculation 
		System.out.println("Difference between First Date and second date: " + Date.getDifference(d1,d2) + " days");	
		
		//New date  to add/subtract days.
		System.out.println("\nEnter another date: ");
		System.out.printf("Enter day: ");
		int day3 = sc.nextInt();
		System.out.printf("Enter month: ");
		int month3 = sc.nextInt();
		System.out.printf("Enter year: ");
		int year3 = sc.nextInt();
		
		Date d3 = new Date(day3,month3,year3);
		System.out.println("\nCurrent Date object:" + d3.toString());
		
		System.out.printf("Enter no. days to add to current date: ");
		int n1 = sc.nextInt();
		d3.addDays(n1);
		
		System.out.printf("\nEnter no. days to subtract from current date: ");
		int n2 = sc.nextInt();
		d3.subtractDays(n2);
		
		sc.close();

	}

}

class Date{
	
	private int day;
	private int month;
	private int year;
	
	public Date() {
		day = 1;
		month = 1;
		year = 1800;
	}
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(Date other) {
		day = other.day;
		month = other.month;
		year = other.year;
	}
	
	//setter methods
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
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
	
	//difference between two dates
	public static long getDifference(Date first, Date second) {
	   
		LocalDate dateBefore = LocalDate.of(first.getYear(),first.getMonth(),first.getDay());
        LocalDate dateAfter = LocalDate.of(second.getYear(),second.getMonth(),second.getDay());
	    long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	    return Math.abs(noOfDaysBetween);
	}
	
	//date after adding dates
	public void addDays(int n) {
		LocalDate cDate = LocalDate.of(this.getYear(), this.getMonth(), this.getDay());
		cDate = cDate.plusDays(n);
		System.out.println("Date after " + n + " days: "+ cDate);
	}
	
	//date before subtracting days
	public void subtractDays(int n) {
		LocalDate cDate = LocalDate.of(this.getYear(), this.getMonth(), this.getDay());
		cDate = cDate.minusDays(n);
		System.out.println("Date before " + n + " days:"+ cDate);
	}
	
	//check two dates are equal or not
	@Override
	public boolean equals(Object obj) {
		Date other = (Date) obj;
		if(this.getDay()==other.getDay() && this.getMonth()==other.getMonth() && this.getYear()== other.getYear())
		            return true;
		else
			return false;
	}	
	
	//return object
	@Override
	public String toString(){ 
		return year + "-" + month + "-" + day ;
	} 
	
	
	
}