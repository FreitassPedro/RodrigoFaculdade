package model;

public enum Medalha {
    
    OURO("Ouro"),
    PRATA("Prata"),
    BRONZE("Bronze");
        
    // Atributos
    private String medalha;

    // Construtor
    private Medalha(String medalha) {
        this.medalha = medalha;
    }

    // Getters e Setters
    public String getMedalha() {
        return medalha;
    }

    public void setMedalha(String medalha) {
        this.medalha = medalha;
    }


}
