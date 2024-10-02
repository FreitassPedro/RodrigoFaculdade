package model;

public class Placar {
    private Equipe equipe1;
    private Equipe equipe2;
    private int pontosEquipe1;
    private int pontosEquipe2;

	private Equipe ganhador;

    // Construtor
    public Placar(Equipe equipe1, Equipe equipe2, int placarEquipe1, int placarEquipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.pontosEquipe1 = placarEquipe1;
        this.pontosEquipe2 = placarEquipe2;

		setGanhador();
    }

    // Getters e Setters
	public Equipe getEquipe1() {
		return equipe1;
	}

	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}

	public Equipe getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}

	public int getPontosEquipe1() {
		return pontosEquipe1;
	}

	public void setPontosEquipe1(int placarEquipe1) {
		this.pontosEquipe1 = placarEquipe1;
	}

	public int getPontosEquipe2() {
		return pontosEquipe2;
	}

	public void setPontosEquipe2(int placarEquipe2) {
		this.pontosEquipe2 = placarEquipe2;
	}

	public void setGanhador() {
		if (pontosEquipe1 > pontosEquipe2) {
			ganhador = equipe1;
		} else if (pontosEquipe1 < pontosEquipe2) {
			ganhador = equipe2;
		} else {
			ganhador = null;
		}
	}

	public Equipe getGanhador() {
		return ganhador;	
	}
	
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("+--------------------");
        System.out.println("| " + equipe1.getPais() + " x " + equipe2.getPais());
        System.out.println("| Placar: " + pontosEquipe1 + " x " + pontosEquipe2);

		if (ganhador != null) System.out.println("| Ganhador: " + ganhador.getPais());
		else System.out.println("| Empate");
		
        System.out.println("+--------------------");
    }
}

