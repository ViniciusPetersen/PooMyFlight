import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo{
    private ArrayList<Rota> escalas;

    // Construtor
    public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duracao, Status status) {
        super(datahora, duracao,rota, status);
        escalas = new ArrayList<>();
    }

    public void adicionarEscala(Rota escala){
        escalas.add(escala);
    }

    @Override
    public String toString() {
       String diversasEscalas = "";
       for (Rota proxEscala : escalas) {
        diversasEscalas = diversasEscalas + " -> " + proxEscala.getDestino().getNome();
       }

       return super.toString()  + diversasEscalas;
    }






}
