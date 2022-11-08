import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println(" ======= Calculadora =======");

        //Instância
        Scanner operacaoEscolhida = new Scanner(System.in);
        Scanner lerValor = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Mensagem cabecalho = new Mensagem();

        cabecalho.mensagem();

        int operacao = operacaoEscolhida.nextInt();

        switch (operacao){
            case 1:
                System.out.println("Soma: " + calculadora.soma(retornaPrimeiroValorDigitado(lerValor), retornaSegundoValorDigitado(lerValor)));
                break;
            case 2:
                System.out.println("Divide: " + formataValorEmDuasDecimais(calculadora.divide(retornaPrimeiroValorDigitado(lerValor), retornaSegundoValorDigitado(lerValor))));
                break;
            case 3:
                System.out.println("Multiplicação: " + formataValorEmDuasDecimais(calculadora.multiplica( retornaPrimeiroValorDigitado(lerValor),retornaSegundoValorDigitado(lerValor))));
                break;
            case 4:
                System.out.println("Subtração: " + calculadora.subtrai(retornaPrimeiroValorDigitado(lerValor),retornaSegundoValorDigitado(lerValor)));
                break;
            case 5:
                double valorPorcentagem = retornaValorParaPorcentagem(lerValor);
                double porcentagem = retornaPorcentagem(lerValor);
                System.out.println(porcentagem + "% " + " de " + valorPorcentagem + " é: " + calculadora.porcentagem(valorPorcentagem, porcentagem));
                break;
            default:
                System.out.println("Valor inválido");
        }
        operacaoEscolhida.close();
        lerValor.close();
    }

   private static double convertePontoEmVirgula(String valor){
        return Double.parseDouble(valor.replaceAll(",", "."));
   }

   private static String formataValorEmDuasDecimais(double valorASerFormatado){
       DecimalFormat df = new DecimalFormat("#,##0.00");
       return df.format(valorASerFormatado);
   }

   private static double retornaPrimeiroValorDigitado(Scanner lerValor){
       System.out.println("Digite o primeiro valor");
       return convertePontoEmVirgula(lerValor.nextLine());
   }

   private static double retornaSegundoValorDigitado(Scanner lerValor){
       System.out.println("Digite o segundo valor");
       return convertePontoEmVirgula(lerValor.nextLine());
   }

   private static double retornaValorParaPorcentagem(Scanner lerValor){
       System.out.println("Digite o valor para calcular a porcetagem");
       return convertePontoEmVirgula(lerValor.nextLine());
   }

   private static double retornaPorcentagem(Scanner lerValor){
       System.out.println("Qual é a porcentage?");
       return lerValor.nextDouble();
   }
}