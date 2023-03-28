import java.time.LocalDateTime;

import javax.swing.GroupLayout.Group;

public class ClasseDeControle {
    public static void main(String[] args) throws Exception {
        CiaAerea cia1 = new CiaAerea("G3","GOl");
        CiaAerea cia2 = new CiaAerea("JJ", "LATAM");
        System.out.println();
        Aeronave aviao1 = new Aeronave(733, "Boeing 737", 120);
        Aeronave aviao2 = new Aeronave(877, "Boeing 664", 150);
        System.out.println();
        Aeroporto aero1 = new Aeroporto("Poa", "Salgado Filho",null);
        Aeroporto aero2 = new Aeroporto("GRU", "Guarulhos", null);
        System.out.println();
        Geo loc1 = new Geo(-29.9939, -51.1711);
        Geo loc2 = new Geo(-23.4356, -46.4731);
        System.out.println();
        Rota rota1 = new Rota("G3","GRU","POA",733);
        System.out.println();
        //Voo voo1 = new Voo(getDataHora(), 100, "G3: POA-GRU", "CONFIRMADO");
        System.out.println();    
         
           
    }
}
