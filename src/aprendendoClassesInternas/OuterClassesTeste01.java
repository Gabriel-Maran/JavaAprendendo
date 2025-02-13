package aprendendoClassesInternas;

public class OuterClassesTeste01 {
    private String nome = "Gabriel";

    void print() { // Os parametros tambem devem ser finais
        final String sobrenome = "Maran";
        class LocalClass {
            public void printLocal() {
                System.out.println(nome + " " + sobrenome);
            }
        }
        new LocalClass().printLocal();
//        LocalClass localClass = new LocalClass();
//        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outer = new OuterClassesTeste01();
        outer.print();
    }
}
