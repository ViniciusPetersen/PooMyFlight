public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo loc;
    private Rota rota;
    public Aeroporto(String umCodigo, String umNome, Geo loc){
        this.codigo = umCodigo;
        this.nome = umNome;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public Geo getLoc(){
        return loc;
    }

}
