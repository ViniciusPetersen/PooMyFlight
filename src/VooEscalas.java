import java.time.Duration;
import java.time.LocalDateTime;
public class VooEscalas extends Voo{
    private Rota rotaFinal;
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(datahora, duracao, rota);
        this.rotaFinal = rotaFinal;
     }
     public Rota geRotaFinal(){
        return rotaFinal;
     }
        @Override
     public String toString() {
        return super.toString() + " -> " + rotaFinal;
     }
}
