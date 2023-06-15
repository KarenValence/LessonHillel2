
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Введите М & N");
        int[][] array = {
                {scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt()},
        };
        System.out.println("Mатрица 1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("Mатрица 2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();



            }
    }
}

            
