import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto>aeroportos;

    private GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public static GerenciadorAeroportos instance;

    public static GerenciadorAeroportos getInstance(){
        if(instance == null){
            instance = new GerenciadorAeroportos();
        }
        return instance;
    }
}
