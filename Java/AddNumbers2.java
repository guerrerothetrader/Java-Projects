import java.util.Scanner;
import java.math.BigInteger;
import java.net.Socket;

public class AddNumbers2 {
    public static void main(String[] args) {
        String number1, number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el primer gran número: ");
        number1 = in.nextLine();

        System.out.println("Introduce el segundo gran número: ");
        number2 = in.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;
        
        sum = first.add(second);

        System.out.println("El resultado de la suma es: " + sum);
    }
}
