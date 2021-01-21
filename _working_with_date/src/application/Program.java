package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat myHours = new SimpleDateFormat("HH:mm:ss");

		// Setando o Horário para GMT
		sdf2.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));

		Date d1 = myDate.parse("17/01/2021");
		Date d2 = myHours.parse("18:56:00");
		Date d3 = sdf1.parse("17/01/2021 18:56:00");

		// 1 segundo == 1000L ms
		// Então: 1000 x 60 x 60 x 3 = 3H
		Date d4 = new Date(1000L * 60L * 60L * 3L);

		// Formato ISO 8601 --> "2021-01-19T08:25:01Z"
		Instant d5 = Instant.now();
		Date d6 = Date.from(d5);

		Date d7 = Date.from(Instant.parse("2021-01-19T08:25:01Z"));
		
		

		System.out.println("Date: " + myDate.format(d1));
		System.out.println("Time: " + myHours.format(d2));

		System.out.println("-------------------------------------");

		System.out.println("Date: " + sdf1.format(d3));
		System.out.println("Date sem formatação: " + d3);

		System.out.println("-------------------------------------");

		System.out.println("Date: " + sdf1.format(d4));

		System.out.println("-------------------------------------");

		System.out.println("Padrão ISO 8601: " + d5);
		System.out.println("Padrão Horário GMT: " + sdf2.format(d6));
		System.out.println("Padrão Horário GMT: " + sdf2.format(d7));
		
		
		Date d8 = new Date(System.currentTimeMillis());
		
		System.out.println("-------------------------------------");
		System.out.println("Padrão Horário GMT-3: " + sdf2.format(d8));
		
		
		
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d8);
		
		cal.add(Calendar.HOUR, 3);
		
		d8 = cal.getTime();
		
		System.out.println("Padrão Horário GMT+3: " + sdf2.format(d8));
		
		
		System.out.println("-------------------------------------");
		
		
		int minutes  = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("MINUTES: " + minutes);
		System.out.println("MONTH: " + month);
		
		System.out.println("-------------------------------------");
		
		
		

	}

}
