
import java.util.ArrayList;


public class GerenciadorAeronaves {
    private ArrayList<Aeronave>aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public static GerenciadorAeronaves instance;

    public static GerenciadorAeronaves getInstance(){
        if(instance==null){
            instance=new GerenciadorAeronaves();
        }
        return instance;
    }
    public Aeronave procurarPorCodigo(String cod){
        for (int i=0; i<aeronaves.size(); i++){
            Aeronave a = aeronaves.get(i);
            if(a.getCodigo().equals(cod))
            return a;
        }
        return null;
    }

    public void adicionarAeronave(Aeronave aviao){
        aeronaves.add(aviao);
    }
    public ArrayList<Aeronave> ListarTodos(){
        return aeronaves;
    }


}
