package modulos;

public class Moeda {
    String nome ;
    double valor;


    public Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calculaConversao(double numero){
     return numero * getValor();
    }
}

