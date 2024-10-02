package model;

public class Atleta {
    private int id;
    private String nome;

    // Construtor
    public Atleta(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // ToString
    @Override
    public String toString() {
        return nome;
    }
}
