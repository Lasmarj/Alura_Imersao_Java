import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        //Entrada: A 10    B 20
        //Saída:   A 20    B 10
        Scanner leitor = new Scanner(System.in);
        int a, b, aux;
        System.out.println("Digite um número: ");
        a = leitor.nextInt();
        System.out.println("Digite segundo número: ");
        b = leitor.nextInt();
        aux = a;
        a = b;
        b = aux;
        System.out.println("A: " + a + " - B: " + b);
    }
}
