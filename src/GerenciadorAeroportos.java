
import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto>aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public static GerenciadorAeroportos instance;

    public void adicionar(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public static GerenciadorAeroportos getInstance(){
        if(instance == null){
            instance = new GerenciadorAeroportos();
        }
        return instance;
    }


    public Aeroporto procurarPorCodigo(String cod){
        for (int i=0; i<aeroportos.size(); i++){
            Aeroporto a = aeroportos.get(i);
            if(a.getCodigo().equals(cod))
            return a;
        }

        return null;
    }
    public ArrayList<Aeroporto> ListarTodos(){
        return aeroportos;
    }

    public static Double Distancia(Geo o1, Geo o2){
        double r = 6371;
        double dLat = Math.toRadians(o1.getLatitude()-o2.getLatitude());
        double dLon = Math.toRadians(o1.getLongitutde()-o2.getLongitutde());
        double lat1 = Math.toRadians(o1.getLatitude());
        double lat2 =  Math.toRadians(o2.getLatitude());
        double d = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((dLat)/2), 2)+Math.pow(Math.sin((dLon)/2), 2)*Math.cos(lat1)*Math.cos(lat2)));
        return d;
    }

    public ArrayList<Double> Distancia(Geo loc){
        double r = 6371;
        double lat1 = Math.toRadians(loc.getLatitude());
        ArrayList<Double> distancias;
        distancias = new ArrayList<>();
        for (int i=0; i<aeroportos.size(); i++){
        Aeroporto a = aeroportos.get(i);
        Geo loc2 = a.getLoc();
        double lat2 =  Math.toRadians(loc2.getLatitude());
        double dLat = Math.toRadians(loc.getLatitude()-loc2.getLatitude());
        double dLon = Math.toRadians(loc.getLongitutde()-loc2.getLongitutde());
        double d = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((dLat)/2), 2)+Math.pow(Math.sin((dLon)/2), 2)*Math.cos(lat1)*Math.cos(lat2)));
        distancias.add(d);
    }
    return distancias;
    }


}
