package aprendendoClassesUtilitarias.regex.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "Gabriel, Joao, Cleiton";
        String texto2 = "Gabriel1Joao2Cleiton";
        String[] splitString = texto.split(",");
        for(String nome: splitString) {
            System.out.println(nome.trim());
        }
        splitString = texto2.split("\\d");
        for(String nome: splitString) {
            System.out.println(nome.trim());
        }
    }
}
