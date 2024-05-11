package day7.book;

public abstract class Book{
    private String title;
    private double price;
    private Genre genre;

    public Book() {
    }

    public Book(Book book) {
        this.title = book.title;
        this.price = book.price;
        this.genre = book.genre;
    }

    public abstract String getBookInfo();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
