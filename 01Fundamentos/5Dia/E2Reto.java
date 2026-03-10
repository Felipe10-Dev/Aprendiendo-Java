
import java.util.Scanner;

public class E2Reto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // instanciamos La Clase Scanner

        // Solicitamos El Numero
        System.out.print("Digita Un Numero Entero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        // Imprimimos
        System.out.println("Numero Recibido = " + mostrarNumero(numero));

    }

    // Metodo Con Retorno
    public static int mostrarNumero(int numero) {

        return numero;

    }

}
