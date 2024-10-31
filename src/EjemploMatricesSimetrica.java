/**
 * Clase ejemplo de matriz Simetrica
 * @author FJCD
 * @since 31/10/2024
 */
public class EjemploMatricesSimetrica {
    public static void main(String[] args) {
        boolean simetrica = true;

        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 2, 1, 0, 5 },
                { 3, 0, 1, 6 },
                { 4, 5, 6, 7 }
        };

        salir: for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}
