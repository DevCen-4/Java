package Lap4.EX2;
public class Book extends Document {
    private String author;
    private int numberPage;
    public Book(String id, String nxb, int number, String author, int numberPage) {
        super(id, nxb, number);
        this.author = author;
        this.numberPage = numberPage;
    }
    // Thêm getter và setter
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberPage=" + numberPage +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}