public class Calculadora {

    private Double primeiroValor;
    private Double segundoValor;
    private Double resultado;

    public Double soma(Double primeiroValor, Double segundoValor){
        return primeiroValor + segundoValor;
    }

    public Double divide(Double primeiroValor, Double segundoValor){
        return primeiroValor / segundoValor;
    }

    public Double multiplica(Double primeiroValor, Double segundoValor){
        return primeiroValor * segundoValor;
    }

    public Double subtrai(Double primeiroValor, Double segundoValor){
        return primeiroValor - segundoValor;
    }
}
