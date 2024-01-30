package looppractice;
import java.util.Locale;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String ");
        String userInputString = scanner.nextLine();
        //print uppercase string
        System.out.println("Uppercase string "+ userInputString.toUpperCase());
    }
}
 