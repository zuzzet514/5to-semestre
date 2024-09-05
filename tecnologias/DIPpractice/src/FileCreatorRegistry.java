import java.util.HashMap;
import java.util.Map;

public class FileCreatorRegistry {
    private final Map<Integer, FileCreator> creators = new HashMap<>();

    public void registerCreator(int option, FileCreator creator) {
        creators.put(option, creator);
    }

    public FileCreator getCreator(int option) {
        return creators.get(option);
    }

}
