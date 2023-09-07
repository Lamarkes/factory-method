package org.example.CartaoB;

import org.example.Boleto;

public class BoletoCartaoBDezDias extends Boleto {
    protected BoletoCartaoBDezDias(double valor) {
        super(valor);
        setJuros(0.12);
        setMulta(0.18);
    }
}
