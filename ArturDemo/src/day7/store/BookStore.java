package day7.store;

public abstract class BookStore {
    private String address;

    public BookStore() {
    }
    public BookStore(BookStore bookStore) {
        this.address = bookStore.address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
