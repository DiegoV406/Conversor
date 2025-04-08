
import modulos.*;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Dollar dolar1 = new Dollar();
        PesoArgentino pesoArgentino1 = new PesoArgentino();
        PesoColombiano pesoColombiano1 = new PesoColombiano();
        Real real1 = new Real();
        int opcao;
        double valor;

        while (true) {
            System.out.println("""
                    ******************** Conversor de Moedas ********************
                    
                    1) Dólar --> Peso Argentino
                    2) Peso Argentino --> Dólar
                    3) Real Brasileiro --> Dólar
                    4) Dólar --> Real Brasileiro
                    5) Peso Colombiano --> Dólar
                    6) Dólar --> Peso Colombiano
                    7) Sair
                    
                    """);
            System.out.print("Escolha uma opção válida: ");
            opcao = entrada.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite um valor para converter: ");
                    valor = entrada.nextDouble();
                    dolar1.conversorUsdPeso(valor);
                    break;

                case 2:
                    System.out.println("Digite um valor para converter: ");
                    valor = entrada.nextDouble();
                    pesoArgentino1.conversor(valor);
                    break;

                case 3:
                    System.out.println("Digite um valor para converter: ");
                    valor = entrada.nextDouble();
                    real1.conversor(valor);
                    break;

                case 4:
                    System.out.println("Digite um valor para converter: ");
                    valor = entrada.nextDouble();
                    dolar1.conversor(valor);
                    break;

                case 5:
                    System.out.println("Digite um valor para converter: ");
                    valor = entrada.nextDouble();
                    pesoColombiano1.conversor(valor);
                    break;

                case 6:
                    System.out.println("Digite um valor para converter: ");
                    valor = entrada.nextDouble();
                    dolar1.conversorUsdColombiano(valor);
                    break;

                case 7:
                    System.out.println("Saindo ....");
                    return;

                default:
                    System.out.println("Opção Inválida");
            }
        }


    }
}