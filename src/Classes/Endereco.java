package Classes;

public class Endereco {
    private String rua;
    private String cidade;
    private Integer numero;

    public Endereco(String rua, String cidade, Integer numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Rua " + this.rua + ", cidade " + this.cidade + ", número " + this.numero;
    }

}
