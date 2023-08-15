package section4;

public class hasTeen{
    public static boolean hasteenage(int n1,int n2, int n3){
    if ((n1 >=13 && n1 <=19) || (n2 >=13 && n2 <=19) || (n3 >=13 && n3 <=19)){
        return true;
    }
    else
        return false;
}

    public static void main(String[] args) {
        System.out.println(hasteenage(9,99,19));
        System.out.println(hasteenage(23,15,42));
        System.out.println(hasteenage(23,45,42));
    }
}

