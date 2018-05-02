import java.util.Scanner;

public class ParolePass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите пароль: ");
        String password1 = scanner.next();
        System.out.println(" Подтвердите пароль: ");
        String password2 = scanner.next();
        if
                (password1.equals(password2)) {
            System.out.println("Пароль верный");
        } else {
            System.out.println("Пароль не верный");
        }
    }
}
