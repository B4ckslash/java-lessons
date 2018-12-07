package exercise;

public class NumberBoxDone<T extends Number> {

    private T content;

    public NumberBoxDone() {
        this.content = null;
    }

    public T emptyBox() {
        T ret = this.content;
        this.content = null;
        return ret;
    }

    public void putInBox(T t) {
        if(this.content == null) this.content = t;
    }
}
