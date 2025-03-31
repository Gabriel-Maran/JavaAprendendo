package aprendendoPadroesDeProjeto.teste;

import aprendendoPadroesDeProjeto.dominio.Country;
import aprendendoPadroesDeProjeto.dominio.Currency;
import aprendendoPadroesDeProjeto.dominio.MoedaCurrencyFactory;

public class CurrencyFactoryTeste01 {
    public static void main(String[] args) {
        Currency brazilCurrency = MoedaCurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(brazilCurrency.getSymbol());
    }
}
