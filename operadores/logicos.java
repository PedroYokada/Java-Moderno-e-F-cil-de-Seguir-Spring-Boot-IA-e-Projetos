package operadores;

public class logicos {
  public static void main(String[] args){
    int a = 5;
    int b = 10;
    boolean c = true;

    System.out.println(a + " < " + b + " && " + c + " = " + (a < b && c));
    System.out.println(a + " > " + b + " || " + c + " = " + (a > b || c));
    System.out.println("!" + c + " = " + (!c));
  }
}
