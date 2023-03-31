package src;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.swing.GroupLayout.Group;
import src.Voo;

public class ClasseDeControle {
    public static void main(String[] args) throws Exception {
        CiaAerea cia1 = new CiaAerea("G3","GOl");
        CiaAerea cia2 = new CiaAerea("JJ", "LATAM");
        GerenciadorCias gCias = new GerenciadorCias();
        gCias.adicionar(cia1);
        gCias.adicionar(cia2);
        System.out.println();

        Aeronave aviao1 = new Aeronave("733", "Boeing 737", 120);
        Aeronave aviao2 = new Aeronave("877", "Boeing 664", 150);
        GerenciadorAeronaves gAeronaves = new GerenciadorAeronaves();
        gAeronaves.adicionarAeronave(aviao1);
        gAeronaves.adicionarAeronave(aviao2);
        System.out.println();

        Geo loc1 = new Geo(-29.9939, -51.1711);
        Geo loc2 = new Geo(-23.4356, -46.4731);
        Aeroporto aero1 = new Aeroporto("Poa", "Salgado Filho",loc1);
        Aeroporto aero2 = new Aeroporto("GRU", "Guarulhos", loc2);
        GerenciadorAeroportos gAeroporto = new GerenciadorAeroportos();
        gAeroporto.adicionar(aero1);
        gAeroporto.adicionar(aero2);
        System.out.println();
        System.out.println();
        Rota rota1 = new Rota(cia1,aero2,aero1,aviao1);
        Rota rota2 = new Rota(cia2,aero1,aero2,aviao2);
        GerenciadorRotas gRotas = new GerenciadorRotas();
        gRotas.adicionar(rota1);
        gRotas.adicionar(rota2);
        LocalDateTime dataHora1 = LocalDateTime.of(2023, 04, 7, 20, 30);
        LocalDateTime dataHora2 = LocalDateTime.of(2023, 04, 14, 12, 45);
        Duration duracao1 = Duration.ofMinutes(180);
        Duration duracao2 = Duration.ofMinutes(165);
        Voo voo1 = new Voo(dataHora1, duracao1, rota1, Status.ATRASADO);
        Voo voo2 = new Voo();

        System.out.println();
        //Voo voo1 = new Voo(getDataHora(), 100, "G3: POA-GRU", "CONFIRMADO");
        System.out.println();    
         
           
    }
}
