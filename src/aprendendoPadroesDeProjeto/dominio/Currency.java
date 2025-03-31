package aprendendoPadroesDeProjeto.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDolar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}