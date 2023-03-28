import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave>aeronaves;

    private GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public static GerenciadorAeronaves instance;

    public static GerenciadorAeronaves getInstance(){
        if(instance==null){
            instance=new GerenciadorAeronaves();
        }
        return instance;
    }

    public void cadastrarAeronave(){

    }
}
