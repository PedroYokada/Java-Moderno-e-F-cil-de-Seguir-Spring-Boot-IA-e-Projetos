public class operadores_unarios {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("A PRÉ-INCREMENTO = " + a);
        a++;
        System.out.println("A PÓS INCREMENTO = " + a);

        int b = 20;
        System.out.println("B PRÉ-DECREMENTO = " + b);
        b--;
        System.out.println("B PÓS DECREMENTO = " + b);

        int c = 10;
        System.out.println("C ANTES PRÉ-INCREMENTO = " + c);
        ++c;
        System.out.println("C PÓS PRÉ-INCREMENTO = " + c);

        int d = 20;
        System.out.println("D ANTES PRÉ-INCREMENTO = " + d);
        --d;
        System.out.println("D PÓS PRÉ-DECREMENTO = " + d);
    }
}
