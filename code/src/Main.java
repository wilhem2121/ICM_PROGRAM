import java.util.Scanner;

/**
 * La clase Main es la clase ejecutable que solicita al usuario el peso y la altura,
 * crea un objeto Persona y muestra el mensaje personalizado según el IMC calculado.
 */
public class Main {
    
    /**
     * El método principal que se ejecuta al iniciar el programa.
     * Solicita el peso y la altura al usuario, luego calcula y muestra el mensaje con base en el IMC.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el peso y la altura
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Crear el objeto Persona
        Persona persona = new Persona(peso, altura);

        // Calcular IMC y mostrar mensaje
        System.out.println(persona.obtenerMensajeIMC());

        // Cerrar el scanner
        scanner.close();
    }
}
