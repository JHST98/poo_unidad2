package uni1a;

/**
 * Clase que representa a un investigador que participa en un documental.
 */
public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void investigar() {
        System.out.println(nombre + " está investigando sobre " + especialidad + ".");
    }

    @Override
    public String toString() {
        return nombre + " (Especialidad: " + especialidad + ")";
    }
}
