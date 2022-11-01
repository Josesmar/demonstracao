import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*
        String a;
        Double d;
        double dd;
        int i;
        Integer ii;
        Float f;
        float ff;
        Boolean b;
        boolean bb;*/

        System.out.println(" ======= Calculadora =======");

        //Scanner para ler o que for digitado
        Scanner operacaoEscolhida = new Scanner(System.in);
        Scanner lerValor = new Scanner(System.in);

        //Instanciando um objeto do tipo Calculadora
        Calculadora calculadora = new Calculadora();

        //Instanciando um objeto do tipo Mensagem
        Mensagem m = new Mensagem();
        m.mensagem();

        int operacao = operacaoEscolhida.nextInt();

        //Declaracao global
        double primeiroValor = 0.0;
        double segundoValor = 0.0;
        double valorPorcentagem = 0.0;
        double porcentagem = 0.0;

        switch (operacao){
            case 1:
                System.out.println("Digite o primeiro valor");
                primeiroValor = replace(lerValor.nextLine());
                System.out.println("Digite o segundo valor");
                segundoValor = replace(lerValor.nextLine());
                System.out.println("Soma: " + calculadora.soma(primeiroValor,segundoValor));
                break;
            case 2:
                System.out.println("Digite o primeiro valor");
                primeiroValor = lerValor.nextDouble();
                System.out.println("Digite o segundo valor");
                segundoValor = lerValor.nextDouble();
                System.out.println("Divide: " + calculadora.divide(primeiroValor,segundoValor));
                break;
            case 3:
                System.out.println("Digite o primeiro valor");
                primeiroValor = lerValor.nextDouble();
                System.out.println("Digite o segundo valor");
                segundoValor = lerValor.nextDouble();
                System.out.println("Multiplicação: " + calculadora.multiplica(primeiroValor,segundoValor));
                break;
            case 4:
                System.out.println("Digite o primeiro valor");
                primeiroValor = lerValor.nextDouble();
                System.out.println("Digite o segundo valor");
                segundoValor = lerValor.nextDouble();
                System.out.println("Subtração: " + calculadora.subtrai(primeiroValor,segundoValor));
                break;
            case 5:
                System.out.println("Digite o valor para calcular a porcetagem");
                valorPorcentagem = lerValor.nextDouble();
                System.out.println("Qual é a porcentage?");
                porcentagem = lerValor.nextDouble();
                System.out.println(porcentagem + "% " + " de " + valorPorcentagem + " é: " + calculadora.porcentagem(valorPorcentagem,porcentagem));
                break;
            default:
                System.out.println("Valor inválido");
        }
        operacaoEscolhida.close();
    }

   private static double replace(String valor){
        return Double.parseDouble(valor.replaceAll(",", "."));
    }
}