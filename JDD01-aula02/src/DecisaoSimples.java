import java.util.Scanner;

public class DecisaoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        //Verificar se o número informado é positivo > 0
        if(numero > 0)
            System.out.println(numero + " é positivo");

        int idade;
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(idade >= 16){
            System.out.println("Pode votar");
        }
    }
}
