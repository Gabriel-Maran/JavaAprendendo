package com.gabrielmaran.aprendendoObjetos.sobrecargametodos.teste;

import com.gabrielmaran.aprendendoObjetos.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.init("Nome01", "Tipo", 349, "Genero");
        anime1.immprime();
    }
}
