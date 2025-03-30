package aprendendoConcorrencia.dominio;

public class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discount;

    private Quote(String store, double price, Discount.Code discount) {
        this.store = store;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Creates new Quote object from the value following the pattern storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
