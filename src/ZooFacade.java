import Classes.*;

import java.util.List;

public class ZooFacade {
    public Zoologico criarZoologico(String nome, Endereco endereco, List<Funcionario> funcionarios){
        Zoologico zoologico = new Zoologico(nome, endereco);
        funcionarios.forEach(funcionario -> zoologico.novoFuncionario(funcionario));
        funcionarios.forEach(funcionario -> funcionario.setZoologico(zoologico));
        return zoologico;
    }

    public Animal criarAnimal(String especie, Zoologico zoologico, Ambiente ambiente) {
        Animal novoAnimal = new Animal(especie, ambiente);
        zoologico.novoAnimal(novoAnimal);
        ambiente.getAnimais().add(novoAnimal);
        return novoAnimal;
    }

    public Ambiente criarAmbiente(String nome, Zoologico zoologico) {
        Ambiente novoAmbiente = zoologico.novoAmbiente(nome);
        return novoAmbiente;
    }
}
