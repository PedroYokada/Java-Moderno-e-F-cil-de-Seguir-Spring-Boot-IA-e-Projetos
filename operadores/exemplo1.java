package operadores;
public class exemplo1 {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;

    System.out.println(a + " + " + b + " = " + (a + b));
    /*
     * Aqui foi necessário envolver a subtração (a - b) em parênteses,
     * pois o operador '+' e o '-' têm a mesma precedência.
     * Sem os parênteses, o Java tenta subtrair um número de uma String,
     * o que causa um erro de compilação no código.
     */
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));
    System.out.println(a + " / " + b + " = " + (a / b));
    System.out.println(a + " % " + b + " = " + (a % b));
  }
}
