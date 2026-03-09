
public class D5Reto {

    public static void main(String[] args) {

        int promedio = 0;
        int sumaNotas = 0;

        // Creamos E Inicializamos El Array
        int[] notas = {10, 20, 30, 40, 50};

        // Recorremos Nuestro Array Y Calculamos Las Notas 
        for (int i = 0; i < notas.length; i++) {

            // Sumamos Todas Las Notas
            sumaNotas += notas[i];

        }

        // Calculamos E Imprimimos EL Promedio
        promedio = sumaNotas / notas.length;

        System.out.println("Promedio = " + promedio);

    }

}
