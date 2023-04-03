
import java.time.Duration;
import java.time.LocalDateTime;





public class ClasseDeControle {
    public static void main(String[] args) throws Exception {
        CiaAerea cia1 = new CiaAerea("G3","GOl");
        CiaAerea cia2 = new CiaAerea("JJ", "LATAM");
        CiaAerea cia3 = new CiaAerea("TP", "TAP Portugal");
        CiaAerea cia4 = new CiaAerea("AD", "Azul Linhas Aéreas");
        GerenciadorCias gCias = new GerenciadorCias();
        gCias.adicionar(cia1);
        gCias.adicionar(cia2);
        gCias.adicionar(cia3);
        gCias.adicionar(cia4);
        System.out.println();

        Aeronave aviao1 = new Aeronave("733", "Boeing 737", 120);
        Aeronave aviao2 = new Aeronave("877", "Boeing 664", 150);
        Aeronave aviao3 = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave aviao4 = new Aeronave("380", "Airbus Industrie A380", 644);
        GerenciadorAeronaves gAeronaves = new GerenciadorAeronaves();
        gAeronaves.adicionarAeronave(aviao1);
        gAeronaves.adicionarAeronave(aviao2);
        gAeronaves.adicionarAeronave(aviao3);
        gAeronaves.adicionarAeronave(aviao4);
        System.out.println();

        Geo loc1 = new Geo(-29.9939, -51.1711);
        Geo loc2 = new Geo(-23.4356, -46.4731);
        Geo loc3 = new Geo(-38.7742, -9.1342);
        Geo loc4 = new Geo(25.7933, -80.2906);
        Aeroporto aero1 = new Aeroporto("Poa", "Salgado Filho",loc1);
        Aeroporto aero2 = new Aeroporto("GRU", "Guarulhos", loc2);
        Aeroporto aero3 = new Aeroporto("LIS", "Lisbon", loc3);
        Aeroporto aero4 = new Aeroporto("MIA", "Miami International Apt", loc4);
        GerenciadorAeroportos gAeroporto = new GerenciadorAeroportos();
        gAeroporto.adicionarAeroporto(aero1);
        gAeroporto.adicionarAeroporto(aero2);
        gAeroporto.adicionarAeroporto(aero3);
        gAeroporto.adicionarAeroporto(aero4);
        System.out.println();
        System.out.println();
        Rota rota1 = new Rota(cia1,aero2,aero1,aviao1);
        Rota rota2 = new Rota(cia2,aero1,aero2,aviao2);
        Rota rota3 = new Rota(cia3,aero3,aero4,aviao3);
        Rota rota4 = new Rota(cia4,aero4,aero3,aviao4);
        GerenciadorRotas gRotas = new GerenciadorRotas();
        gRotas.adicionar(rota1);
        gRotas.adicionar(rota2);
        gRotas.adicionar(rota3);
        gRotas.adicionar(rota4);
        LocalDateTime dataHora1 = LocalDateTime.of(2023, 04, 7, 20, 30);
        LocalDateTime dataHora2 = LocalDateTime.of(2023, 04, 14, 12, 45);
        Duration duracao1 = Duration.ofMinutes(180);
        Duration duracao2 = Duration.ofMinutes(165);
        Voo voo1 = new Voo(dataHora1, duracao1, rota1, Voo.Status.CONFIRMADO);
        Voo voo2 = new Voo(dataHora2, duracao2, rota2, Voo.Status.ATRASADO);
        Voo voo3 = new Voo(dataHora1, duracao1, rota1, Voo.Status.CONFIRMADO);
        Voo voo4 = new Voo(dataHora2, duracao2, rota2, Voo.Status.CANCELADO);
        GerenciadorVoos gVoos = new GerenciadorVoos();
        gVoos.adicionar(voo1);
        gVoos.adicionar(voo2);
        gVoos.adicionar(voo3);
        gVoos.adicionar(voo4);
        System.out.println(voo1.toString());
        System.out.println(GerenciadorAeroportos.Distancia(loc1,loc2));
        System.out.println(GerenciadorAeroportos.Distancia(loc3,loc4));
        System.out.println("Total de empresas: "+CiaAerea.getTotalCias());
        VooEscalas vooE1 = new VooEscalas(rota1, rota2, dataHora2, duracao2, Voo.Status.CONFIRMADO);
        System.out.println(vooE1.toString());
        VooVariasEscalas vooVE1 = new VooVariasEscalas(rota1, dataHora2, duracao2, Voo.Status.CONFIRMADO);
        vooVE1.adicionarEscala(rota3);
        vooVE1.adicionarEscala(rota2);
        System.out.println(vooVE1.toString());





        System.out.println();
        //Voo voo1 = new Voo(getDataHora(), 100, "G3: POA-GRU", "CONFIRMADO");
        System.out.println();    
         
           
    }
}
