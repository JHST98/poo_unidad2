package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Subclase SerieDeTV que extiende de ContenidoAudiovisual
 */
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;

    // NUEVO: lista de objetos Temporada
    private List<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    // NUEVO: agregar una temporada a la lista
    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }

    // NUEVO: obtener lista de temporadas
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas (total): " + this.temporadas);

        // NUEVO: mostrar contenido detallado de cada temporada
        for (Temporada temp : listaTemporadas) {
            temp.mostrarTemporada();
        }

        System.out.println();
    }
}
