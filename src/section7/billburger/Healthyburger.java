package section7.billburger;

public class Healthyburger extends  HamBurger{
    private String healthyextra1name;
    private double healthyextra1price;

    private String healthyextra2name;
    private double healthyextra2price;

    public Healthyburger(String name, String meat, double price, String breadRollType) {
        super("healthy", meat, price, "brown rye");
    }

    public void addHealthAddition1(String name, Double price){
        this.healthyextra1name = name;
        this.healthyextra1price = price;
    }

    public void addHealthAddition2(String name, Double price){
        this.healthyextra2name = name;
        this.healthyextra2price = price;
    }

    @Override
    public double itemizehamburge() {
        double hamburgerprice = super.itemizehamburge();
        if(this.healthyextra1name != null){
            hamburgerprice += this.healthyextra1price;
        }
        if(this.healthyextra2name != null){
            hamburgerprice += this.healthyextra2price;
        }
        return hamburgerprice;
    }
}

