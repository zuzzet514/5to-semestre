import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("hola");

        Maestro maistro = new Maestro();
        maistro.nombre = "Morales";
        maistro.mostrarNombre();
        maistro.mostrarId();

        Maestro.id++;

        Maestro maistro2 = new Maestro();
        maistro2.nombre = "Dr Nava";
        maistro2.mostrarNombre();
        maistro2.mostrarId();

        Maestro.id++;

        maistro.mostrarId();

         */

        //mostrarMenu();

        /*
        Maestro maestro = new Maestro();
        maestro.nombre = "Morales";

         */
        /*Calculadora.ClaseAnidada cal = new Calculadora.ClaseAnidada();

        cal.mostrarNumero();

        */

        Maestro maestro = new Maestro("Morales");

        System.out.println(maestro.getId() + " " + maestro.getNombre());
       // Agregar tutorias

       maestro.addCursoDisponible(new Date(), "12:00");
       maestro.addCursoDisponible(new Date(), "14:00");
       maestro.addCursoDisponible(new Date(), "16:00");

        System.out.println(maestro.getId() + " " + maestro.getNombre());

        System.out.println("Cursos disponibles: ");
        for (Maestro.TutoriasDisponibles td : maestro.getCursosDisponibles()) {
            System.out.println(td.getFecha() + " " + td.getHora());
        }

        ClaseExterna instancia = new ClaseExterna();
        ClaseExterna.ClaseInterna instanciaAnidada = instancia.new ClaseInterna();
        instanciaAnidada.saludar();

        Maestro maestro2 = new Maestro("Magdiel");
        maestro2.addCursoDisponible(new Date(), "20:00");
        maestro2.addCursoDisponible(new Date(), "18:00");
        maestro2.addCursoDisponible(new Date(), "07:00");

        System.out.println();

        System.out.println("Cursos disponibles: ");
        for (Maestro.TutoriasDisponibles td : maestro2.getCursosDisponibles()) {
            System.out.println(td.getFecha() + " " + td.getHora());
        }

        ClaseExterna instanciaAnidada2 = new ClaseExterna();

        instanciaAnidada2.metodoExterno();

    }


}