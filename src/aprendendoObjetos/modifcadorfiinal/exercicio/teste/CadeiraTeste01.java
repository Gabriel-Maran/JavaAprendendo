package aprendendoObjetos.modifcadorfiinal.exercicio.teste;

import aprendendoObjetos.modifcadorfiinal.exercicio.dominio.Cadeira;

public class CadeiraTeste01 {
    public static void main(String[] args) {
        Cadeira cadeira1 = new Cadeira("Marrom");
        System.out.println(cadeira1);
        cadeira1.alterarCor("Cinza");
        cadeira1.informacoes();
    }
}
