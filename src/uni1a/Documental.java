/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;
// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    private List<Investigador> investigadores = new ArrayList<>();

    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    public List<Investigador> getInvestigadores() {
        return investigadores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + getTema());

        if (investigadores != null && !investigadores.isEmpty()) {
            System.out.println("Investigadores:");
            for (Investigador inv : investigadores) {
                System.out.println("• " + inv);
            }
        } else {
            System.out.println("No se han asignado investigadores.");
        }

        System.out.println();
     }
}