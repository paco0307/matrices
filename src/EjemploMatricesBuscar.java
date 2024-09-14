/**
 * Clase ejemplo de matrices enteros
 * @author FJCD
 * @since 14/09/2024
 */
public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
            {35, 85, 3 , 5992},
            {5, 45852, 254 , 48},
            {35, 5448, 13 , 356, 1438}
        };

        int elementoBuscar = 13;
        boolean encontrado = false;
        int i;
        int j = 0;
        
        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado) {
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas: " + i + "," + j);
        } else {
            System.out.println("No se encontro en la matriz!");
        }
    }
}
