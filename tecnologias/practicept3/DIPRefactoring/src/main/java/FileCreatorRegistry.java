import java.util.HashMap;
import java.util.Map;

public class FileCreatorRegistry {

    private final Map<Integer, FileCreator> CREATORS = new HashMap<>();

    public void registerCreators(int option, FileCreator creator) {
        CREATORS.put(option, creator);
    }

    public FileCreator getCreator(int option) {
        return CREATORS.get(option);
    }
}
