public class Par100{
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        int par = 1;

        System.out.println("Numeros Pares: ");
        while(par <= 100){
            if(par%2 == 0){
                System.out.println(par);
            }
            par++;
        }
   }
}