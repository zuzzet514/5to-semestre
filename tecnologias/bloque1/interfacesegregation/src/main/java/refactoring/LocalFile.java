package refactoring;

public class LocalFile implements SupportsChangeOwnership, SupportsRenaming {

    private String name;
    private String ownerUsername;
    private String ownerGroupName;

    public LocalFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void changeOwner(String user, String group) {
        this.ownerUsername = user;
        this.ownerGroupName = group;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
