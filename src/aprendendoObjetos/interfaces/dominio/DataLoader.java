package aprendendoObjetos.interfaces.dominio;

public interface DataLoader { //na interface todos os metodos sao publicos e abstratos, sendo assim, é redundante add public e abastract
    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    public default void checkPermision() { //Default não é obrigatorio as classes filhas usarem ela, pois é um metodo concreto
        System.out.println("Fazendo checagem de permissões ");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
