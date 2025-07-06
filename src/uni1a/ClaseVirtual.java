package uni1a;

public class ClaseVirtual extends ContenidoAudiovisual {
    private String profesor;
    private String tema;

    public ClaseVirtual(String titulo, int duracionEnMinutos, String genero, String profesor, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.profesor = profesor;
        this.tema = tema;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Clase Virtual:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Profesor: " + profesor);
        System.out.println("Tema: " + tema);
        System.out.println();
    }
}
