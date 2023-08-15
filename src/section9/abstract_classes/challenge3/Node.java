package section9.abstract_classes.challenge3;

import java.nio.charset.StandardCharsets;

public class Node extends Listitem {

    public Node(Object value) {
        super(value);
    }

    @Override
    Listitem next() {
        return this.rightlink;
    }

    @Override
    Listitem setNext(Listitem item) {
        this.rightlink = item;
        return this.rightlink;
    }

    @Override
    Listitem previous() {
        return this.leftlink;
    }

    @Override
    Listitem setPrevious(Listitem item) {
        this.leftlink = item;
        return this.leftlink;
    }

    @Override
    int compareTo(Listitem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
