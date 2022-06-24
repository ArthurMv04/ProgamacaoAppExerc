public class atividade2 {
    
    public static void main(String[] args){
        long somaP=1;
        int somaI=0;
        int i;

    for (i = 0; i <= 30; i++) {
            if (i % 2 == 1)
            somaI +=i;
            else
                if (i>0)
                somaP*=i;
            }
            System.out.println(somaI + " soma dos impares. ");
        
            System.out.println(somaP + " multiplicação dos pares. ");
    }

}
