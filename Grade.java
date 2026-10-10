import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Current grade percentage:");
        double current = scanner.nextDouble();
        System.out.println("Final weight percentage:");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Target letter grade:");
        String targetLetter = scanner.nextLine();

        int target = 0;
        String finalLetter = "N/A";

        switch (targetLetter) {
            case "A":
                target = 90;
                break;
            case "B":
                target = 80;
                break;
            case "C":
                target = 70;
                break;
            case "D":
                target = 60;
                break;
        }

        double minimum = current + 100.0 * (target - current) / weight;

        if (minimum >= 90) {
            finalLetter = " (A)";
        } else if (minimum >= 80) {
            finalLetter = " (B)";
        } else if (minimum >= 70) {
            finalLetter = " (C)";
        } else if (minimum >= 60) {
            finalLetter = " (D)";
        } else if (minimum > 0) {
            finalLetter = " (F)";
        } else {
            finalLetter = " (Either you need to set your expectations higher or enter a real letter grade. And no, E does not count as 'excellent'.)";
        }

        System.out.println("Final minimum percentage needed: " + minimum + finalLetter);
    }
}
