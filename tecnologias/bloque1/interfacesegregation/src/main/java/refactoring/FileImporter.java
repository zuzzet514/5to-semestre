package refactoring;

public class FileImporter {
    public void importFile(SupportsRenaming file, String name) {
        file.rename(name);
    }
}
