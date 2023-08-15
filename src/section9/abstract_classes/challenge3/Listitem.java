package section9.abstract_classes.challenge3;

public abstract class Listitem {
    protected Listitem rightlink = null;
    protected Listitem leftlink = null;

    protected Object value;

    public Listitem(Object value) {
        this.value = value;
    }

    abstract Listitem next();
    abstract Listitem setNext(Listitem item);
    abstract Listitem previous();
    abstract Listitem setPrevious(Listitem item);

    abstract int compareTo(Listitem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
