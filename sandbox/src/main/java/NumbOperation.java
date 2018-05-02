import java.util.Scanner;

public class NumbOperation {

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


            System.out.println("Числа,делящиеся на 3 или на 9: ");
            for (int i = size - 1; i >= 0; i--) {
                if ((array[i] % 3 == 0) || (array[i] % 9 == 0)) {
                    System.out.println(array[i] + " ");
                }
            }
            System.out.println("Числа,делящиеся на 5 и на 7: ");
            for (int i = 0; i < size; i++) {
                if (((array[i] % 5) == 0) && ((array[i] % 7) == 0)) {
                    System.out.println(array[i] + " ");
                }
            }
            System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых\n" +
                    "цифр: ");
            int k = 0, l = 0, m = 0;
            for (int i = 0; i < size; i++) {
                if ((array[i] >= 100) && (array[i] <= 999)) {

                    m = array[i] % 10;
                    l = (array[i] / 10) % 10;
                    k = ((array[i])) / 100;

                    if ((m != l) && (m != k) && (l != k)) {

                        System.out.println(array[i] + " ");
                    }

                }

            }
            System.out.println("Счастливые числа: ");
            int r1, r2, r3, l1, l2, l3;
            for (int i = 0; i < size; i++) {
                if ((array[i] >= 100000) && (array[i] <= 999999)) {
                    r1 = array[i] / 100000;
                    r2 = (array[i] % 100000) / 10000;
                    r3 = (array[i] % 10000) / 1000;
                    l1 = (array[i] % 1000) / 100;
                    l2 = (array[i] % 100) / 10;
                    l3 = array[i] % 10;

                    if ((r1 + r2 + r3) == (l1 + l2 + l3)) {
                        System.out.println(array[i]+ " ");
                    }
                }
            }
        }

}



