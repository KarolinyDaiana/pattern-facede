package Classes;

import java.util.ArrayList;
import java.util.List;

public class Ambiente {
    private String nome;
    private List<Animal> animais = new ArrayList<>();
    private Zoologico zoologico;

    public Ambiente(String nome, Zoologico zoologico) {
        this.nome = nome;
        this.zoologico = zoologico;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Ambiente(Zoologico zoologico) {
        this.zoologico = zoologico;
    }
    public List<Animal> getAnimais() {
        return animais;
    }
    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
    public Zoologico getZoologico() {
        return zoologico;
    }
    public void setZoologico(Zoologico zoologico) {
        this.zoologico = zoologico;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ". Animais: " + animais;
    }
}
