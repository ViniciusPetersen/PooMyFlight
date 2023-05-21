public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo loc;
    private String codPais;
    public Aeroporto(String umCodigo, Geo loc,String umNome,  String codPais){
        this.codigo = umCodigo;
        this.nome = umNome;
        this.loc = loc;
        this.codPais = codPais;

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
    public String getCodPais() {
        return codPais;
    }



}
