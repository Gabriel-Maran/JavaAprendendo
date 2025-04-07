package com.gabrielmaran.aprendendoPadroesDeProjeto.teste;

import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.Country;
import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.Currency;
import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.MoedaCurrencyFactory;

public class CurrencyFactoryTeste01 {
    public static void main(String[] args) {
        Currency brazilCurrency = MoedaCurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(brazilCurrency.getSymbol());
    }
}
