package day5;

public class Pair<T> {//T:Type
    private T firstElement;
    private T secondElement;

    public Pair() {
    }

    public Pair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(T secondElement) {
        this.secondElement = secondElement;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstElement=" + firstElement +
                ", secondElement=" + secondElement +
                '}';
    }
}
