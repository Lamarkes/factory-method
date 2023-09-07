package org.example;

public abstract class Cartao {

    public Boleto gerarBoleto(double valor, int qtdeDiasAtraso){
        Boleto boleto = criarBoleto(qtdeDiasAtraso,valor);
        System.out.println("\nValor R$: "+ boleto.getValor() + " \nDias de Atraso: "+ qtdeDiasAtraso);
        System.out.println("\nJuros R$: " + boleto.calcularJuros());
        System.out.println("Multa R$: "+ boleto.calcularMulta());

        return boleto;
    }

    public abstract Boleto criarBoleto(int qtdeDeDiasAtraso,double valor);
}
