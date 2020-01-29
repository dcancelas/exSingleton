package exsingleton;

public class Persona {

    private int edad;
    private String nombre;
    private String apellido;
    private static Persona laUnica;

    private Persona() {
    }
    private Persona(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static Persona getInstance(){
        if (laUnica == null){
            laUnica = new Persona();
        }
        return laUnica;
    }
    public static Persona getInstance(int edad, String nombre, String apellido) {
        if (laUnica == null){
            laUnica = new Persona(edad,nombre,apellido);
        }
        return laUnica;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
