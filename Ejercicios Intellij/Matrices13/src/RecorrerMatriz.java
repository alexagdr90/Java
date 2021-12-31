public class RecorrerMatriz{
    public static void main(String[] args) {
        int[][] matriz = { { 11, 1232, 386, 432 }, { 47, 454, 254, 353 } };

        int mayor = matriz[0][0], menor = matriz[0][0];

        // Recorremos la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                int numeroActual = matriz[x][y];
                if (numeroActual > mayor)
                    mayor = numeroActual;
                if (numeroActual < menor)
                    menor = numeroActual;
            }
        }

        System.out.printf("El mayor es %d y el menor es %d", mayor, menor);
    }
}
