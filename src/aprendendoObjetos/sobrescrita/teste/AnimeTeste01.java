package aprendendoObjetos.sobrescrita.teste;

import aprendendoObjetos.sobrescrita.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Anime1");
        System.out.println(anime1); //está fazendo "anime1.toString();"
    }
}
