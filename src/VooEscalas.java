import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo
{
    private Rota rotaFinal;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(datahora, duracao,rota); // chama o construtor de Voo
        this.rotaFinal = rotaFinal;
     }

    public Rota getRotaFinal() { return rotaFinal; }
	...

    @Override
    public String toString() {
       return status + " " + datahora + "("+duracao+"): " + rota + " -> " + rotaFinal; // ERRO!
    }
}