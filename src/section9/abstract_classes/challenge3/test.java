package section9.abstract_classes.challenge3;

public class test {
    public static void main(String[] args) {
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());
        String stringData = "Darwin Brisbane Melbourne Canberra Adelaide Sydney Perth";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.additem(new Node(s));
        }
        list.traverse(list.getRoot());
    }


}
