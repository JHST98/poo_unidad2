package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy",8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        Actor actor1 = new Actor("Ana García", 30);
        Actor actor2 = new Actor("Luis Torres", 42);

        Pelicula p1 = new Pelicula("El regreso", 100, "Acción", "Desconocido");
        p1.agregarActor(actor1);
        p1.agregarActor(actor2);
        System.out.println("=== Detalles de Película con Actores ===");
        p1.mostrarDetalles();

        //TEMPORADAS en una serie
        SerieDeTV serie = new SerieDeTV("Los Desconocidos", 45, "Suspenso", 2);

        Temporada t1 = new Temporada(1, 3);
        t1.agregarTitulo("El comienzo");
        t1.agregarTitulo("Sombra del pasado");
        t1.agregarTitulo("Revelación final");

        Temporada t2 = new Temporada(2, 2);
        t2.agregarTitulo("Eco del silencio");
        t2.agregarTitulo("El último secreto");

        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);

        System.out.println("=== Detalles de Serie con Temporadas ===");
        serie.mostrarDetalles();

        //INVESTIGADORES en un documental
        Documental docu = new Documental("En busca del ADN", 60, "Ciencia", "Genetica Molecular");

        Investigador inv1 = new Investigador("Dra. Camila Ríos", "Genética");
        Investigador inv2 = new Investigador("Dr. Jorge Ramírez", "Biología Molecular");
        
        docu.agregarInvestigador(inv1);
        docu.agregarInvestigador(inv2);

        System.out.println("=== Detalles de Documental con Investigadores ===");
        docu.mostrarDetalles();
        
        System.out.println("=== Detalles de Videoclip ===");
        VideoClip clip = new VideoClip("Shape of You", 4, "Pop", "Ed Sheeran", "Divide");
        clip.mostrarDetalles();
        
        System.out.println("=== Detalles de Clase Virtual ===");
        ClaseVirtual clase = new ClaseVirtual("POO en Java", 90, "Educativo", "Ing. Gustavo Navas", "Relaciones entre clases");
        clase.mostrarDetalles();

            }   
    }