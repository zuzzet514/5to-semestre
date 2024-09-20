import model.Estudiante;
import model.Maestro;
import ui.UIEstudiante;
import ui.UIMaestro;
import ui.UIMenu;
import static ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Maestro maestro1 = new Maestro("Luis Morales", "luismorales@uv.mx", 123);
        maestro1.addTutoriasDisponibles("10/10/2024", "13:00");
        maestro1.addTutoriasDisponibles("24/10/2024", "14:00");
        Maestro maestro2 = new Maestro("Mamercado", "mag@uv.mx", 345);
        maestro2.addTutoriasDisponibles("11/10/2024", "13:00");
        maestro2.addTutoriasDisponibles("16/10/2024", "12:00");
        maestro2.addTutoriasDisponibles("18/10/2024", "10:00");
        Maestro maestro3 = new Maestro("Jvergara", "vergara@uv.mx", 567);

        maestros.add(maestro1);
        maestros.add(maestro2);
        maestros.add(maestro3);
        UIMaestro.maestrosConTutorias.add(maestro1);
        UIMaestro.maestrosConTutorias.add(maestro2);

        estudiantes.add(new Estudiante("Jordain", "S22017019", "s22017019@estudiantes.uv.mx"));
        estudiantes.add(new Estudiante("Nava Alexis", "nava@uv.mx", "z121"));
        estudiantes.add(new Estudiante("Emilio Jasso", "jasso@uv.mx", "z122"));

        //mostrarMenu();
        UIEstudiante.agendarTutoria();
    }


}