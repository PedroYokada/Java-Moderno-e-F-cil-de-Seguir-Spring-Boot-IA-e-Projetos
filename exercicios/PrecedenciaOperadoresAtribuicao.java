
public class PrecedenciaOperadoresAtribuicao {

    public static void main(String[] args) {
        int numero = 100;

        System.out.println("NUMERO ANTES DO PRÉ-INCREMENTO = " + numero);
        ++numero;
        System.out.println("NUMERO DEPOIS DO PRÉ-INCREMENTO = " + numero);

        System.out.println("NUMERO ANTES DO PÓS-INCREMENTO = " + numero);
        numero++;
        System.out.println("NUMERO DEPOIS DO PÓS-INCREMENTO = " + numero);

        System.out.println("NUMERO ANTES DO PRÉ-DECREMENTO = " + numero);
        --numero;
        System.out.println("NUMERO DEPOIS DO PRÉ-DECREMENTO = " + numero);

        System.out.println("NUMERO ANTES DO PÓS-DECREMENTO = " + numero);
        numero--;
        System.out.println("NUMERO DEPOIS DO PÓS-DECREMENTO = " + numero);
    }
}
