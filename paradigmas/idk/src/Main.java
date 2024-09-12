import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       IBoton boton = new IBoton() {

           // clase anónima, se usa cuando solo lo vas a usar una vez y no es necesario crear una clase
           @Override
           public void pulsar() {
               System.out.println("Encendiendo...");
           }
       };

       boton.pulsar();


    }


}