import model.Estudiante;
import model.Maestro;
import ui.UIMenu;
import static ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        maestros.add(new Maestro("Luis Morales", "luismorales@uv.mx", 123));
        maestros.add(new Maestro("Mamercado", "mag@uv.mx", 345));
        maestros.add(new Maestro("Jvergara", "vergara@uv.mx", 567));

        estudiantes.add(new Estudiante("Jordain", "S22017019", "s22017019@estudiantes.uv.mx"));
        estudiantes.add(new Estudiante("Nava Alexis", "nava@uv.mx", "z121"));
        estudiantes.add(new Estudiante("Emilio Jasso", "jasso@uv.mx", "z122"));
        mostrarMenu();
    }


}