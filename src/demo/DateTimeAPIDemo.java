package demo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPIDemo {
	public static void main(String[] args) {
		DateTimeAPIDemo demoObj = new DateTimeAPIDemo();
		demoObj.demoZonedDateTime();
	}

	public void demoClock() {
		final Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
	}

	public void demoLocalDateTime() {
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now(Clock.systemUTC()));
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.now(Clock.systemUTC()));
	}
	
	public void demoZonedDateTime() {
		final ZonedDateTime zonedDatetime = ZonedDateTime.now();
		final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now( Clock.systemUTC() );
		final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now( ZoneId.of( "Asia/Singapore" ) );
		System.out.println( zonedDatetime );
		System.out.println( zonedDatetimeFromClock );
		System.out.println( zonedDatetimeFromZone );
	}
}
