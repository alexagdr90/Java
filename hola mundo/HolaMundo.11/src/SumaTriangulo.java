public class SumaTriangulo {

    public static int array[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    public static int rowSumOddNumbers(int n) {
        int firstIndex = 0;
        for (int i = 1; i < n; i++) {
            firstIndex += i;
        }
        int total = 0;
        for (int i = firstIndex; i < firstIndex + n; i++) {
            total += array[i];
        }
        return total;
    }

    public static void main(String[] args) {
        SumaTriangulo RowSumOddNumbers = new SumaTriangulo();
        System.out.println(RowSumOddNumbers.rowSumOddNumbers(3)); //27
        System.out.println(RowSumOddNumbers.rowSumOddNumbers(1)); //1
        System.out.println(RowSumOddNumbers.rowSumOddNumbers(2)); //8
    }
}
