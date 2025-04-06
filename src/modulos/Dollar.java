package modulos;

public class Dollar extends Moeda{

    public Dollar(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaConversao(double numero){
        return numero * getValor();
    }


}
