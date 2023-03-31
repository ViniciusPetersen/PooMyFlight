
import java.time.LocalDate;
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

    public void adicionar(Voo voo){
        viagens.add(voo);
    }

    public ArrayList<Voo> ListarTodos(){
        return viagens ;
    }

    public ArrayList<Voo> procurarPorData(LocalDate data){
        ArrayList<Voo> dataEspecifica;
        dataEspecifica= new ArrayList<>();

        for (int i=0; i<viagens.size(); i++){
            Voo a = viagens.get(i);
            if(a.getDataHora().equals(data))
            dataEspecifica.add(a);
        }
        return dataEspecifica;
    }
}
