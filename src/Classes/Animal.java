package Classes;

public class Animal {
    private String especie;
    private Ambiente ambiente;

    public Animal(String especie, Ambiente ambiente) {
        this.especie = especie;
        this.ambiente = ambiente;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Ambiente getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public String trocarAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
        return "Ambiente trocado!";
    }

    @Override
    public String toString() {
        return "Animal: " + especie;
    }
}
