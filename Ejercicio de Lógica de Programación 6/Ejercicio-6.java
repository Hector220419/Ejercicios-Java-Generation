package exercises;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		revCh();
	}
	
	public static void revCh() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una cadena: ");
		String cadena = scanner.nextLine();
		
		String[] cadenaArray = cadena.split("");
		String[] cadenaReverse = cadena.split("");
		for(int i = 0; i < cadenaArray.length; i++) {
			cadenaReverse[i] = cadenaArray[cadenaArray.length - i -1];
			System.out.print(cadenaReverse[i]);
		}
		scanner.close();
	}

}
