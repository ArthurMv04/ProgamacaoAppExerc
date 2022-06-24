import java.util.Scanner;
public class atividade3{

    public static void main  (String[] args){
    Scanner entrada = new Scanner(System.in);

    Double altura, menor, maior, a1;
    Integer a2;
    System.out.println("informe a altura do trapézio em metros:");
    altura = entrada.nextDouble();
    System.out.println("informe a base menor do trapézio em metros:");
    menor = entrada.nextDouble();
        System.out.println("informe a base maior do trapézio em metros:");
        maior = entrada.nextDouble();
             a1 = (altura * (menor + maior)) / 2;
             a2 = (int) ((altura * (menor + maior)) / 2);
        System.out.println("A área exata do trapezio é :" + a1 + " metros " );
        System.out.println("E a área arredondada do trapezio é :" + a2 + " metros " );
        entrada.close();

}

}