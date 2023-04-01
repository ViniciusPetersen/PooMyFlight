
public class CiaAerea {
    private String codigo;
    private String nome;
    private static int totalCias= 0;
    public CiaAerea(String umCodigo, String umNome){
        totalCias++;
        this.codigo = umCodigo;
        this.nome = umNome;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    
    public static int getTotalCias() {
        return totalCias;
    }

}
