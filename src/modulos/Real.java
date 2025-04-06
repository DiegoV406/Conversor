package modulos;

public class Real extends Moeda{

    public Real(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaConversao(double numero){
        return numero * getValor();
    }
}
