package exsingleton;

public class Main {

    public static void main(String[] args) {
        Persona miPersona1;
        miPersona1 = Persona.getInstance(42,"Pepe","García");
        System.out.println(miPersona1);
        Persona miPersona2;
        miPersona2 = Persona.getInstance();
        System.out.println(miPersona2);
    }
}
