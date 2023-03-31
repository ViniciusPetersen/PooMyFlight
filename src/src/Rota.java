package src;

public class Rota{
    private CiaAerea ciaaerea;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;


    public Rota(CiaAerea umaCiaaerea, Aeroporto umaOrigem, Aeroporto umDestino, Aeronave umaAeronave){
        this.ciaaerea = umaCiaaerea;
        this.origem = umaOrigem;
        this.destino = umDestino;
        this.aeronave = umaAeronave;
    }
    

    public CiaAerea getCiaarea(){
        return ciaaerea;
    }
    public Aeroporto getOrigem(){
        return origem;
    }
    public Aeroporto getDestino(){
        return destino;
    }
    public Aeronave getAeronave(){
        return aeronave;
    }

}