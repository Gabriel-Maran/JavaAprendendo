package aprendendoObjetos.contrutores.teste;

import aprendendoObjetos.contrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("NomePadrao", "Tipo", 0, "Genero", "Estudio");
        Anime anime2 = new Anime();
        anime1.immprime();
        anime2.immprime();
    }
}
