package wrong;

public class UserManager {
    private User[] users;
    private static int userCount = 0;

    public void registerUser(String username, String password) {

        User newUser = new User(username, password);

        if (!authenticateUser(newUser)) {
            users[userCount] = new User(username, password);
            userCount++;
            System.out.println("Usuario registrado.");
        } else {
            System.out.println("Este usuario ya existe.");
        }
    }

    private User getUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }

    private boolean authenticateUser(User lookedUser) {
        for (User u : users) {
            if(u == lookedUser) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.registerUser("Magdiel", "mag");
        userManager.registerUser("Alejandro", "teran");
        userManager.registerUser("Daniel", "dan");

        userManager.getUser("Alejandro");
    }
}
