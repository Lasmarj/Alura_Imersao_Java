import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        //nomeVariaveis - camelCase
        //nomeMae, tituloEleitor
        /*
        Exercício 1.: Ocasionalmente uma ONG parceira recebe
        doações em dólar e precisa saber qual é o valor em
        reais. Eles pediram para que você elabore um programa
         que permita que o usuário digite o valor da doação
         em dólares, converta esse valor para reais e exiba
         o resultado na tela.
        * */
        Scanner leitor = new Scanner(System.in);
        double dolar, reais, cotacao;
        System.out.println("Valor da doação em dólares: $ ");
        dolar = leitor.nextDouble();
        System.out.println("Informe o valor do dólar de hoje: ");
        cotacao = leitor.nextDouble();
        reais = dolar * cotacao; //5.8;
        System.out.println("Doação convertida em reais R$ " + reais);

    }

}
