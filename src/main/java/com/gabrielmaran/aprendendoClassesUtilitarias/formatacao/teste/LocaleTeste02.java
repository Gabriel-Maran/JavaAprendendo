package com.gabrielmaran.aprendendoClassesUtilitarias.formatacao.teste;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoPaises = Locale.getISOCountries();
        String[] isoLinguas = Locale.getISOLanguages();
        for (String lingua : isoLinguas) {
            System.out.print(lingua+ " ");
        }
        System.out.println();

        for(String paises : isoPaises) {
            System.out.print(paises+ " ");
        }

    }
}
