package day7.book;

import java.util.Arrays;

public class EBook extends Book{
    private String author;
    private int filesize;
    private Format format;
    private Format availableFormats[] = new Format[Format.values().length];

    public EBook() {
    }
    public EBook(EBook book) {
        this.author = book.author;
        this.filesize = book.filesize;
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

    public int getFilesize(){
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
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
                +getAuthor()+","+getGenre()+","+getGenre()+","+filesize
                + Arrays.toString(availableFormats);
    }


    private int i=0;
    public void addFormat(Format format){
        availableFormats[i] = format;
        i++;
    }
}
