public class NumeroAleatorio {
    public static void main(String[] args) {
        int array[] = new int[10];// sin decimales => int; con double
        System.out.println("Numeros aleatorios entre 1 y 100; ");
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100);// sin decimales => int; con double
            System.out.println(array[i]);
        }
    }
}
