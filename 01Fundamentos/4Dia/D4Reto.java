
public class D4Reto {

    public static void main(String[] args) {

        int numeroMayor = 0;

        // Creamos E Inicializamos El Array
        int[] numeros = {3, 7, 2, 9, 5};

        // Recorremos El Array Y Identificamos El  Numero Mayor De Todo Nuestro Array
        for (int i = 0; i < numeros.length; i++) {

            // Validamos Si Mientras Recorremos El Array Hay Un Numero Mayor Que El Que Tenemos Pa
            if (numeros[i] > numeroMayor) {

                numeroMayor = numeros[i];
            }
        }

        // Imprimimos El Numero Mayor
        System.out.println("Numero Mayor = " + numeroMayor);

    }

}
