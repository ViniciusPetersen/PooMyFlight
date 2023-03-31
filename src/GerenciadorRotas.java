
import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota>rotas;
    public GerenciadorRotas(){
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

    public ArrayList<Rota> procurarPorOrigem(Aeroporto orig){
        ArrayList<Rota>rotasOrigem;
        rotasOrigem = new ArrayList<>();
        for (int i=0; i<rotas.size(); i++){
            if(rotas.get(i).getOrigem().equals(orig))
            rotasOrigem.add(rotas.get(i));
        }
    return rotasOrigem;
    }

    public ArrayList<Rota> ListarTodos(){
        return rotas;
    }


}
