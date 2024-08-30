public class Main {
    public static void main(String[] args) {
        Library usbi = new Library("Fundamentos de sistemas  operativos", "jvergara",true, "fulanito", "HHJJH");

        usbi.showBookStatus();
        usbi.lendBook();
        usbi.showBookStatus();
        usbi.returnBook();
        usbi.showBookStatus();
    }
}