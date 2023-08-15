package section5;

public class paintjob {
    public static void main(String[] args) {
        System.out.println(getbucketcount(3.4, 2.1, 1.5, 2));
        System.out.println(getbucketcount(2.75, 3.25, 2.5, 1));
    }

    public static int getbucketcount(double width, double length, double areaperbucket, int extrabucket) {
        if (width < 0 || length < 0 || areaperbucket < 0) {
            return -1;
        }
        double bucketrequired = Math.round((width * length) / areaperbucket);
        int bucketfinal = (int) bucketrequired - extrabucket;
        return bucketfinal;
    }

    public static int getbucketcount(double width, double length, double areaperbucket) {
        if (width < 0 || length < 0 || areaperbucket < 0) {
            return -1;
        }
        double bucketrequired = Math.round((width * length) / areaperbucket);
        int bucketfinal = (int) bucketrequired;
        return bucketfinal;
    }

    public static int getbucketcount(double area, double areaperbucket) {
        if (area < 0 || areaperbucket < 0) {
            return -1;
        }
        double bucketrequired = Math.round((area) / areaperbucket);
        int bucketfinal = (int) bucketrequired;
        return bucketfinal;
    }
}
