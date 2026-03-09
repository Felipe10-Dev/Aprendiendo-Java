
public class D3Reto {

    public static void main(String[] args) {

        // Variable Que Lleva La Suma Acomulada
        int suma = 0;

        // Creamos E Proporcionamos Valores Al Array
        int[] numeros = {2, 4, 6, 8, 10};

        // Recorremos Y Calculamos La Suma De Todo El Array
        for (int i = 0; i < numeros.length; i++) {

            // Suma Y Asignacion
            suma += numeros[i];

        }

        // Imprimimos La Suma Total
        System.out.println("Suma Total = " + suma);
    }

}
