package org.example.CartaoA;

import org.example.Boleto;

public class BoletoCartaoATrintaDias extends Boleto {


    public BoletoCartaoATrintaDias(double valor) {
        super(valor);
        setJuros(0.08);
        setMulta(0.13);
    }
}
