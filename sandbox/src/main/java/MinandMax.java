import java.util.Scanner;

// Нахождения миммума и максимума
public class MinandMax {
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

        System.out.print("Max  и Min номера: ");
        int max = array[0];
        for (int i = 0; i < size; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println(max);

        int min = array[0];
        for (int i = 0; i < size; i++) {

            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
