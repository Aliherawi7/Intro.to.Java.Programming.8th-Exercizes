package Ex6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PrintClass {
	
	public static String printMonth(int year, int month) {
	
		return printMonthTitle(year,month)+"\n"+printMonthTitle(year, month);
		//Print the body of the calendar
		
		
	}
	/** Print the month title, e.g., May, 1999 */
	public static String printMonthTitle(int year,int month) {
		String monthNameM = ""+getMonthName(month)+" "+year+"\n";
		String underLine="----------------------------------------------------------";
		return monthNameM+underLine+"\nSun  Mon  Tue  Wed  Thu  Fri  Sat \n";		
	} 
	/** Get the English name for the month */
	public static String getMonthName(int month) {
		String monthName ="";
		switch (month) {
		case 1: monthName = "January";break;
		case 2: monthName = "February";break;
		case 3: monthName = "March";break;
		case 4: monthName = "April";break;
		case 5: monthName = "May";break;
		case 6: monthName = "June";break;
		case 7: monthName = "July";break;
		case 8: monthName ="August";break;
		case 9: monthName = "September";break;
		case 10: monthName = "October";break;
		case 11: monthName = "November";break;
		case 12: monthName = "December";
		} 
		return monthName;
	
		}
	public static String printMonthBody(int year, int month) {
		//Get start day of week
		int startDay = getStartDay(year,month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);
		//pad space before the first day of the month
		String DaysInMonth="";
		int i = 0;
		for(i =0; i <= startDay; i++) 
			DaysInMonth +="      ";
		
		for(i = 1; i <= numberOfDaysInMonth; i++) {
			if(i<10) {
				DaysInMonth +=i+"       ";
			}else {
				DaysInMonth +=i+"     ";
			}
				
			if((i+startDay)%7==0) {
				
				DaysInMonth +="\n";
			}
			
		}
	
		return DaysInMonth;
	}
	//Get the  start day of month/1/year
	public static int getStartDay(int year,int month) {
		final int START_DAY_FOR_JAN_1_1800 = 4;
		//GET TOTAL NUMBER OF DAYS FROM 1/1/1800 TO MONTH/1/YEAR
		int totalNumberOfDays = getTotalNumberOfDays(year,month);
		//return the start day for month/1/year 
		return ((totalNumberOfDays +START_DAY_FOR_JAN_1_1800)%7)-1;
	}
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		for(int i = 1800; i<year; i++) {
			if (isLeapYear(i))
				total =total+366;
			else
				total = total+365;
			
		}
		//add days from jan to the month prior to the calendar month
		for (int i = 1; i<month; i++)
			total = total + getNumberOfDaysInMonth(year,i);
		return total;
	}
	// get the number of days in month
	public static int getNumberOfDaysInMonth(int year, int month) {
	if(month ==1 || month == 3 || month == 5 || month == 7 ||
			month == 8 || month == 10 || month == 12)
		return 31;
	if(month ==4 || month ==6 || month ==9 || month ==11 )
		return 30;
	if(month == 2) return isLeapYear(year) ? 29:28;
	
	return 0; // if month is incorrect
	}
	// Determine if it is a leap year
	public static boolean isLeapYear(int year) {
		return year%400==0 ||(year%4==0 && year%100 !=0);
	}
	
	
	
}
