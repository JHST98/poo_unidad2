package uni1a;

/**
 * Clase que representa a un actor que puede participar en una película.
 */
public class Actor {
    private String nombre;
    private int edad;

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void actuar() {
        System.out.println(nombre + " está actuando en la escena.");
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}