import java.util.ArrayList;

public class GerenciadorPaises {
    private ArrayList<Pais>paises;
    public GerenciadorPaises(){
        paises= new ArrayList<>();
    }


    public static GerenciadorPaises instance;
    public static GerenciadorPaises getInstance(){
        if(instance==null){
            instance = new GerenciadorPaises();
        }
        return instance;
    }

    public void adicionar(Pais Pais){
        paises.add(Pais);
    }

    public ArrayList<Pais> ListarTodos(){
        return paises ;
    }

    
}
