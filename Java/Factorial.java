import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, c, fact = 1;

        System.out.println("Introduce un número para calcular su factorial: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n < 0) {
            System.out.println("El número no puede ser negativo.");
        } else {
            for(c = 1; c <= n ; c++){
                fact = fact*c;
                System.out.println("El factorial de " + n + " es = " + fact);
            }
        }
    }
}
