package aprendendoObjetos.enumeracao.exercicio.dominio;

public enum CategoriaProduto {
    ALIMENTOS(1) {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, ELETRONICOS(2) {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    }, ROUPAS(3) {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.15;
        }
    }, OUTROS(4); //Sem desconto

    private final int numeroCategoria;

    CategoriaProduto(int numeroCategoria) {
        this.numeroCategoria = numeroCategoria;
    }

    public static CategoriaProduto tipoCategoriaPorNumero(int numeroCategoria) {
        for (CategoriaProduto categoria : CategoriaProduto.values()) {
            if (categoria.numeroCategoria == numeroCategoria) {
                return categoria;
            }
        }
        return null;
    }

    public double calcularDesconto(double valor) {
        return 0;
    }
}
