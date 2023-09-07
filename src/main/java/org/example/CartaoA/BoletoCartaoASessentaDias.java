package org.example.CartaoA;

import org.example.Boleto;

public class BoletoCartaoASessentaDias extends Boleto {


    public BoletoCartaoASessentaDias(double valor) {
        super(valor);
        setJuros(0.1);
        setMulta(0.2);
    }
}
