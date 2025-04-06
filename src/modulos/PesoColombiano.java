package modulos;

public class PesoColombiano extends Moeda{

    public PesoColombiano(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaConversao(double numero){
        return numero * getValor();
    }
}
