import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();

        Area rect = new Area(length, breadth);

        System.out.println("Area of rectangle: " + rect.returnArea());
    }
}