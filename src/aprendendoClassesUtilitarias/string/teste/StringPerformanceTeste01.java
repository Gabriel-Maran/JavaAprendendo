package aprendendoClassesUtilitarias.string.teste;

public class StringPerformanceTeste01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStringBuilder(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder: "+(fim-inicio)+" em ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuffer: "+(fim-inicio)+" em ms");

        inicio = System.currentTimeMillis();
        concatString(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com String apenas: "+(fim-inicio)+" em ms");
    }


    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

    private static void concatString(int tamanho){ //Vai demorar muito tempo
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            texto = texto + i;
        }
    }
    private static void concatStringBuffer(int tamanho){
        StringBuffer sbf = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sbf.append(i);
        }
    }
}
