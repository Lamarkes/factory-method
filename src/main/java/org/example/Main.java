package org.example;

import org.example.CartaoA.CartaoA;

public class Main {
    public static void main(String[] args) {
       var cartaoA = new CartaoA();

        System.out.println("------- Valor do Boleto -------");

       cartaoA.gerarBoleto(100,10);
       cartaoA.gerarBoleto(100,30);
       cartaoA.gerarBoleto(100,60);
    }
}