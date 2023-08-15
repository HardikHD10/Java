package section7.billburger;

public class HamBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1name;
    private String addition2name;
    private String addition3name;
    private String addition4name;
    private double addition1price;
    private double addition2price;
    private double addition3price;
    private double addition4price;

    public HamBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }



    public void addHamburgerAddition1(String name, double price){
     this.addition1name = name;
     this.addition1price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2name = name;
        this.addition2price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3name = name;
        this.addition3price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4name = name;
        this.addition4price = price;
    }

    public double itemizehamburge(){
        double hamburgerprice = this.price;
        if(addition1name != null){
            hamburgerprice += this.addition1price;
            System.out.println("added "+this.addition1name+" for $ "+ this.addition2price);
        }
        if(addition2name != null){
            hamburgerprice += this.addition2price;
            System.out.println("added "+this.addition2name+" for $ "+ this.addition2price);
        }
        if(addition3name != null){
            hamburgerprice += this.addition3price;
            System.out.println("added "+this.addition3name+" for $ "+ this.addition3price);
        }
        if(addition4name != null){
            hamburgerprice += this.addition4price;
            System.out.println("added "+this.addition4name+" for $ "+ this.addition4price);
        }
        return hamburgerprice;
    }
}
