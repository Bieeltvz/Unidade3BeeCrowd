import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri8 {

    public static void main(String[] args) {
        System.out.println("Qual o código de peça, número de peças e valor de cada peça respectivamente? ");
        Scanner teclado = new Scanner(System.in);
        short peca1 = teclado.nextShort();
        short numeroPecas1 = teclado.nextShort();
        float valorPecas1 = teclado.nextFloat();
        System.out.println("Qual o código de peça, número de peças e valor de cada peça respectivamente? ");
        short peca2 = teclado.nextShort();
        short numeroPecas2 = teclado.nextShort();
        float valorPecas2 = teclado.nextFloat();
        float valorReal1 = numeroPecas1 * valorPecas1;
        float valorReal2 = numeroPecas2 * valorPecas2;
        float valorPagar = valorReal1 + valorReal2;
        DecimalFormat df = new DecimalFormat("#00.00");
        System.out.println("VALOR A PAGAR: R$ " + df.format(valorPagar));
        teclado.close();
        
        
    }
} 