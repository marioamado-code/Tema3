package boletin2colecciones;

import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {
		//creamos la frase y la pasamos a mayusculas
		String frase = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		frase = frase.toUpperCase();
		//creamos el contador
		int co = 0;
		//creamos el mapa donde almacenar la clave valor
		TreeMap<Character, Integer> frecuencia = new TreeMap<>();
		//clave iniciada en a mayuscula
		char caracter = 65;
		//mientras sea menor que z se obvia la ñ porque no esta en el texto
		while (caracter < 91) {
			//contador se reinicia
			co = 0;
			//recorremos la frase por cada letra
			for (int i = 0; i < frase.length(); i++) {
				//si es igual se suma el contador
				if (frase.charAt(i) == caracter) {
					co++;
				}
				
			
			}
			//añadimos el par
			frecuencia.put(caracter, co);
			caracter++;
		}
		//la imprimimos
		System.out.println(frecuencia);
	}

}
