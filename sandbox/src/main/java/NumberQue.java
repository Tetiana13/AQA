import java.util.Scanner;

public class NumberQue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i : array) {
            System.out.println(i);
        }
        for (int i : array) {
        System.out.print( i + " ");
        }
    }
}
