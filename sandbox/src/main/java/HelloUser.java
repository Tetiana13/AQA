import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		System.out.println("Put down your name and click <Enter>");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hello " + name + "!");
		scan.close();
	}


}
