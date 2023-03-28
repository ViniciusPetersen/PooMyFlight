import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;
    private GerenciadorCias(){
        empresas = new ArrayList<>();
    }

    public void adicionar(CiaAerea cia){
        empresas.add(cia);
    }

    public CiaAerea procuraPorcodigo(String cod){
        for (int i=0; i<empresas.size(); i++){
            CiaAerea a = empresas.get(i);
            if(a.getCodigo().equals(cod))
            return a;
        }
        return null;
    }

    public static GerenciadorCias instance;
    public static GerenciadorCias getInstance(){
        if(instance==null){
            instance = new GerenciadorCias();
        }
        return instance;
    }
}
