import java.util.Scanner;

public class FossilClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fossil Age (in millions of years):");
        int fossilAge = scanner.nextInt();
        if ((fossilAge <= 144) && (fossilAge >= 66)) {
            System.out.println("Your fossil is from the Cretaceous Period");
        } else if ((fossilAge <= 201) && (fossilAge >= 145)) {
            System.out.println("Your fossil is from the Jurassic Period");
        } else if ((fossilAge <= 252) && (fossilAge >= 202)) {
            System.out.println("Your fossil is from the Triassic Period");
        } else {
            System.out.println("._.");
        }
    }
}