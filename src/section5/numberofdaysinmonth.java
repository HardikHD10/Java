package section5;

public class numberofdaysinmonth {
    public static boolean isleapyear(int year) {
        if (year % 4 == 0) {
            if (year % 400 != 0 && (year % 100 == 0)) {
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }
    public static int daysofmonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        boolean leapyear = isleapyear(year);
            if (leapyear = true) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        return 31;
                    }
                    case 2: {
                        return 29;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        return 30;
                    }
                    default:
                        return 0;
                }
            }
            else if (leapyear = false) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return 28;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default:
                        return 0;
                }
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(daysofmonth(7,2000));
    }
}