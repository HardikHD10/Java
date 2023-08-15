package section9.abstract_classes.challenge3;

public class MylinkedList implements Nodelist {
    private Listitem root = null;

    public MylinkedList(Listitem root) {
        this.root = root;
    }

    @Override
    public Listitem getRoot() {
        return this.root;
    }

    @Override
    public boolean additem(Listitem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        Listitem currentitem = this.root;
        while (currentitem != null) {
            int comparison = (currentitem.compareTo(item));
            if (comparison < 0) {
                if (currentitem.next() != null) {
                    currentitem = currentitem.next();
                } else {
                    currentitem.setNext(item).setPrevious(currentitem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentitem.previous() != null) {
                    currentitem.previous().setNext(item).setPrevious(currentitem);
                    item.setNext(currentitem).setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeitem(Listitem item) {
        if (item != null){
            System.out.println("deleting item "+ item.getValue());
        }
        Listitem currentitem = this.root;
        while (currentitem != null){
            int comparison = currentitem.compareTo(item);
            if (comparison == 0){
                if (currentitem == this.root){
                    this.root = currentitem.next();
                }
                else {
                    currentitem.previous().setNext(currentitem.next());
                    if(currentitem != null) {
                        currentitem.next().setPrevious(currentitem.previous());
                    }
                }
                return true;
            }else if (comparison< 0){
                currentitem = currentitem.next();
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(Listitem root) {
        if (root == null) {
            System.out.println("the list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}

