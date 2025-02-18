package AprendendoParametrizacaoComportamentos.interfaces;

import AprendendoParametrizacaoComportamentos.dominio.Carro;

public interface CarroPredicate {
    boolean test(Carro carro);
}
