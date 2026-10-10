import java.util.Scanner;

public class DovePhotography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the family of the bird?");
        String family = scanner.nextLine();
        System.out.println("What is the feather color of the bird?");
        String featherColor = scanner.nextLine();
        System.out.println("What is the eye color of the bird?");
        String eyeColor = scanner.nextLine();

        System.out.println(family + featherColor + eyeColor);

        if (family.equals("columbidae")) {
            System.out.println("Dove! Take pictures!");
            if (featherColor.equals("orange") && eyeColor.equals("blue")) {
                System.out.println("Cooler dove!! Take many pictures");
            }
        } else {
            System.out.println("Meh bird... let's find a different one.");
        }

    }
}
