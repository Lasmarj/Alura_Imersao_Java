public class Rodizio {
    public static void main(String[] args) {
        //yhe-9876
        //9876 - Rodizio é na Quarta-Feira
        //1 e 2: Segunda | 3 e 4: terça | 5 e 6: quarta | 7 e 8: quinta | 9 e 0: sexta
        int placa = 9879;
        int digito = placa % 10;
        switch (digito){
            case 1:
            case 2:
                System.out.println("segunda"); break;
            case 3:
            case 4:
                System.out.println("terça"); break;
            case 5:
            case 6:
                System.out.println("quarta"); break;
            case 7:
            case 8:
                System.out.println("quinta"); break;
            default:
                System.out.println("sexta"); break;


        }
    }
}
