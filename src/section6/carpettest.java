package section6;

public class carpettest {
    public static void main(String[] args) {
        carpetcost carpetcost = new carpetcost(2.75, 4.0);
        carpetcost.setCostpercarpet(3.5);
        System.out.println("total cost = "+ carpetcost.getCost());
        carpetcost carpetcost1 = new carpetcost(5.4,4.5);
        carpetcost1.setCostpercarpet(1.5);
        System.out.println("total cost = "+ carpetcost1.getCost());
    }
}
