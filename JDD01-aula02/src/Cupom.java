import java.util.Scanner;

public class Cupom {
    public static void main(String[] args) {
        /*Exercício 1: Faça um programa que receba o total de compras
        de um usuário e um cupom. Se o total de compras exceder 1000
        ou se o cupom for igual a DESCONTO20, aplicar um desconto de
        20% na compra.
        * */
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        double valorCompra, valorTotal;
        String cupom;
        System.out.println("Digite o valor da compra: R$ ");
        valorCompra = leitor.nextDouble();
        System.out.println("Cupom de desconto");
        cupom = leitorTexto.nextLine();
        if(valorCompra > 1000 || cupom.equalsIgnoreCase("Desconto20")){
            valorTotal = valorCompra * 0.8;
        }else {
            valorTotal = valorCompra;
        }
        System.out.printf("Valor final R$ %.2f", valorTotal);
    }
}
