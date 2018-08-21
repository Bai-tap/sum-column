import java.util.Random;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int[][] array = getArray(getHeight(), getWidth());
        displayArray(array);

        System.out.println(getSumColumn(array));
    }

    private static int getSumColumn(int[][] array) {
        int sumColumn = 0;
        int columnGetted = getColumn();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == columnGetted) {
                    sumColumn += array[i][j];
                }
            }
        }
        return sumColumn;
    }

    private static int getColumn() {
        System.out.print("Enter what column you want to sum: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        return sc.nextInt();
    }
    private static int getWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        return sc.nextInt();
    }

    private static int[][] getArray(int height, int width) {
        int[][] array = new int[height][width];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(100) + 1;
            }
        }
        return array;
    }
}
