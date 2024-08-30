public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void lendBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("El libro " + this.title + " no está disponible");
        } else {
            System.out.println("El libro " + this.title + " está disponible");
        }
    }

    public void  returnBook() {
        isAvailable = true;
        System.out.println("El libro " + this.title + " ha sido devuelto");
    }
}
