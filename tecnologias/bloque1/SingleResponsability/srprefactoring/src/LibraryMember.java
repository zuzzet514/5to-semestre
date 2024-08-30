public class LibraryMember {
    private String name;
    private String memberID;
    private Book book;

    public LibraryMember(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberID;
    }

    public  void  borrowBook(Book book) {
        System.out.println(this.name + " ha solicitado el  préstamo del libro " + this.book);
    }

    public void  returnBook(Book book) {
        System.out.println(this.name + " ha devuleto");
    }


}
