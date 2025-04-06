package modulos;

public class PesoArgentino extends Moeda{

    public PesoArgentino(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaConversao(double numero){
        return numero * getValor();
    }
}
