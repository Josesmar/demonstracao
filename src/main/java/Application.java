import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Calculadora");

        Scanner lerScanner = new Scanner(System.in);
        Scanner lerValor = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        Mensagem m = new Mensagem();
        m.mensagem();

        int valorDigitado = lerScanner.nextInt();

        if (valorDigitado == 1){

            System.out.println("Digite o primeiro valor");
            Double pValor = lerValor.nextDouble();
            System.out.println("Digite o segundo valor");
            Double sValor = lerValor.nextDouble();

            System.out.println("Soma: " + calculadora.soma(pValor,sValor));
        }
        if (valorDigitado == 2){

            System.out.println("Digite o primeiro valor");
            Double pValor = lerValor.nextDouble();
            System.out.println("Digite o segundo valor");
            Double sValor = lerValor.nextDouble();

            System.out.println("Divide: " + calculadora.divide(pValor,sValor));
        }
        if (valorDigitado == 3){

            System.out.println("Digite o primeiro valor");
            Double pValor = lerValor.nextDouble();
            System.out.println("Digite o segundo valor");
            Double sValor = lerValor.nextDouble();

            System.out.println("Multiplicação: " + calculadora.multiplica(pValor,sValor));
        }

        if (valorDigitado == 4){

            System.out.println("Digite o primeiro valor");
            Double pValor = lerValor.nextDouble();
            System.out.println("Digite o segundo valor");
            Double sValor = lerValor.nextDouble();

            System.out.println("Subtração: " + calculadora.subtrai(pValor,sValor));
        }
        else {
            System.out.println("Valor inválido");
        }
        lerScanner.close();
    }

}
