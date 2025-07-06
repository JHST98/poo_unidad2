package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una temporada dentro de una serie de TV.
 */
public class Temporada {
    private int numeroTemporada;
    private int cantidadEpisodios;
    private List<String> titulosEpisodios;

    public Temporada(int numeroTemporada, int cantidadEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
        this.titulosEpisodios = new ArrayList<>();
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void agregarTitulo(String titulo) {
        titulosEpisodios.add(titulo);
    }

    public List<String> getTitulosEpisodios() {
        return titulosEpisodios;
    }

    public void mostrarTemporada() {
        System.out.println("Temporada " + numeroTemporada + " - " + cantidadEpisodios + " episodios");
        for (String titulo : titulosEpisodios) {
            System.out.println("• " + titulo);
        }
    }
}
