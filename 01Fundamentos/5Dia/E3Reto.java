
import java.util.Scanner; // Importamos El Paquete Util

public class E3Reto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Instanciamos La Clase Scanner

        // Solicitamos Informacion
        System.out.print("Ingresa Un Numero: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingresa Otro Numero: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        // Llamamos El Metodo
        System.out.println(numero1 + " + " + numero2 + " = " + suma(numero1, numero2));

    }

    // Metodos
    // Sumar
    public static int suma(int numero1, int numero2) {

        return numero1 + numero2;

    }
}
