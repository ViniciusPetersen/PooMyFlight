import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
    public enum Status{
        CONFIRMADO, ATRASADO, CANCELADO
    };

    private LocalDateTime datahora;
    private Duration duracao;
    public Rota rota;
    private Status status;


    public Voo(LocalDateTime umaDataHora, Duration umaDuracao, Rota umaRota, Status umStatus){
        this.datahora = umaDataHora;
        this.duracao = umaDuracao;
        this.rota = umaRota;
        this.status = umStatus;
        datahora = LocalDateTime.of(2019, 9, 20, 14, 00, 0);
        duracao = Duration.ofMinutes(130);
    }
    
    
    public LocalDateTime getDataHora(){
        return datahora;
    }
    public Duration getDuracao(){
        return duracao;
    }

}
