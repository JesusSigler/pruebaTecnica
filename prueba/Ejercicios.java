package prueba;

public class Ejercicios {

	 public String calcularIMC(double peso, double altura) {
		 /*Con esta validacion nos aseguramos que el método no continúe si se introduce una altura o peso
		 igual o inferior a 0*/
	        if (peso <= 0 || altura <= 0) {
	        	throw new IllegalArgumentException("El Peso y la altura deben ser mayores que 0");
	        }
	        double imc = peso / (altura * altura);

	        if (imc <= 18.5) {
	            return "Infrapeso";
	        } else if (imc <= 25.0) {
	            return "Normal";
	        } else if (imc <= 30.0) {
	            return "Sobrepeso";
	        } else {
	            return "Obeso";
	        }
	    }
	 
	 public int sumaDigitosHastaN(int n) {
		 int sumaTotal = 0;
		 	//Recorremos todos los numeros desde 1 hasta n (ambos incluidos)
	        for (int i = 1; i <= n; i++) {
	        	//Guardamos el numero actual en una variable auxialiar
	            int numero = i;
	            //Con este bucle while descomponemos los numeros en digitos mientras sea mayor que 0
	            while (numero > 0) {
	            	//Con esto obtenemos el ultimo digito de cada numero y lo acumulamos para ir sumando
	                sumaTotal += numero % 10;
	                //en esta linea eliminamos el ultimo digito del numero con lo que se va sumando el resto de numeros
	                numero /= 10;
	            }
	        }
	        //Devolvemos el resultado final
	        return sumaTotal;
	    }
	 
	 public int[] moverCeros(int[] array) {
		// Índice para elementos sin ceros
		 int index = 0;
	        // Recorremos el array y movemos los elementos que no sea ceros al inicio
	        for (int num : array) {
	            if (num != 0) {
	            	// Colocamos los numeros que no son ceros al inicio del array
	                array[index++] = num;
	            }
	        }
	        // Rellenamos el resto del array con ceros
	        while (index < array.length) {
	            array[index++] = 0;
	        }
	        return array;
	 }
}
