import java.util.Scanner;

public class RevertNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Aргументы командной строки в обратном порядке: ");
        for( int i = size - 1 ; i >= 0 ; i--) {
            System.out.print( array[i] + " ");
        }
    }
}


