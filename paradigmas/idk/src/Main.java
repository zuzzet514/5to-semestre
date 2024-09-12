import java.util.Date;

public class Main {
    public static void main(String[] args) {

       Maestro m = new Maestro("Morales", "luismorales04@uv.com", 57522);

       // agregar tutorias
        m.addTutoriasDisponibles(new Date(), "12:00");
        m.addTutoriasDisponibles(new Date(), "14:00");
        m.addTutoriasDisponibles(new Date(), "16:00");

        System.out.println(m);

    }


}