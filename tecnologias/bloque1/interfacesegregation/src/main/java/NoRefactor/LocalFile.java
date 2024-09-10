package NoRefactor;

public class LocalFile implements FileInterface {
    private String name;
    private String ownerUserName;
    private String ownerGroupName;

    public void rename(String name) {
        this.name = name;
    }

    public void changeOwner(String user, String group) {
        ownerUserName = user;
    }


}
