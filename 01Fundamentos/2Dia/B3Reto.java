
public class B3Reto {

    public static void main(String[] args) {

        // Definimos Las Variables
        int nota = -90;

        // Por Medio De Una Estructura De Control Validaos En Que Rango De Desempeño Esta La Nota
        if (nota >= 90 && nota <= 100) {

            System.out.println("Excelente");

        } else if (nota >= 70 && nota <= 89) {

            System.out.println("Aprobado");

        } else if (nota >= 0 && nota < 70) {

            System.out.println("Reprobado");

        } else {

            System.out.println("Nota Invalida");

        }
    }

}
