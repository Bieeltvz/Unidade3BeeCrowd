import java.util.Scanner;
import java.text.DecimalFormat;


public class Uri9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float A = teclado.nextFloat();
        float B = teclado.nextFloat();
        float C = teclado.nextFloat();
        //a dividir o resultado da multiplicaçao de base A por altura C por 2
        float trianguloRetangulo1 = A * C;
        float trianguloRetangulo2 = trianguloRetangulo1 / 2;
        DecimalFormat df = new DecimalFormat("#0.000");
        System.out.println("TRIANGULO: " + df.format(trianguloRetangulo2));
        //b a area do circulo dded raio C.PI
        double pi = 3.14159;
        double raio = C;
        double area = pi * Math.pow(raio, 2);
        double areaCirculo = area;
        System.out.println("CIRCULO: " + df.format(areaCirculo));
        //c) a área do trapézio que tem A e B por bases e C por altura.
        float b1 = A;
        float b2 = B;
        float trapezio = (b1 + b2) * C / 2;
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        //d)area do quadrado
        float quadrado = B * B;
        System.out.println("QUADRADO: " + df.format(quadrado));
        //e area do triangulo que tem lados A e B
        float comprimento = A;
        float largura = B;
        float areaRetangulo = comprimento *largura;
        System.out.println("RETANGULO: " + df.format(areaRetangulo));
        teclado.close();
        
    }
    
}
