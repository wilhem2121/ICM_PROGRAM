/**
 * La clase Persona contiene la información de una persona, incluyendo su peso y altura,
 * y proporciona métodos para calcular su índice de masa corporal (IMC) y devolver un mensaje 
 * personalizado basado en el valor de dicho IMC.
 */
public class Persona {
    
    private double peso;  // Peso en kilogramos
    private double altura;  // Altura en metros

    /**
     * Constructor que inicializa los atributos peso y altura.
     * 
     * @param peso El peso de la persona en kilogramos.
     * @param altura La altura de la persona en metros.
     */
    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Calcula el índice de masa corporal (IMC) de la persona usando la fórmula:
     * IMC = peso / (altura * altura)
     * 
     * @return El valor del índice de masa corporal calculado.
     */
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    /**
     * Devuelve un mensaje personalizado basado en el valor del IMC calculado.
     * 
     * @return Un mensaje indicando el estado de la persona según su IMC.
     */
    public String obtenerMensajeIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Tu IMC es " + String.format("%.1f", imc) + ". Estás por debajo del peso normal. ¡Consulta con un médico!";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Tu IMC es " + String.format("%.1f", imc) + ". Tienes un peso saludable. ¡Buen trabajo!";
        } else {
            return "Tu IMC es " + String.format("%.1f", imc) + ". Tienes sobrepeso. ¡Cuida tu salud!";
        }
    }
}
