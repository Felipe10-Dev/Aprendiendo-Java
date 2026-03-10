
import java.util.Scanner;

public class E5Reto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Instanciamos La Clase Scanner

        // Solicitamos Informacion
        System.out.print("Digita La Nota1: ");
        int nota1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digita La Nota2: ");
        int nota2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digita La Nota3: ");
        int nota3 = Integer.parseInt(scanner.nextLine());

        // Llamamos El Metodo
        System.out.println("Promedio = " + obtenerPromedio(nota1, nota2, nota3));

    }

    // Metodos
    // Metodo Para Obtener El Promedio De Las Tres Notas
    public static int obtenerPromedio(int nota1, int nota2, int nota3) {

        // Suma De Todas Las Notas
        int sumaNotas = nota1 + nota2 + nota3;

        // Dividimos La Suma Por La Cantidad De Notas
        int promedio = sumaNotas / 3;

        // Obtenemos El Promedio
        return promedio;

    }
}
