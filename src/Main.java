import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("lapiz", "pencil");
        diccionario.put("tortuga", "turtle");
        diccionario.put("gato", "cat");
        diccionario.put("fresa", "strawberry");
        diccionario.put("azul", "blue");
        diccionario.put("mama", "mom");
        diccionario.put("papa", "dad");
        diccionario.put("hermano", "brother");
        diccionario.put("hermana", "sister");
        diccionario.put("comer", "eat");
        diccionario.put("amar", "love");
        diccionario.put("blanco", "white");
        diccionario.put("amarillo", "yellow");
        diccionario.put("dos", "two");
        diccionario.put("siete", "seven");
        diccionario.put("diez", "ten");
        diccionario.put("cama", "bed");
        diccionario.put("puerta", "door");
        diccionario.put("espejo", "mirror");
        diccionario.put("encontrar", "find");

        // Escoger al azar 5 palabras en español
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];

        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspanol[random.nextInt(palabrasEspanol.length)];
        }

        // Pedir al usuario que teclee la traducción al inglés de cada palabra
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traduce '" + palabra + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine().toLowerCase();

            // Comprobar si la respuesta es correcta
            if (respuestaUsuario.equals(diccionario.get(palabra))) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }

        // Respuestas correctas e incorrectas
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
