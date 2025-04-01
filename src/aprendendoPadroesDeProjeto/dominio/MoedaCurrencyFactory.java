package aprendendoPadroesDeProjeto.dominio;

public class MoedaCurrencyFactory {
    public static Currency newCurrency(Country country) {
        return switch (country) {
            case BRAZIL -> new Real();
            case USA -> new UsDolar();
            default -> throw new IllegalArgumentException("Sem moeda para este país");
        };
    }
}
