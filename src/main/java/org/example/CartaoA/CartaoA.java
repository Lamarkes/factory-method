package org.example.CartaoA;

import org.example.Boleto;
import org.example.Cartao;

public class CartaoA extends Cartao {

    @Override
    public Boleto criarBoleto(int qtdeDeDiasAtraso, double valor) {
        switch (qtdeDeDiasAtraso){
            case 10:
                return new BoletoCartaoADezDias(valor);

            case 30:
                return new BoletoCartaoATrintaDias(valor);

            case 60:
                return new BoletoCartaoASessentaDias(valor);

            default:
                throw new IllegalArgumentException("Valor Invalido!");
        }
    }
}
