import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int x;

        System.out.println("Introduce un número para comprobar si es para o impar: ");
        Scanner in = new Scanner (System.in);
        x = in.nextInt();
        
        if (x % 2 == 0) {
            System.out.println("Tu introduciste un número par.");
        }else {
            System.out.println("Tu introduciste un número impar.");
        }
    }
}
