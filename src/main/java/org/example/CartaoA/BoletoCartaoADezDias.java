package org.example.CartaoA;

import org.example.Boleto;

public class BoletoCartaoADezDias extends Boleto {

    protected BoletoCartaoADezDias(double valor) {
        super(valor);
        setJuros(0.02);
        setMulta(0.05);
    }
}

