public class SwitchCase {
    public static void main(String[] args) {
        int diaSemana = 6;

        switch (diaSemana){
            case 1: System.out.println("domingo");break;
            case 2: System.out.println("segunda");
                    System.out.println("Dia de aula"); break;
            case 3: System.out.println("terça");break;
            case 4: System.out.println("quarta");break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
