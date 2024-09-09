package bueno;

import java.util.HashMap;
import java.util.Map;
public class FileCreatorRegistry {
    private final Map<Integer, FileCreator> CREATORS = new HashMap<>(); // num de opción , clase concreta que implemente FileCreator
    private final Map<Integer, String> CREATORS_TYPE = new HashMap<>(); // num de opción , el tipo de archivo que es (atributo string)

    // añade a los hashmaps el no. de opción, la implementación de FileCreator, el tipo de archivo
    public void registerCreators(int option, FileCreator creator, String description) {
        CREATORS.put(option, creator);
        CREATORS_TYPE.put(option, description);
    }

    // regresa el valor de la clave ingresada como parámetro
    public FileCreator getCreator(int option) {
        return CREATORS.get(option);
    }

    // muestra los tipos de archivos disponibles
    public  String showOptions() {
        String options = "";
        for (Integer key : CREATORS_TYPE.keySet()) {
            options += key + "-" + CREATORS_TYPE.get(key) + "\t";
        }
        return options;
    }
}


















