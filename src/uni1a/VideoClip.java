package uni1a;

public class VideoClip extends ContenidoAudiovisual {
    private String artista;
    private String album;

    public VideoClip(String titulo, int duracionEnMinutos, String genero, String artista, String album) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("VideoClip:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println();
    }
}
