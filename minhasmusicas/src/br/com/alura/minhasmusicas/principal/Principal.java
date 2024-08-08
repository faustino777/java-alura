package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Sodium");
        minhamusica.setCantor("BONES");

        for (int i = 0; i < 1236; i++) {
            minhamusica.reproduzir();
        }

        for (int i = 0; i < 532; i++) {
            minhamusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("Teorias da conspiração");
        meupodcast.setApresentador("Ximbinho");

        for (int i = 0; i < 867 ; i++) {
            meupodcast.reproduzir();
        }

        for (int i = 0; i < 128; i++) {
            meupodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhamusica);
        preferidas.inclui(meupodcast);

    }
}
