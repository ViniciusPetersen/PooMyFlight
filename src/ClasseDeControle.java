
import java.time.Duration;
import java.time.LocalDateTime;

import javax.swing.GroupLayout.Group;



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
        gAeroporto.adicionarAeroporto(aero1);
        gAeroporto.adicionarAeroporto(aero2);
        System.out.println();
        System.out.println();
        Rota rota1 = new Rota(cia1,aero2,aero1,aviao1);
        Rota rota2 = new Rota(cia2,aero1,aero2,aviao2);
        Rota rota3 = new Rota(cia2,aero2,aero1,aviao2);
        Rota rota4 = new Rota(cia1,aero2,aero1,aviao2);
        GerenciadorRotas gRotas = new GerenciadorRotas();
        gRotas.adicionar(rota1);
        gRotas.adicionar(rota2);
        gRotas.adicionar(rota3);
        gRotas.adicionar(rota4);
        LocalDateTime dataHora1 = LocalDateTime.of(2023, 04, 7, 20, 30);
        LocalDateTime dataHora2 = LocalDateTime.of(2023, 04, 14, 12, 45);
        Duration duracao1 = Duration.ofMinutes(180);
        Duration duracao2 = Duration.ofMinutes(165);
        Voo voo1 = new Voo(dataHora1, duracao1, rota1);
        Voo voo2 = new Voo(dataHora2, duracao2, rota2);
        GerenciadorVoos gVoos = new GerenciadorVoos();
        gVoos.adicionar(voo1);
        gVoos.adicionar(voo2);
        System.out.println(voo1.toString());
        System.out.println(GerenciadorAeroportos.Distancia(loc1,loc2));
        System.out.println("Total de empresas: "+CiaAerea.getTotalCias());
        VooEscalas vooE1 = new VooEscalas(rota1, rota2, dataHora2, duracao2);
        System.out.println(vooE1.toString());
        VooVariasEscalas vooVE1 = new VooVariasEscalas(rota1, dataHora2, duracao2);
        vooVE1.adicionarEscala(rota3);
        vooVE1.adicionarEscala(rota2);
        System.out.println(vooVE1.toString());





        System.out.println();
        //Voo voo1 = new Voo(getDataHora(), 100, "G3: POA-GRU", "CONFIRMADO");
        System.out.println();    
         
           
    }
}
