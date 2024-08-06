package Classes;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private Zoologico zoologico;
    private Endereco endereco;
    private List<Animal> animaisSobCuidado = new ArrayList<>();

    public Funcionario(String nome, Zoologico zoologico, Endereco endereco) {
        this.nome = nome;
        this.zoologico = zoologico;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Zoologico getZoologico() {
        return zoologico;
    }
    public void setZoologico(Zoologico zoologico) {
        this.zoologico = zoologico;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public List<Animal> getAnimaisSobCuidado() {
        return animaisSobCuidado;
    }
    public void setAnimaisSobCuidado(List<Animal> animaisSobCuidado) {
        this.animaisSobCuidado = animaisSobCuidado;
    }

    public void cadastrarAnimal(String especie, Ambiente ambiente) {
        Animal novoAnimal = new Animal(especie, ambiente);
        this.zoologico.novoAnimal(novoAnimal);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", endereço: " + this.endereco.toString();
    }

}
