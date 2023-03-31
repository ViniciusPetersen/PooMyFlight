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
    }
    public Voo(Duration umaDuracao, Rota umaRota,Status umStatus){
        this.duracao = umaDuracao;
        this.rota = umaRota;
        this.status = umStatus;
        LocalDateTime DataHora3 = LocalDateTime.of( 2016, 8, 12, 12 ,00);
    }
    
    public static double Distancia(double o1, double o2){

    }
    
    public LocalDateTime getDataHora(){
        return datahora;
    }
    public Duration getDuracao(){
        return duracao;
    }

}
