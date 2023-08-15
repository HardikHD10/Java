package section9.abstract_classes.challenge3;

public interface Nodelist {
    Listitem getRoot();
    boolean additem(Listitem item);
    boolean removeitem(Listitem item);
    void traverse(Listitem root);
}
