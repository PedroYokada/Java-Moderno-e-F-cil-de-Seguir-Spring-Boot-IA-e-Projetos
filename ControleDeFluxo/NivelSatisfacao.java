import java.util.Scanner;

public class NivelSatisfacao {

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);

        System.out.print("Insira o nivel (1-5): ");

        int nivel = opcao.nextInt();

        switch (nivel) {
            case 1:
                System.out.print("Muito insatisfeito");
                break;
            case 2:
                System.out.print("Insatisfeito");
                break;
            case 3:
                System.out.print("Neutro");
                break;
            case 4:
                System.out.print("Satisfeito");
                break;
            case 5:
                System.out.print("Muito Satisfeito");
                break;
            default:
                System.out.print("Opção inválida.");
                break;
        }

    }
}
