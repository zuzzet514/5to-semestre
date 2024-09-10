package refactoring;

public class FilePermissionManager  {

    public void transferOwnership(SupportsChangeOwnership file, String ownerUsername, String ownerGroupName) {
        file.changeOwner(ownerUsername, ownerGroupName);
    }
}
