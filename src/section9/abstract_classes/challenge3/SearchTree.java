package section9.abstract_classes.challenge3;

public class SearchTree implements Nodelist{

    private  Listitem root = null;

    public SearchTree(Listitem root) {
        this.root = root;
    }

    @Override
    public Listitem getRoot() {
        return this.root;
    }

    @Override
    public boolean additem(Listitem item) {
        if (this.root == null){
            this.root = item;
            return true;
        }
        Listitem currentitem = this.root;
        while (currentitem != null){
            int comparison = currentitem.compareTo(item);
            if (comparison<0){
                if (currentitem.next() != null){
                    currentitem = currentitem.next();
                    return true;
                }else {
                    currentitem.setNext(item);
                }
            }else if (comparison > 0){
               if(currentitem.previous() != null){
                   currentitem = currentitem.previous();
                   return true;
               }else {
                   currentitem.setPrevious(item);
               }
            }
            else {
                System.out.println(item.getValue()+ " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeitem(Listitem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        Listitem currentItem = this.root;
        Listitem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }
    private void performRemoval(Listitem item, Listitem parent) {
        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            Listitem current = item.next();
            Listitem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(Listitem root) {
        // recursive method
        if (root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

}
