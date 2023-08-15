package section6;

public class point {
    private int x;
    private int y;

    public point() {
        this(0, 0);
    }

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
       return Math.sqrt(((x-0)*(x-0))+((y-0)*(y-0)));
    }
    public double distance(int x , int y){
        return Math.sqrt(((this.x-0)*(this.x-0))+((this.y-0)*(this.y-0)));
    }

    public double distance(point point){
        return Math.sqrt(((point.getX() -x)*(point.getX() -x))-(point.getY() -y)*(point.getY() -y));
    }
}
