package exercicios.exsStreams;

import java.util.List;

public class FiltroNumPar {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
        List<Integer> listOfPairs = getNumPair(list);
        System.out.println(listOfPairs);
    }

    public static List<Integer> getNumPair(List<Integer> list){
        return list.stream().filter(num -> num%2==0).toList();
    }
}
