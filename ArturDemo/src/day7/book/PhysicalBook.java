package day7.book;

import java.util.Arrays;

public class PhysicalBook extends Book{
    private String author;
    private int pages;
    private Format format;
    private Format availableFormats[] = new Format[Format.values().length];

    public PhysicalBook() {
    }
    public PhysicalBook(PhysicalBook book) {
        this.setTitle(book.getTitle());
        this.setPrice(book.getPrice());
        this.setGenre(book.getGenre());
        this.author = book.author;
        this.pages = book.pages;
        this.format = book.format;
        this.availableFormats = new Format[book.availableFormats.length];
        for (int i=0 ; i<availableFormats.length ; i++){
            if(book.availableFormats[i]==null){
                this.i = i;
                break;
            }
            availableFormats[i] = book.availableFormats[i];
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Format[] getAvailableFormats() {
        return availableFormats;
    }

    public void setAvailableFormats(Format[] availableFormats) {
        this.availableFormats = availableFormats;
    }

    @Override
    public String getBookInfo() {
        return "the name of this book is <"+getTitle()+">, the price is "+getPrice()
                +getAuthor()+","+getGenre()+","+getGenre()+","+getPages()
                + Arrays.toString(availableFormats);
    }

    private int i=0;
    public void addFormat(Format format){
        availableFormats[i] = format;
        i++;
    }
}
