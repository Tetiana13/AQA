import java.util.Scanner;

// Нахождения миммума и максимума
public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("Inserted array elements:");


        System.out.println("Even numbers: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]); // Выводим на экран, полученный массив
            }
        }
        System.out.println("Odd numbser: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");

            }
        }
    }
}
