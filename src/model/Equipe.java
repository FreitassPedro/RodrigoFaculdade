package model;

import java.util.List;

public class Equipe {
    private int id;
    private Pais pais;
    private List<Atleta> atletas; // Lista de atletas da equipe
    private Modalidade modalidade;
    private Medalha medalha;

    // Construtor
    public Equipe(int id, Pais pais, List<Atleta> atletas, Modalidade modalidade) {
        this.id = id;
        this.pais = pais;
        this.atletas = atletas;
        this.modalidade = modalidade;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    // Método para adicionar um atleta à equipe
    public void adicionarAtleta(Atleta atleta) {
        this.atletas.add(atleta);
    }

    // Método para remover um atleta da equipe
    public void removerAtleta(Atleta atleta) {
        this.atletas.remove(atleta);
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Medalha getMedalha() {
        return medalha;
    }

    public void setMedalha(Medalha medalha) {
        this.medalha = medalha;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
	    System.out.println("+------------------");
	    System.out.println("| id: " + id);
	    System.out.println("| país: " + pais);
	    
	
	    // Exibir informações dos atletas da equipe
        System.out.println("| Atletas:");
        atletas.forEach(atleta -> System.out.println("| " + atleta));
        System.out.println("| Medalha: " + medalha);
        System.out.println("+------------------");
	    System.out.println();
    }
}
