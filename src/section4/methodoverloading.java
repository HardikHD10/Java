package section4;

public class methodoverloading {
//    public static void main(String[] args) {
//      calculatescore(5);
//      calculatescore("Bruce ",100);
//    }
//    public static int calculatescore(String playername,int score){
//        System.out.println("player "+playername+"scored "+score+" point.");
//        return score*1000;
//    }
//    public static int calculatescore(int score) {
//        System.out.println("Unnamed player "  + "scored " + score + " point.");
//        return score * 1000;
//    }
//    public static int calculatescore() {
//        System.out.println("No player "  + "scored "  + " point.");
//        return 0;
//    }
    public static double calcfeetandinchestocentimenters(double feet, double inches){
    if((feet<0)||((inches<0)&&(inches>12))){
        return -1;
    }
    double centimeter =(feet*12)*2.54;
    centimeter += inches*2.54;
    System.out.println(feet+" feet "+inches+" inches = " +centimeter+" centimeter!");
    return centimeter;
    }
    public static double calcfeetandinchestocentimenters(double inches){
        double cm;
        if (inches>=0){
            cm =  inches * 2.54;
            return cm;
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        calcfeetandinchestocentimenters(1,6);
        System.out.println((calcfeetandinchestocentimenters(6)) + " centimeters!");
    }
}

