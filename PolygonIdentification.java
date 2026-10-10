import java.util.Scanner;

public class PolygonIdentification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number of sides a polygon can have:");
        int sideNum = scanner.nextInt();
        switch (sideNum) {
            case 3:
                System.out.println("Triangle!");
                break;
            case 4:
                System.out.println("Quadrilateral!");
                break;
            case 5:
                System.out.println("Pentagon!");
                break;
            case 6:
                System.out.println("Hexagon!");
                break;
            default:
                System.out.println("Figure it out yourself >:(");
        } // Write your code below!

    }
}
