package com.gabrielmaran.aprendendoClassesUtilitarias.wrappers.teste;

public class WrapperTeste01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10.0F;
        double doubleP = 10.00;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 127; //byte<128
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10.0F;
        Double doubleW = 10.00;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase(Character.toLowerCase('A')));
        System.out.println(Character.toUpperCase('!'));
        System.out.println(Character.toUpperCase('1'));
    }
}
