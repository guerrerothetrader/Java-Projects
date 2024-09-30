import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Introduce tres números: ");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z)
            System.out.println("El primer número es el mayor.");
        else if (y > x && y > z)
            System.out.println("El segundo número es el mayor de todos.");
        else if (z > x && z > y)
            System.out.println("El tercer número es el mayor. ");
    }
}
