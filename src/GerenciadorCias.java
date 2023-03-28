import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea>empresas;
    private GerenciadorCias(){
        empresas = new ArrayList<>();
    }

    public static GerenciadorCias instance;
    public static GerenciadorCias getInstance(){
        if(instance==null){
            instance = new GerenciadorCias();
        }
        return instance;
    }
}
