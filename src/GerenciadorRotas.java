import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota>rotas;
    private GerenciadorRotas(){
        rotas = new ArrayList<>();
    }
    private Aeronave aeronave;

    public void adicionar(Rota rota){
        rotas.add(rota);
    }


    public static GerenciadorRotas instance;
    public static GerenciadorRotas getInstance(){
        if(instance==null){
            instance = new GerenciadorRotas();
        }
        return instance;
    }
}
