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
}
