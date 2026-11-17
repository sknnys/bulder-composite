package br.ufes.computador;

import br.ufes.computador.builder.ComputadorBuilder;
import br.ufes.computador.model.Todo;

public class Principal {

    public static void main(String[] args) {
        Todo pcEscritorio = new ComputadorBuilder("PC Escritorio", 120.00)
                .comGabinete("Gabinete Micro-ATX Slim", 220.00)
                .comPlacaMae("Placa-mae B660M", 620.00)
                .comProcessador("Processador Intel Core i3-12100", 690.00)
                .comMemoriaRam("Memoria RAM 16GB DDR4", 260.00)
                .comSsd("SSD NVMe 500GB", 240.00)
                .comFonte("Fonte 400W", 230.00)
                .comCooler("Cooler Box", 65.00)
                .comPeriferico("Monitor IPS 23,8 Full HD", 720.00)
                .comPeriferico("Teclado USB ABNT2", 85.00)
                .comPeriferico("Mouse Optico USB", 55.00)
                .build();

        Todo pcGamer = new ComputadorBuilder("PC Gamer", 250.00)
                .comGabinete("Gabinete Gamer Mid Tower", 450.00)
                .comPlacaMae("Placa-mae Z790 ATX DDR5", 1680.00)
                .comProcessador("Processador Intel Core i7-14700K", 2490.00)
                .comMemoriaRam("Memoria RAM 32GB DDR5", 890.00)
                .comSsd("SSD NVMe 2TB", 950.00)
                .comPlacaDeVideo("Placa de Video GeForce RTX 4070 Super", 4290.00)
                .comFonte("Fonte Modular 850W", 720.00)
                .comCooler("Water Cooler 240mm", 460.00)
                .comPeriferico("Monitor Gamer 27 165Hz", 1750.00)
                .comPeriferico("Teclado Mecanico RGB", 380.00)
                .comPeriferico("Mouse Gamer 26000 DPI", 290.00)
                .build();

        Todo pcServidor = new ComputadorBuilder("PC Servidor Web", 350.00)
                .comGabinete("Gabinete Rack 4U", 1150.00)
                .comPlacaMae("Placa-mae Servidor C621", 2400.00)
                .comProcessador("Processador Intel Xeon Silver 4310", 3600.00)
                .comMemoriaRam("Memoria RAM 64GB DDR4 ECC", 1980.00)
                .comSsd("SSD Enterprise 1.92TB Unidade 1", 1420.00)
                .comSsd("SSD Enterprise 1.92TB Unidade 2", 1420.00)
                .comPlacaDeVideo("Placa de Rede Dual Port 10GbE", 890.00)
                .comFonte("Fonte Redundante 750W", 1450.00)
                .comCooler("Cooler Servidor Alto Fluxo", 320.00)
                .comPeriferico("Monitor LED 19,5", 460.00)
                .comPeriferico("Teclado Compacto USB", 70.00)
                .comPeriferico("Mouse Optico Basico USB", 40.00)
                .build();

        imprimirConfiguracao(pcEscritorio);
        imprimirConfiguracao(pcGamer);
        imprimirConfiguracao(pcServidor);
    }

    private static void imprimirConfiguracao(Todo computador) {
        System.out.println("Descricao: " + computador.getDescricao());
        System.out.printf("Preco total: %.2f%n%n", computador.getPreco());
    }
}
