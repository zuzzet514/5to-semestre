public class Main {
    public static void main(String[] args) {
        Book book = new Book("Fundamentos de Bases de Datos", "Silberschatz", true);
        LibraryMember member = new LibraryMember("Jordain", "S22017019");

        Library usbi = new Library(book, member);

        usbi.lendBook();
    }
}