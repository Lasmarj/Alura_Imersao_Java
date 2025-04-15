public class RodizioExpression {
    public static void main(String[] args) {
        //yhe-9876
        //9876 - Rodizio é na Quarta-Feira
        //1 e 2: Segunda | 3 e 4: terça | 5 e 6: quarta | 7 e 8: quinta | 9 e 0: sexta
        int placa = 9873;
        int digito = placa % 10;
        switch (digito) {
            case 1, 2 -> {
                System.out.println("segunda");
            }
            case 3, 4 -> System.out.println("terça");
            case 5, 6 -> System.out.println("quarta");
            case 7, 8 -> System.out.println("quinta");
            default -> System.out.println("sexta");
        }
    }
}
