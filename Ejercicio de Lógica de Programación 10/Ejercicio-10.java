package exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<>();
		Map<String, String> dictionaryRandom = new HashMap<>();
		
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
		
		// Random
		// Obtener las claves del HashMap y convertirlas a un arreglo
	    Object[] keys = dictionary.keySet().toArray();
	    String[] trad = new String[5];
	    int contador = 0;
	    
	    for(int i = 0; i < 5; i++) {
		    // Generar un índice aleatorio
		    Random random = new Random();
		    int randomIndex = random.nextInt(keys.length);
		    
		    // Obtener la clave aleatoria y el valor correspondiente del HashMap
		    String randomKey = (String) keys[randomIndex];
		    String randomValue = dictionary.get(randomKey);
		    
		    dictionaryRandom.put(randomKey, randomValue);
		    
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Palabra: " + randomKey);
		    System.out.print("Inserte traduccion: ");
		    trad[i] = scanner.nextLine();
		    
		    if(trad[i].equals(randomValue)) {
		    	contador ++;
		    }
	    }
	    	System.out.println("----------------------");
	    	System.out.println("Palabras correctas: " + contador + 
	    			"\nPalabras incorrectas: " + (5-contador));
	}
}