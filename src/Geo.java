public class Geo{
    private double latitude;
    private double longitude;

    public Geo(double umaLatitute, double umaLongitude){
        this.latitude = umaLatitute;
        this.longitude = umaLongitude;
    }

    public double getLatitude(){
        return latitude;
    }
    public double getLongitutde(){
        return longitude;
    }
}