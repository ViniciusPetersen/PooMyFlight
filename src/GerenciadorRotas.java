import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<GerenciadorRotas>rotas;
    private GerenciadorRotas(){
        rotas = new ArrayList<>();
    }
    private Aeronave aeronave;

    public static GerenciadorRotas instance;
    public static GerenciadorRotas getInstance(){
        if(instance==null){
            instance = new GerenciadorRotas();
        }
        return instance;
    }
}
