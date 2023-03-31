
import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;
    public GerenciadorCias(){
        empresas = new ArrayList<>();
    }

    public void adicionar(CiaAerea cia){
        empresas.add(cia);
    }

    public CiaAerea procurarPorCodigo(String cod){
        for (int i=0; i<empresas.size(); i++){
            CiaAerea a = empresas.get(i);
            if(a.getCodigo().equals(cod))
            return a;
        }
        return null;
    }
    public CiaAerea procurarPorNome(String nome){
        for (int i=0; i<empresas.size(); i++){
            CiaAerea a = empresas.get(i);
            if(a.getNome().equals(nome))
            return a;
        }

        return null;
    }
    
     public ArrayList<CiaAerea> ListarTodos(){
        
        return empresas;
    }


    public static GerenciadorCias instance;
    public static GerenciadorCias getInstance(){
        if(instance==null){
            instance = new GerenciadorCias();
        }
        return instance;
    }
}
