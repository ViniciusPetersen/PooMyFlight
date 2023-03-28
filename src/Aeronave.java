public class Aeronave {
    private int codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(int umCodigo, String umaDescricao, int umaCapacidade){
        this.codigo = umCodigo;
        this.descricao = umaDescricao;
        this.capacidade = umaCapacidade;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getCapacidade(){
        return capacidade;
    }
}
