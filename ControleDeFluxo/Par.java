
import java.util.Scanner;

public class Par {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num = valor.nextInt();

        if (num % 2 == 0) {
            System.out.print("Numero = " + num + " ,portanto é par");
        } else {
            System.out.print("Numero = " + num + " ,portanto é impar");
        }
    }
}
