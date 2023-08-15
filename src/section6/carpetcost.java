package section6;

public class carpetcost {
    private double height;
    private double width;
    private double area;
    private double cost;
    private double costpercarpet;


    public carpetcost(){
        this(0,0);
    }

    public carpetcost(double height,double width){
        if(height <0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
        if (width < 0){
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }
    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height) {
        if (height<0)
        {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width<0){
            this.width = 0;
        }
        this.width = width;
    }

    public double getArea() {
        return height*width;
    }

    public void setCostpercarpet(double costpercarpet) {
        this.costpercarpet = costpercarpet;
    }

    public double getCostpercarpet() {
        return costpercarpet;
    }
    public double getCost() {
        return height*width*costpercarpet;
    }
}
