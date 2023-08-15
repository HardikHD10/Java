package section4;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = kiloBytes/1024;
        int remainingkb = kiloBytes - (megabytes*1024);
        System.out.println(kiloBytes +"KB= "+megabytes+"MB "+"and "+remainingkb+"KB");
    }
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
    }
}
