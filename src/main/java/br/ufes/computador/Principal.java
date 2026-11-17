package br.ufes.computador;

import br.ufes.computador.builder.ComputadorBuilder;
import br.ufes.computador.builder.Diretor;
import br.ufes.computador.model.Peca;
import br.ufes.computador.model.Todo;

public class Principal {

    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        ComputadorBuilder builderEscritorio = new ComputadorBuilder("PC Escritorio", 120.00);
        Todo pcEscritorio = diretor.montarPcEscritorio(builderEscritorio);
        adicionarPecasEscritorio(pcEscritorio, builderEscritorio);

        ComputadorBuilder builderGamer = new ComputadorBuilder("PC Gamer", 250.00);
        Todo pcGamer = diretor.montarPcGamer(builderGamer);
        adicionarPecasGamer(pcGamer, builderGamer);

        ComputadorBuilder builderServidor = new ComputadorBuilder("PC Servidor Web", 350.00);
        Todo pcServidor = diretor.montarPcServidor(builderServidor);
        adicionarPecasServidor(pcServidor, builderServidor);

        imprimirConfiguracao(pcEscritorio);
        imprimirConfiguracao(pcGamer);
        imprimirConfiguracao(pcServidor);
    }

    private static void adicionarPecasEscritorio(Todo computador, ComputadorBuilder builder) {
        builder.getPlacaMae().adicionar(new Peca(690.00, "Processador Intel Core i3-12100"));
        builder.getPlacaMae().adicionar(new Peca(260.00, "Memoria RAM 16GB DDR4"));
        builder.getPlacaMae().adicionar(new Peca(240.00, "SSD NVMe 500GB"));
        builder.getGabinete().adicionar(new Peca(230.00, "Fonte 400W"));
        builder.getGabinete().adicionar(new Peca(65.00, "Cooler Box"));
        computador.adicionar(new Peca(720.00, "Monitor IPS 23,8 Full HD"));
        computador.adicionar(new Peca(85.00, "Teclado USB ABNT2"));
        computador.adicionar(new Peca(55.00, "Mouse Optico USB"));
    }

    private static void adicionarPecasGamer(Todo computador, ComputadorBuilder builder) {
        builder.getPlacaMae().adicionar(new Peca(2490.00, "Processador Intel Core i7-14700K"));
        builder.getPlacaMae().adicionar(new Peca(890.00, "Memoria RAM 32GB DDR5"));
        builder.getPlacaMae().adicionar(new Peca(950.00, "SSD NVMe 2TB"));
        builder.getPlacaMae().adicionar(new Peca(4290.00, "Placa de Video GeForce RTX 4070 Super"));
        builder.getGabinete().adicionar(new Peca(720.00, "Fonte Modular 850W"));
        builder.getGabinete().adicionar(new Peca(460.00, "Water Cooler 240mm"));
        computador.adicionar(new Peca(1750.00, "Monitor Gamer 27 165Hz"));
        computador.adicionar(new Peca(380.00, "Teclado Mecanico RGB"));
        computador.adicionar(new Peca(290.00, "Mouse Gamer 26000 DPI"));
    }

    private static void adicionarPecasServidor(Todo computador, ComputadorBuilder builder) {
        builder.getPlacaMae().adicionar(new Peca(3600.00, "Processador Intel Xeon Silver 4310"));
        builder.getPlacaMae().adicionar(new Peca(1980.00, "Memoria RAM 64GB DDR4 ECC"));
        builder.getPlacaMae().adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB Unidade 1"));
        builder.getPlacaMae().adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB Unidade 2"));
        builder.getPlacaMae().adicionar(new Peca(890.00, "Placa de Rede Dual Port 10GbE"));
        builder.getGabinete().adicionar(new Peca(1450.00, "Fonte Redundante 750W"));
        builder.getGabinete().adicionar(new Peca(320.00, "Cooler Servidor Alto Fluxo"));
        computador.adicionar(new Peca(460.00, "Monitor LED 19,5"));
        computador.adicionar(new Peca(70.00, "Teclado Compacto USB"));
        computador.adicionar(new Peca(40.00, "Mouse Optico Basico USB"));
    }

    private static void imprimirConfiguracao(Todo computador) {
        System.out.println("Descricao: " + computador.getDescricao());
        System.out.printf("Preco total: %.2f%n%n", computador.getPreco());
    }
}
