
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");

        int n1 = op.nextInt();

        System.out.print("Insira o primeiro valor: ");

        int n2 = op.nextInt();

        double media = (n1 + n2) / 2;

        String mensagem = (media > 6) ? "Aprovado" : "Reprovado";

        System.out.print("Média = " + media + " aluno(a) " + (mensagem));

    }
}
