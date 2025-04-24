package com.gabrielmaran.aprendendoClassesInternas;

import java.util.HashMap;

public class InnerClassesTeste01 {
    private String nome = "Gabriel Maran";

    // Nested
    class Inner {
        public void printInnerClasses() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(InnerClassesTeste01.this);
        }
    }

    public static void main(String[] args) {
        InnerClassesTeste01 outerClass = new InnerClassesTeste01();
        Inner inner = outerClass.new Inner();
        inner.printInnerClasses();
        HashMap hashMap = new HashMap();
        hashMap.put("nome", "Gabriel Maran");
        hashMap.containsKey("nome");
    }
}
