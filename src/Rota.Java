public class Rota{
    private CiaAerea ciaaerea;
    private Origem origem;
    private Destino destino;
    private Aeronave aeronave;
    

    public Rota(CiaAerea umaCiaaerea, Origem umaOrigem, Destino umDestino; Aeronave umaAeronave){
        this.CiaAerea = umaCiaaerea;
        this.origem = umaOrigem;
        this.destino = umDestino;
        this.aeronave = umaAeronave;
        
    }
    

    public CiaAerea getCiaarea(){
        return ciaaerea;
    }
    public Origem getOrigem(){
        return origem;
    }
    public Destino getDestino(){
        return destino;
    }
    public Aeronave getAeronave(){
        return aeronave;
    }
    
}