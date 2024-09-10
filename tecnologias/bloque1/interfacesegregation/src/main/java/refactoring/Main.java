package refactoring;

public class Main {
    public static void main(String[] args) {
        LocalFile local = new LocalFile("archivo", "usuario", "grupo");
        Dropbox drop = new Dropbox("a", "b", "c");

        FileImporter fileImporter = new FileImporter();
        FilePermissionManager filePermissionManager = new FilePermissionManager();

        fileImporter.importFile(local, "archivo local importado");
        System.out.println(local.getName());

        fileImporter.importFile(drop, "archivo dropbox importado");
        System.out.println(drop.getName());

        filePermissionManager.transferOwnership(local, "Nuevo usuario", "nuevo grupo");
        // filePermissionManager.transferOwnership(drop, "Nuevo usuario", "nuevo grupo");
    }
}
