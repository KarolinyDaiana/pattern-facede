import Classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ZooFacade facade = new ZooFacade();
        Endereco endereco = new Endereco("Rua Jorge Lacerda", "Jaraguá do Sul", 1234);
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Karoliny", null, endereco));

        Zoologico zoologico = facade.criarZoologico("Raio de Sol", endereco, funcionarios);
        Ambiente ambiente = facade.criarAmbiente("Lago da paz", zoologico);
        Animal animal = facade.criarAnimal("Garsa vermelha", zoologico, ambiente);

        System.out.println("Zoológico: " + zoologico);
    }
}


