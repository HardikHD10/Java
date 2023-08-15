package section7.encapsulationchallenge;

public class Printer {
    private int tonerlevel;
    private int numberofpages;
    private boolean isduplex;

    public Printer(int tonerlevel, int numberofpages, boolean isduplex) {
        if(tonerlevel>0 && tonerlevel<100) {
            this.tonerlevel = tonerlevel;
        }
        this.numberofpages = numberofpages;
        this.isduplex = isduplex;
    }

    public void filltoner(int fill){
        this.tonerlevel+= fill;
    }

    public void printpages(){
        System.out.println("pages are printing" + numberofpages);
    }

    public int getTonerlevel() {
        return tonerlevel;
    }
}
