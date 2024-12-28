package aprendendoObjetos.enumeracao.dominio;

public enum TipoCliente {
    //Se usa enumeração quando você tem uma escolha forçada e tem que forçar o tipo a ser utilizado
    PESSOA_FISICA(1, "Pessoa Física"), // Os atributos que estão dentro dos paranteses servem para indicar um outro valor que cada um pode ser
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoCLientePorNomeRelatorio(String nomeRelatorio) {
        for(TipoCliente tipoCliente : TipoCliente.values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
