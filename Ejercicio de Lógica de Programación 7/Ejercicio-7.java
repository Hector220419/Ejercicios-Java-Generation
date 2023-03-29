package exercises;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exersices7 {

	public static void main(String[] args){
		
		Calendar calendar = Calendar.getInstance();
		Calendar calendarFriday = Calendar.getInstance();
		
		calendarFriday.set(2022, 12, 9, 15, 0);
		
		System.out.print("Ingresa el dia: ");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.nextLine().toLowerCase();
		System.out.print("Ingresa la hora: ");
		int hour = scanner.nextInt();
		System.out.print("Ingresa el minuto: ");
		int min = scanner.nextInt();
		
		if(day.equals("lunes")) {
			calendar.set(2022, 12, 5, hour, min);
		}
		else if(day.equals("martes")) {
			calendar.set(2022, 12, 6, hour, min);
		}
		else if(day.equals("miercoles")) {
			calendar.set(2022, 12, 7, hour, min);
		}
		else if(day.equals("jueves")) {
			calendar.set(2022, 12, 8, hour, min);
		}
		else if(day.equals("viernes") && hour<15) {
			calendar.set(2022, 12, 9, hour, min);
		}
		else if(day.equals("viernes") && hour>=15){
			System.out.println("El fin de semana ya ha comenzado");
			System.exit(0);
		}
		else {
			System.out.println("Opcion no valida");
			System.exit(0);
		}
		
		Date date = calendar.getTime();
		Date dateFriday = calendarFriday.getTime();
		long difMil = Math.abs(dateFriday.getTime() - date.getTime());
		
		System.out.println("Faltan " + (difMil/60000) + " minutos para el fin de semana");
	}
	
}
