package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<>();
		
		dictionary.put("gato", "cat");
		dictionary.put("dar", "give");
		dictionary.put("querer", "want");
		dictionary.put("nuevo", "new");
		dictionary.put("bien", "well");
		dictionary.put("trabajar", "work");
		dictionary.put("pensar", "think");
		dictionary.put("venir/llegar", "come");
		dictionary.put("ahora", "now");
		dictionary.put("viejo", "old");
		dictionary.put("anio", "year");
		dictionary.put("gente", "people");
		dictionary.put("tomar", "take");
		dictionary.put("tiempo", "time");
		dictionary.put("hacer", "make");
		dictionary.put("decir", "say");
		dictionary.put("tener", "have");
		dictionary.put("jugar", "play");
		dictionary.put("pie", "foot");
		dictionary.put("boca", "mouth");
		
		// Traer la direccion de Alexis
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una palabra a traducir: ");
		String search = scanner.nextLine();
		
		if(dictionary.containsKey(search)) {
			System.out.println("Traduccion: " + dictionary.get(search));
		}
		else {
			System.out.println("La palabra no se encuentra en el diccionario");
		}
		scanner.close();
	}
}