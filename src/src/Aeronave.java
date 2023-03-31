package src;


public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;
    private Rota rota;
    public Aeronave(String umCodigo, String umaDescricao, int umaCapacidade){
        this.codigo = umCodigo;
        this.descricao = umaDescricao;
        this.capacidade = umaCapacidade;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getCapacidade(){
        return capacidade;
    }
}
