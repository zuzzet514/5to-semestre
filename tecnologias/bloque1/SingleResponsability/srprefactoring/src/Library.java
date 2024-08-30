public class Library {
    private Book book;
    private LibraryMember member;

    public Library(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
    }

    public void lendBook() {
        if(book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("El libro " + book.getTitle() + " no está disponible");
        } else {
            System.out.println("El libro " + book.getTitle() + " está disponible");
        }
    }

    public void returnBook() {
        book.setAvailable(true);
        System.out.println("El libro " + this.book.getTitle() + " ha sido devuelto");
    }

    public void showBookStatus() {
        System.out.println("El estado actual del libro " + this.book.isAvailable());
    }
}
