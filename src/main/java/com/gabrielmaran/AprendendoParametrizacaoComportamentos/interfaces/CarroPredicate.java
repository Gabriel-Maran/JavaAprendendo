package com.gabrielmaran.AprendendoParametrizacaoComportamentos.interfaces;

import com.gabrielmaran.AprendendoParametrizacaoComportamentos.dominio.Carro;

public interface CarroPredicate {
    boolean test(Carro carro);
}
