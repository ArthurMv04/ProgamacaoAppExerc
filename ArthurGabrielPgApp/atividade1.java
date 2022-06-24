import java.util.Scanner;
public class atividade1{

    public static void main  (String[] args){
    Scanner entrada = new Scanner(System.in);

    Double al, menor, maior, ar;
    System.out.println("Altura do trapézio em metros: ");
    al = entrada.nextDouble();
    System.out.println("Base menor do trapézio em metros: ");
    menor = entrada.nextDouble();
    System.out.println("Base maior do trapézio em metros: ");
    maior = entrada.nextDouble();
    ar = (al * (menor + maior)) / 2;
    System.out.println("A área do trapézio é igual: " + ar + " metros . " );
    entrada.close();

}

}