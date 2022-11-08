public class Calculadora {

    public double soma(double primeiroValor, double segundoValor){
        return primeiroValor + segundoValor;
    }

    public double divide(double primeiroValor, double segundoValor){
        return primeiroValor / segundoValor;
    }

    public double multiplica(double primeiroValor, double segundoValor){
        return primeiroValor * segundoValor;
    }

    public double subtrai(double primeiroValor, double segundoValor){
        return primeiroValor - segundoValor;
    }

    public double porcentagem(double valor, double porcentagem){
        return (valor * porcentagem) / 100;
    }
}
