package section5;

public class sumodd {
    public static boolean isodd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else
            return false;
    }

    public static int sumodd(int start, int end) {
        if (start < 0 || end < 0) {
            return -1;
        }
        boolean odd1 = isodd(start);
        boolean odd2 = isodd(end);
        int sum = 0;
        if (odd1 == true && odd2 == true) {
            for (int i = start; i <= end; i = i + 2) {
                sum += i;
            }
        } else if (odd1 == false && odd2 == true) {
            for (int i = start + 1; i <= end; i = i + 2) {
                sum += i;
            }
        } else if (odd1 == true && odd2 == false) {
            for (int i = start; i < end; i = i + 2) {
                sum += i;
            }
        } else if (odd1 == false && odd2 == false) {
            for (int i = start + 1; i < end; i = i + 2) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumodd(1,100));
        System.out.println(sumodd(-1,100));
        System.out.println(sumodd(100,100));
        System.out.println(sumodd(13,13));
        System.out.println(sumodd(100,-100));
        System.out.println(sumodd(100,1000));
    }
}


