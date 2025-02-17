package aprendendoClassesInternas;

public class OuterClassesTeste02 {
    private String name = "Abc";
    static class Nested {
        void print(){// nao pode acessar o name de forma direta, ela so esta dentro da OuterClassesTeste02, por questao de empacotamento
            //Nested tbm é uma classe top level
            String lastName = "Cba";
            System.out.println(new OuterClassesTeste02().name+ " " + lastName);
        }
    }
    public static void main(String[] args) {
//        OuterClassesTeste02.Nested m = new OuterClassesTeste02.Nested();
        Nested m = new Nested();
        m.print();
    }
}
