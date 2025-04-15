import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        /*Calcule a média aritmética das três notas de um aluno e mostre,
        além do valor da média, uma mensagem de:
        - "Aprovado", caso a média seja igual ou superior a 7;
        - “Em prova final” caso a média seja menor que 7 e maior ou igual a 4
        aluno fará uma recuperação, calcular nova media >=6 aprovado, reprovado após exame; e
        - “Reprovado", caso contrário.

        * */
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        System.out.println("Primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.println("Segunda nota do aluno: ");
        nota2 = leitor.nextDouble();
        System.out.println("Terceira nota do aluno: ");
        nota3 = leitor.nextDouble();
        media = (nota1 + nota2 + nota3)/3;
        String situacao;
        if(media >= 7){
            situacao = "Aprovado";
        }else if(media >= 4){
            situacao = "Prova final";
            System.out.println("Informe a nota do exame: ");
            double exame = leitor.nextDouble();
            double novaMedia = (media + exame) / 2;
            if(novaMedia >= 6){
                situacao = "Aluno aprovado após exame";
                media = novaMedia;
            }else{
                situacao = "Aluno reprovado após exame";
                media = novaMedia;
            }
        }else{
            situacao = "Reprovado";
        }
        System.out.println("Situação final do aluno: " + situacao + " média: " + media);





    }
}
