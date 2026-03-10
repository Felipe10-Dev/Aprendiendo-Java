
import java.util.Scanner; // Importamos El Paquete Util

public class E4Reto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Instanciamos La Clase Scanner

        // Solicitamos Informacion
        System.out.print("Digita Un Numero Entero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        // Llamamos El Metodo
        System.out.println(numero + " -> " + esPar(numero));
    }

    // Metodos
    // Valida Si Un Numero Es Par
    public static String esPar(int numero) {

        String mensaje = "";

        // Validamos Si El Numero Proporcionado Es Par O Impar
        if (numero % 2 == 0) {

            mensaje = "Es Par";

        } else {

            mensaje = "Es Impar";

        }

        return mensaje;

    }

}
