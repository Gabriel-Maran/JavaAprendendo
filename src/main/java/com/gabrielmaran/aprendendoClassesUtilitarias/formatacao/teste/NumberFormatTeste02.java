package com.gabrielmaran.aprendendoClassesUtilitarias.formatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
        Locale localeCN = Locale.CANADA;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localeCN);
        nf[2] = NumberFormat.getCurrencyInstance(localeJP);
        nf[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 1_000_000_000.231;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        double valorNormal = 11;
        String valorString = nf[1].format(valorNormal);
        try {
            System.out.println(nf[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
