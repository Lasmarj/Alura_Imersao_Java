import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //Comando de saída / Entrada / Processamento

        System.out.println("Olá mundo!"); //IntelliJ:  sout - Eclipse: syso
        System.out.println("Bem vindo ao Deep Java");
        System.out.println(20 + 5);

        //Processamento
        /*Variável de memória: Um espaço na memória RAM para
          guardar uma informação.
          tipo nomeVariavel;

        */
        String nome; //Declarar variável: nome é do tipo String
        int idade, x, y;
        idade = 46;
        char letra;
        int n1 = 5, n2 = 2;
        double n3 = 5.0;
        int soma = n1 + n2; //Processamento
        System.out.println("Soma = " + soma);
        int subtracao = n1 - n2;
        System.out.println(subtracao);
        double divisao = n3 / n2;
        System.out.println(n3 + " / " + n2 + " = " + divisao);
        int resto = n1 % n2;
        System.out.println("Resto: " + resto);

        //Comando de entrada: receber uma informação
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        //variavel = objeto_leitor.next
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite sua idade: ");
        //leitor.nextLine();
        idade = leitor.nextInt();
        System.out.println("Bem vindo(a) " + nome +
                " sua idade é " + idade);




    }
}
