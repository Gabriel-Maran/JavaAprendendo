package com.gabrielmaran.aprendendoObjetos.interfaces.teste;

import com.gabrielmaran.aprendendoObjetos.interfaces.dominio.DataLoader;
import com.gabrielmaran.aprendendoObjetos.interfaces.dominio.DatabaseLoader;
import com.gabrielmaran.aprendendoObjetos.interfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader dataLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataLoader.load();
        fileLoader.load();

        dataLoader.remove();
        fileLoader.remove();

        dataLoader.checkPermision();
        fileLoader.checkPermision();

        DataLoader.retriveMaxDataSize();
        FileLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
