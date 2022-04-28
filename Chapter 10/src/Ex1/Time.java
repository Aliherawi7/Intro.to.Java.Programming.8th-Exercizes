package Ex1;

public class Time {
	long hour ;
	long minute;
	long second;
	
	public Time() {
		this(0);
	}
	public Time(long elapsedTime) {
		long millis = System.currentTimeMillis()-elapsedTime;
		second = millis /1000;
		minute = second /60;
		second = second % 60;
		hour = minute /60;
		minute = minute % 60;
		hour = hour %24;	
	}
	public Time(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	public long getSecond() {
		return second;
	}
	public long getMinute() {
		return minute;
	}
	public long getHour() {
		return hour;
	}
	public void setTime(long elapsedTime) {
		long millis =elapsedTime;
		second = millis /1000;
		minute = second /60;
		second = second % 60;
		hour = minute /60;
		minute = minute % 60;
		hour = hour %24;
	}
	
	
	
}
