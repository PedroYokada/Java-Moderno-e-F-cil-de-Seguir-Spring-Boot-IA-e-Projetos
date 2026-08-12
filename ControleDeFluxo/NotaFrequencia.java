
import java.util.Scanner;

public class NotaFrequencia {

    public static void main(String[] args) {

        Scanner aprovacao = new Scanner(System.in);

        System.out.print("Insira a Nota 1: ");
        double n1 = aprovacao.nextDouble();

        System.out.print("Insira a Nota 2: ");
        double n2 = aprovacao.nextDouble();

        System.out.print("Insira a % de frequência (0-100): ");
        int frequencia = aprovacao.nextInt();

        double media = (n1 + n2) / 2.0;

        String resultado = (media >= 6.0 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.print("MEDIA = " + media + " FREQUÊNCIA = " + frequencia + " aluno(a) " + resultado);

        aprovacao.close();

    }
}
