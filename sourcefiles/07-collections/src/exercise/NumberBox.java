package exercise;

public class NumberBox {
    private Number content;

    public NumberBox() {
        this.content = 0;
    }

    public Number emptyBox() {
        Number ret = this.content;
        this.content = null;
        return ret;
    }

    public void putInBox(Number number) {
        if(this.content == null) this.content = number;
    }
}
