package Classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nome;
    private Endereco endereco;
    private List<Animal> animais = new ArrayList<>();
    private List<Ambiente> ambientes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Zoologico(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public List<Animal> getAnimais() {
        return animais;
    }
    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
    public List<Ambiente> getAmbientes() {
        return ambientes;
    }
    public void setAmbientes(List<Ambiente> ambientes) {
        this.ambientes = ambientes;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Ambiente novoAmbiente(String nome) {
        Ambiente novoAmbiente = new Ambiente(nome, this);
        this.ambientes.add(novoAmbiente);
        return novoAmbiente;
    }

    public Funcionario novoFuncionario(Funcionario funcionario) {
        Funcionario novoFuncionario = funcionario;
        this.funcionarios.add(funcionario);
        return novoFuncionario;
    }

    public Animal novoAnimal(Animal animal) {
        Animal novoAnimal = animal;
        this.animais.add(animal);
        return novoAnimal;
    }

    @Override
    public String toString() {
        return "Zoológico " + this.nome + ".\nEndereço: " + this.endereco.toString() + "." +
                "\nFuncionários: " + this.funcionarios.toString()
                + "\nAmbientes: " + this.ambientes.toString() + "\n";
    }

}
