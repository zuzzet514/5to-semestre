import java.util.HashMap;
import java.util.Map;

public class FileCreatorRegistry {
    private final Map<Integer, FileCreator> CREATORS = new HashMap<>();
    private final Map<Integer, String> CREATORS_TYPE = new HashMap<>();

    public void registerCreators(int option, FileCreator creator, String description) {
        CREATORS.put(option, creator);
        CREATORS_TYPE.put(option, description);
    }

    public FileCreator getCreator(int option) {
        return CREATORS.get(option);
    }

    public  String showOptions() {
        String options = "";
        for (Integer key : CREATORS_TYPE.keySet()) {
            options += key + "-" + CREATORS_TYPE.get(key) + "\t";
        }
        return options;
    }
}


















