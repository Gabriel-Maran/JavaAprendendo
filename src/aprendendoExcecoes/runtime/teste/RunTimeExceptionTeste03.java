package aprendendoExcecoes.runtime.teste;

public class RunTimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        //Pode ser try e catch; try e finally; try, catch e finally
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
//            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Sempre roda, mesmo se o try não for executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
