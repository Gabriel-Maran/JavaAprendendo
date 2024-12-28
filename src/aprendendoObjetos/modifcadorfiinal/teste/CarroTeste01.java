package aprendendoObjetos.modifcadorfiinal.teste;

import aprendendoObjetos.modifcadorfiinal.dominio.Carro;
import aprendendoObjetos.modifcadorfiinal.dominio.Comprador;
import aprendendoObjetos.modifcadorfiinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Comprador comprador1 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro1.COMPRADOR);
        carro1.COMPRADOR.setNome("Cleiton");
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari1 = new Ferrari();
        ferrari1.setNome("Ferrari1");
        ferrari1.imprime();
    }
}
