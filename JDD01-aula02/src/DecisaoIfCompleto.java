import java.util.Scanner;

public class DecisaoIfCompleto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Solicitar 2 notas de um aluno (ED), calcular a média (PD)
        //Apresentar uma mensagem se ele está aprovado ou reprovado (SD)
        //Para o aluno ser aprovado a média deverá ser maior ou igual a 6
        double nota1, nota2, media;
        System.out.println("Primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.println("Segunda nota do aluno: ");
        nota2 = leitor.nextDouble();
        media = (nota1 + nota2)/2;
        if(media >= 6) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }else {
            System.out.println("Reprovado");
        }
        System.out.println("Média: " + media);
    }
}
