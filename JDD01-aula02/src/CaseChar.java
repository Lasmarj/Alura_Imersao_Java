public class CaseChar {
    public static void main(String[] args) {
        double n1 = 10, n2 = 5;
        char sinal = 'x';
        String operacao = "x";
        switch (sinal){
            case '+':
                System.out.println("Adição = " + (n1+n2));break;
            case 'x':
            case 'X':
            case '*':
            case '.': System.out.println("Multiplicação = " + (n1*n2)); break;
            case '-': System.out.println("Subtração = " + (n1-n2)); break;
            case '/': System.out.println("Divisão = " + (n1/n2)); break;
        }
    }
}
