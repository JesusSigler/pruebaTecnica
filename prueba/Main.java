package prueba;

public class Main {

    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        //Ejercicio 1
        double peso = 70;
        double altura = 1.75;
        
        String resultado = ejercicios.calcularIMC(peso, altura);
        System.out.println("Tu clasificación de IMC es: " + resultado);
        //Ejercicio 2
        int n = 10;
        System.out.println("Suma de dígitos hasta " + n + " = " + ejercicios.sumaDigitosHastaN(n));
        
        //Ejercicio 3
        int[] input = {0, 1, 0, 3, 12};
        int[] result = ejercicios.moverCeros(input);

        // Mostramos el resultado
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
