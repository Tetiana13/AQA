import java.util.Scanner;

public class NumSumAndProd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int sum = 0;
        int prz = 1;

        for (int i = 0; i <size ; i++) {

            sum = sum + array[i];
           array[i] = array[i];
        }
        System.out.println("Cумма введённых чисел: " + sum);

        for (int i = 0; i < size ; i++) {

            prz *= array[i];
            array[i] = array[i];
        }
        System.out.println("Произведение введённых чисел: "+ prz);
    }
}