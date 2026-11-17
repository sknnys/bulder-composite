package br.ufes.computador.builder;

import br.ufes.computador.model.Peca;
import br.ufes.computador.model.Todo;

public class ComputadorBuilder {

    private final Todo computador;
    private Todo gabinete;
    private Todo placaMae;

    public ComputadorBuilder(String descricao, double precoBase) {
        this.computador = new Todo(precoBase, descricao);
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

    public ComputadorBuilder comProcessador(String descricao, double preco) {
        return adicionarNaPlacaMae(descricao, preco);
    }

    public ComputadorBuilder comMemoriaRam(String descricao, double preco) {
        return adicionarNaPlacaMae(descricao, preco);
    }

    public ComputadorBuilder comSsd(String descricao, double preco) {
        return adicionarNaPlacaMae(descricao, preco);
    }

    public ComputadorBuilder comPlacaDeVideo(String descricao, double preco) {
        return adicionarNaPlacaMae(descricao, preco);
    }

    public ComputadorBuilder comFonte(String descricao, double preco) {
        exigirGabinete();
        gabinete.adicionar(new Peca(preco, descricao));
        return this;
    }

    public ComputadorBuilder comCooler(String descricao, double preco) {
        exigirGabinete();
        gabinete.adicionar(new Peca(preco, descricao));
        return this;
    }

    public ComputadorBuilder comPeriferico(String descricao, double preco) {
        computador.adicionar(new Peca(preco, descricao));
        return this;
    }

    public Todo build() {
        exigirGabinete();
        exigirPlacaMae();
        return computador;
    }

    private ComputadorBuilder adicionarNaPlacaMae(String descricao, double preco) {
        exigirPlacaMae();
        placaMae.adicionar(new Peca(preco, descricao));
        return this;
    }

    private void exigirGabinete() {
        if (gabinete == null) {
            throw new IllegalStateException("Adicione o gabinete antes desta peca.");
        }
    }

    private void exigirPlacaMae() {
        if (placaMae == null) {
            throw new IllegalStateException("Adicione a placa-mae antes desta peca.");
        }
    }
}
