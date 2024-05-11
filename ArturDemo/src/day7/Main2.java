package day7;

import day7.book.Format;
import day7.book.Genre;
import day7.book.PhysicalBook;

public class Main2 {
    public static void main(String[] args) {
        PhysicalBook physicalBook1 = new PhysicalBook();
        physicalBook1.setTitle("3 Body");
        physicalBook1.setAuthor("Liu Xinci");
        physicalBook1.setPages(2004);
        physicalBook1.setGenre(Genre.FICTION);
        physicalBook1.setPrice(29);
        physicalBook1.setFormat(Format.HARDCOVER);
        physicalBook1.addFormat(Format.HARDCOVER);
        physicalBook1.addFormat(Format.PAPERBACK);
        System.out.println(physicalBook1.getBookInfo());

        PhysicalBook physicalBook2 = new PhysicalBook(physicalBook1);
        physicalBook2.addFormat(Format.EBOOK);
        System.out.println(physicalBook2.getBookInfo());

    }
}
//Part 1
//● Abstract Class Book (title, price, genre)
//● PhysicalBook Class Extends Book (author, pages, format, availableFormats[])
//● EBook Class Extends Book (author, filesize, format, availableFormats[])
//● Enum Genre (FICTION, NON_FICTION, SCIENCE_FICTION, MYSTERY)
//● Enum Format (HARDCOVER, PAPERBACK, EBOOK)
//● Implement this in separate package called Book

//● Constructors, Copy Constructors, safe Getters and Setters for all the classes.
//● Abstract getBookInfo() method for Book class.
//● Classes PhysicalBook and EBook @Override the abstract method getBookInfo() from
//Class Book and the implementation for each of the overridden methods in each class.
//● Create addFormat() method for PhysicalBook and EBook that adds a format in the
//respective availableFormats array of each child class.

//Part 2
//● Create BookStore Abstract class(Address)
// either web page address or physical address
//● Create OnlineBookStore class extends abstract BookStore class
//● Create ZangakBookStore class extends abstract BookStore class
//● Constructors, Copy Constructors, safe Getters and Setters for all the classes.
//● Implement this in separate package called Store
//● Have all these objects created in the main method to try to test the methods and
//constructors.