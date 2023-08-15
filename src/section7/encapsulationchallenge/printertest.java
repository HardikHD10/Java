package section7.encapsulationchallenge;

public class printertest {
    public static void main(String[] args) {
        Printer printer = new Printer(35,65,true);
        System.out.println("toner level "+ printer.getTonerlevel());
        printer.filltoner(45);
        printer.printpages();
        System.out.println("toner level "+ printer.getTonerlevel());
    }
}
