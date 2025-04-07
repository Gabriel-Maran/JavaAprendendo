package com.gabrielmaran.aprendendoObjetos.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando Dados do DB");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do DB");
    }

    @Override
    public void checkPermision() {
        System.out.println("Checando permissões do DB");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize no DatabaseLoader");
    }
}
