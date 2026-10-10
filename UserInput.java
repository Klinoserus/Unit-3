import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me some words of insiration :D");
        String inspo = scanner.nextLine();
        System.out.println("According to you, you believe in the following saying: " + inspo);
        System.out.println("Now give me a number, and I'll square it!");
        int number = scanner.nextInt();
        System.out.println("Squared: " + (number * number));
    }
}