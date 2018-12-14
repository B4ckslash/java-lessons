package exercise;

public class NumberBox {
    private Number content;

    public NumberBox() {
        this.content = null;
    }

    public Number emptyBox() {
        Number ret = this.content;
        this.content = null;
        return ret;
    }

    public void putInBox(Number t) {
        if(this.content == null) this.content = t;
    }
}
