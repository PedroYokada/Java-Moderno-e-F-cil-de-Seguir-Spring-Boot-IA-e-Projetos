
public class incremento {

    public static void main(String[] args) {
        int a = 10;
        int b = --a;
        // Aqui o pré decremento  pede para diminuir a variavel
        // primeiro e depois utilizar

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int c = 10;
        int d = a--;

        // Aqui o pós decremento pede para usar a variavel
        // primeiro e depois diminuir

        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
