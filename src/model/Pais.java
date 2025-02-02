package model;

public class Pais {
    private int id;
    private String nome;

    // Construtor
    public Pais(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters Setters 
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
