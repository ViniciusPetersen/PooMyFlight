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


    public Voo(LocalDateTime umaDataHora, Duration umaDuracao, Rota umaRota, Status status){//, Status umStatus
        this.datahora = umaDataHora;
        this.duracao = umaDuracao;
        this.rota = umaRota;
        this.status = status;
    }
    public Voo(Duration umaDuracao, Rota umaRota){//, Status umStatus
        this.duracao = umaDuracao;
        this.rota = umaRota;
        this.status = Status.CONFIRMADO;
        datahora = LocalDateTime.of( 2016, 8, 12, 12 ,00);
    }
    
    
    public LocalDateTime getDataHora(){
        return datahora;
    }
    public Duration getDuracao(){
        return duracao;
    }
    public Rota getRota(){
        return rota;
    }
    public Status getStatus(){
        return status;
    }
    public String toString(){
        return status + " " + datahora + "(" + duracao+"): " + rota.getDestino().getNome();
    }
}
