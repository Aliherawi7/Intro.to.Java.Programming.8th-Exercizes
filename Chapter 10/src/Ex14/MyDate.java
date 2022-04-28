package Ex14;

public class MyDate {
	long year, month, day;
	public MyDate() {
		this(0);
	}
	
	public MyDate(long elapsedTime) {
		long millis , seconds, minutes, hours, pYear,  allDays;
		millis = System.currentTimeMillis()-elapsedTime;
		seconds = millis / 1000;
		minutes = seconds / 60;
		hours = minutes / 60;
		
		allDays = hours / 24;
		pYear = allDays / 365;
		pYear += 1970;
		int sumDays = 0;
		int currentDay = 0;
		int currentYear =1970;
		for(int i = currentYear; i<= pYear-1 ; currentYear++, i++) {
			if(isLeapYear(i)) 
				sumDays += 366;
			else
				sumDays += 365;
		}
		currentDay = (int) allDays - sumDays;
		int[] Months = new int[12];
		int currentMonth =0;
		for(int i=1; i<=12; i++) {
			if(i == 1 || i == 3 ||i == 5 || i == 7 || i == 8 || i == 10 ||i == 12 ) {
				if(currentDay > 31) {
					Months[i-1] = 31;
					currentDay -=31;
				}else {
					currentMonth = i;
					break;
				}
				
			}else if(i == 4 || i == 6 ||i == 9 || i == 11 ) {
				if(currentDay > 30) {
					Months[i-1] = 30;
					currentDay -=30;
				}else {
					currentMonth = i;
					break;
				}
			}else if(i == 2) {
				if(currentDay > 28) {
					Months[i-1] = 30;
					currentDay -=28;
				}else {
					currentMonth = i;
					break;
				}
					
			}
		}
		this.year = currentYear;
		this.month = currentMonth;
		this.day = currentDay;
		currentDay += 1;
		year = currentYear;
		month = currentMonth;
		day = currentDay;	
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(long elapsedTime) {
		long millis , seconds, minutes, hours, pYear,  allDays;
		millis = System.currentTimeMillis()-elapsedTime;
		seconds = millis / 1000;
		minutes = seconds / 60;
		hours = minutes / 60;
		
		allDays = hours / 24;
		pYear = allDays / 365;
		pYear += 1970;
		int sumDays = 0;
		int currentDay = 0;
		int currentYear =1970;
		for(int i = currentYear; i<= pYear-1 ; currentYear++, i++) {
			if(isLeapYear(i)) 
				sumDays += 366;
			else
				sumDays += 365;
		}
		currentDay = (int) allDays - sumDays;
		int[] Months = new int[12];
		int currentMonth =0;
		for(int i=1; i<=12; i++) {
			if(i == 1 || i == 3 ||i == 5 || i == 7 || i == 8 || i == 10 ||i == 12 ) {
				if(currentDay > 31) {
					Months[i-1] = 31;
					currentDay -=31;
				}else {
					currentMonth = i;
					break;
				}
				
			}else if(i == 4 || i == 6 ||i == 9 || i == 11 ) {
				if(currentDay > 30) {
					Months[i-1] = 30;
					currentDay -=30;
				}else {
					currentMonth = i;
					break;
				}
			}else if(i == 2) {
				if(currentDay > 28) {
					Months[i-1] = 30;
					currentDay -=28;
				}else {
					currentMonth = i;
					break;
				}
					
			}
		}
		this.year = currentYear;
		this.month = currentMonth;
		this.day = currentDay;
		currentDay += 1;
		year = currentYear;
		month = currentMonth;
		day = currentDay;
	}
	
	
	public long getYear() {
		return year;
	}


	public long getMonth() {
		return month;
	}


	public long getDay() {
		return day;
	}

	public boolean isLeapYear(int year) {
		return year % 400 ==0 || (year % 4 ==0 && year % 100 != 0);
	}
}
