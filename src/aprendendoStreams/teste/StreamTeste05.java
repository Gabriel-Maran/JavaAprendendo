package aprendendoStreams.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        for(Integer i = 0; i < words.size(); i++) {
            String[] letters = words.get(i).split("");
            System.out.println(Arrays.toString(letters));
        }

        ArrayList<String> collect = words.stream()
                .map(w -> w.split(""))//Stream<String[]>
                .flatMap(Arrays::stream)//Stream<Strings>
                .collect(Collectors.toCollection(ArrayList::new));//Coletando os dados
        System.out.println(collect);
    }
}
