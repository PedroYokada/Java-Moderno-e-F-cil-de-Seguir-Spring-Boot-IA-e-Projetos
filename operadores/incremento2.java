
public class incremento2 {

    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        // Aqui o pré incremento  pede para aumentar a variavel
        // primeiro e depois utilizar

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int c = 10;
        int d = a++;

        // Aqui o pós incremento pede para usar a variavel
        // primeiro e depois aumentar
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
