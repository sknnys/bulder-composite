package br.ufes.computador.builder;

import br.ufes.computador.model.Todo;

/**
 * Define a ordem para montar a estrutura de cada tipo de computador.
 */
public class Diretor {

    public Todo montarPcEscritorio(ComputadorBuilder builder) {
        return builder
                .comGabinete("Gabinete Micro-ATX Slim", 220.00)
                .comPlacaMae("Placa-mae B660M", 620.00)
                .build();
    }

    public Todo montarPcGamer(ComputadorBuilder builder) {
        return builder
                .comGabinete("Gabinete Gamer Mid Tower", 450.00)
                .comPlacaMae("Placa-mae Z790 ATX DDR5", 1680.00)
                .build();
    }

    public Todo montarPcServidor(ComputadorBuilder builder) {
        return builder
                .comGabinete("Gabinete Rack 4U", 1150.00)
                .comPlacaMae("Placa-mae Servidor C621", 2400.00)
                .build();
    }
}
