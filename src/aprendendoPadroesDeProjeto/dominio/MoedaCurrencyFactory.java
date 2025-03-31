package aprendendoPadroesDeProjeto.dominio;

public class MoedaCurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case BRAZIL:
                return new Real();
            case USA:
                return new UsDolar();
            default:
                throw new IllegalArgumentException("Sem moeda para este país");
        }
    }
}
