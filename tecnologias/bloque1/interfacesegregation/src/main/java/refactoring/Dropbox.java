package refactoring;

public class Dropbox implements SupportsRenaming {

    private String name;
    private final String ownewrUserName;
    private final String ownerGroupName ;

    public Dropbox(String name, String ownewrUserName, String ownerGroupName) {
        this.name = name;
        this.ownewrUserName = ownewrUserName;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
