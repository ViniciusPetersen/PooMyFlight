import java.time.Duration;
import java.time.LocalDateTime;
public class VooEscalas extends Voo{
    private Rota rotaFinal;
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao, Status status) {
      super(datahora, duracao,rota, status);
        this.rotaFinal = rotaFinal;
     }
     public Rota geRotaFinal(){
        return rotaFinal;
     }
        @Override
     public String toString() {
        return super.toString() + " -> " + rotaFinal.getDestino().getNome();
     }
}
