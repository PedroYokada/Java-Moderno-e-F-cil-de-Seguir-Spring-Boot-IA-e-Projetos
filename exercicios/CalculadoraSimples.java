
import java.util.Scanner;
public class CalculadoraSimples {

    public static void main(String[] args) {

    
        Scanner calculo = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        double n1 = calculo.nextDouble();

        System.out.println("Insira a operação desejada (+,-,*,/): ");
        String op = calculo.next();

        System.out.println("Insira o segundo numero: ");
        double n2 = calculo.nextDouble();

        double n3 = 0;

        if (op.equals("+")) {
            n3 = n1 + n2;
        } else if (op.equals("-")) {
            n3 = n1 - n2;
        } else if (op.equals("*")) {
            n3 = n1 * n2;
        } else if (op.equals("/")) {
            if (n2 == 0) {
                System.out.println("Denominador não pode ser 0.");
                calculo.close();
                System.exit(0);
            } else {
                n3 = n1 / n2;
            }
        } else {
            calculo.close(); 
            System.exit(0);
        }

        System.out.println("O resultado é: " + n3);

        calculo.close();
    }
}
