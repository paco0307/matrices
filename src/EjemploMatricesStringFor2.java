/**
 * Clase ejemplo de matrices string simplificado
 * @author FJCD
 * @since 10/09/2024
 */
public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe", "Paco"},{"Papo", "Papa"},{"Pepa", "Papu"}};

        for (String[] fila : nombres) {
            for (String nombre : fila) {
                System.out.print(nombre + " \t");
            }
            System.out.println();
        }
    }
}
