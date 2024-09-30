import java.util.Scanner;

public class AddNumbers {  
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Introduce dos números para calcular su suma: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Suma de los númereos introducidos: " + z);
    }
    
}
