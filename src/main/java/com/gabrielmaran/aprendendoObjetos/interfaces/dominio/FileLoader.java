package com.gabrielmaran.aprendendoObjetos.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermision() {
        System.out.println("Checando permissões de um arquivo");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize no FileLoader");
    }
}

