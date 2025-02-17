package aprendendoClassesInternas;

class Animal{
    public void walk(){
        System.out.println("Animal wamlikng");
    }
}
//class Cachorro extends Animal{ //É criada para evitar criar mais classes que serão usadas apenas uma vez
//    @Override
//    public void walk(){
//        System.out.println("Cachorro wamlikng");
//    }
//}

public class ClassesAnonimasTeste01 {
    public static void main(String[] args) {
        Animal a =  new Animal(){ //Ela é criada assim e será utilizada apenas uma vez(se for utilizada mais que uma, o certo é criar uma classes separada
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        a.walk();
    }
}
