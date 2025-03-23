package exercicios.exs03.service;

import exercicios.exs03.dominio.Forma;

import java.util.ArrayList;
import java.util.List;

public class RepositorioForma<T extends Forma> {
    private List<T> lista = new ArrayList<>();

    public void addForma(T forma) {
        lista.add(forma);
    }

    public void removeForma(T forma) {
        if(lista.isEmpty()){
            throw new IllegalArgumentException("Lista vazia");
        }
        lista.remove(forma);
    }

    public T getForma(int posicao) {
        if(lista.isEmpty()){
            throw new IllegalArgumentException("Lista vazia");
        }else if(posicao < 0 || posicao >= lista.size()){
            throw new IndexOutOfBoundsException("Posição invalida");
        }
        return lista.get(posicao);
    }

    public String getLista() {
        return lista.toString();
    }

    public void printListaFormas() {
        for (T forma : lista) {
            System.out.println(forma);
        }
    }

    public double somaTotalAreas() {
        return lista.stream().mapToDouble(Forma::calcularArea).sum();
    }

    public double somaTotalPerimetro(){
        return lista.stream().mapToDouble(Forma::calcularPerimetro).sum();
    }
}
