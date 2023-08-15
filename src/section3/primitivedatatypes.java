package section3;

public class primitivedatatypes {
    public static void main(String[] args){
        int myvalue = 10000;
        int myminintvalue = Integer.MIN_VALUE;
        int mymaxintvalue = Integer.MAX_VALUE;
        System.out.println("integer minimum value = "+ myminintvalue);
        System.out.println("integer maximum value = "+ mymaxintvalue);

        byte mymaxbytevalue = Byte.MAX_VALUE;
        byte myminbytevalue = Byte.MIN_VALUE;
        System.out.println("byte minimum value = "+ myminbytevalue);
        System.out.println("byte maximum value = "+ mymaxbytevalue);

        short mymaxshortvalue = Short.MAX_VALUE;
        short myminshortvalue = Short.MIN_VALUE;
        System.out.println("short minimum value = "+ myminshortvalue);
        System.out.println("short maximum value = "+ mymaxshortvalue);

        long mylongvalue = 100L;
        long mymaxlongvalue = Long.MAX_VALUE;
        long myminlongvalue = Long.MIN_VALUE;
        System.out.println("long minimum value = "+ myminlongvalue);
        System.out.println("long maximum value = "+ mymaxlongvalue);

        float myminfloatvalue = Float.MIN_VALUE;
        float mymaxfloatvalue = Float.MAX_VALUE;
        System.out.println("float minimum value ="+ myminfloatvalue);
        System.out.println("float maximum value ="+ mymaxfloatvalue);

        double mymindoublevalue = Double.MIN_VALUE;
        double mymaxdoublevalue = Double.MAX_VALUE;
        System.out.println("Double minimum value ="+ mymindoublevalue);
        System.out.println("Double maximum value ="+ mymaxdoublevalue);

        int  myintvalue = 5 / 3;
        float myfloatvalue = 5f / 3f;
        double mydoublevalue = 5d / 3d;
        System.out.println("myintvalue = "+ myintvalue);
        System.out.println("myfloatvalue = "+ myfloatvalue);
        System.out.println("mydoublevalue = "+ mydoublevalue);

    }
}
