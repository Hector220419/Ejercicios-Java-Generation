package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		System.out.println("Ingresa una cadena de 10 numeros separada por comas: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(",")));
		list.sort((p1, p2) -> p1.compareTo(p2));

		ArrayList<String> listNewValues  = new ArrayList<>();
		
		System.out.println("-------------------");
		
		// Confirmar que sean de tipo numero y el tamano del arreglo
		for(int i = 0; i < list.size(); i++) {
		      if(isNumeric(list.get(i)) && (list.size()<11)) {
		    	  System.out.println("pos [" + i + "]: " + list.get(i));
		    	  
		    	  if(isPrime(Integer.parseInt(list.get(i)))) {
		    		  listNewValues.add(list.get(i));
		    	  }
		      }
		      else {
		    	  System.out.println("Error en los numeros");
		    	  break;
		      }
		 }
		
		for(int i = 0; i < list.size(); i++) {
		      if(!isPrime(Integer.parseInt(list.get(i)))) {
		    	  listNewValues.add(list.get(i));
		      }
		 }
		
		System.out.println("-------------------");
		System.out.println("-ORDER VALUES-");
		for(int i = 0; i < listNewValues.size(); i++) {
			System.out.println("pos [" + i + "]: " + listNewValues.get(i));
		}
		
		scanner.close();
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException e) {
	        return false;
	    }
	    return true;
	}
	
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }    
	
}
