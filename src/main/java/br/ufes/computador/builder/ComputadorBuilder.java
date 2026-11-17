package br.ufes.computador.builder;

import br.ufes.computador.model.Todo;

/**
 * Builder responsavel por montar a estrutura composta de um computador.
 */
public class ComputadorBuilder {

    private final Todo computador;
    private Todo gabinete;
    private Todo placaMae;

    public ComputadorBuilder(String descricao, double precoBase) {
        computador = new Todo(precoBase, descricao);
    }

    public ComputadorBuilder comGabinete(String descricao, double preco) {
        if (gabinete != null) {
            throw new IllegalStateException("O computador ja possui um gabinete.");
        }

        gabinete = new Todo(preco, descricao);
        computador.adicionar(gabinete);
        return this;
    }

    public ComputadorBuilder comPlacaMae(String descricao, double preco) {
        exigirGabinete();
        if (placaMae != null) {
            throw new IllegalStateException("O computador ja possui uma placa-mae.");
        }

        placaMae = new Todo(preco, descricao);
        gabinete.adicionar(placaMae);
        return this;
    }

    public Todo build() {
        exigirGabinete();
        if (placaMae == null) {
            throw new IllegalStateException("Adicione a placa-mae antes de finalizar o computador.");
        }
        return computador;
    }

    public Todo getGabinete() {
        exigirGabinete();
        return gabinete;
    }

    public Todo getPlacaMae() {
        if (placaMae == null) {
            throw new IllegalStateException("A placa-mae ainda nao foi criada.");
        }
        return placaMae;
    }

    private void exigirGabinete() {
        if (gabinete == null) {
            throw new IllegalStateException("Adicione o gabinete antes desta etapa.");
        }
    }
}
