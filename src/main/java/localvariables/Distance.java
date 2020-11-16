package localvariables;

public class Distance {
    double distanceKm;
    boolean exact;

    public Distance( double distanceKm,  boolean exact)
    {
        this.distanceKm = distanceKm;
        this.exact = exact;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public boolean isExact() {
        return exact;
    }


}





class DistanceMain {
    public static void main(String[] args) {
        Distance tavolsag = new Distance(100.50, false);
        System.out.println(tavolsag.getDistanceKm() + " " + tavolsag.isExact());
        int egeszResz = (int) tavolsag.getDistanceKm();
        System.out.println(egeszResz);
    }
}