import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo>viagens;
    private GerenciadorVoos(){
        viagens= new ArrayList<>();
    }

    public static GerenciadorVoos instance;
    public static GerenciadorVoos getInstance(){
        if(instance==null){
            instance = new GerenciadorVoos();
        }
        return instance;
    }
}
