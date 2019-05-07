import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column: ");
        int columns = sc.nextInt();
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        int[][] matrix = new int[rows][columns];
//        Nhập các phần tử của mảng
//        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = sc.nextInt();
//            }
//        }
//        Mảng random
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                }
            }
        }
        System.out.println("Max of matrix is: " + max);
    }
}
