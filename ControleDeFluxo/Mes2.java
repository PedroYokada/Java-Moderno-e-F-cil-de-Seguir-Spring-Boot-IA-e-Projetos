
import java.util.Scanner;

public class Mes2 {

    public static void main(String[] args) {

        Scanner inf = new Scanner(System.in);

        System.out.print("Escreva um mês: ");

        String mes = inf.nextLine().toUpperCase();

        switch (mes) {
            case "JANEIRO", "MARÇO", "MAIO", "JULHO", "AGOSTO", "OUTUBRO", "DEZEMBRO" -> {
                System.out.println("Mês com 31 dias!");
            }
            case "ABRIL", "JUNHO", "SETEMBRO", "NOVEMBRO" -> {
                System.out.println("Mês com 30 dias!");
            }
            case "FEVEREIRO" -> {
                System.out.println("o número de dias é 28 (considerando um ano não bissexto)");
            }
            default -> {
                System.out.println("Mês desconhecido.");
            }

        }
    }
}
