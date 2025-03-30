package aprendendoConcorrencia.dominio;

public class Discount {
    public enum Code{
        NONE(0), SUPER(5), SUPERDOIS(10), SUPERTRES(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
