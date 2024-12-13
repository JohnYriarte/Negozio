package Main;

public class Prodotto {

	// Attributes
	private String nome;
	private String categoria;
	private double prezzo;

	// Constructors
	Prodotto(String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = Math.random() * 20 + 5;
	}
	
	// Methods
	
	public void stampa() {
		System.out.println(this.nome+ " - " + this.categoria);
	}
	
	// getters and setters
	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrezzo() {
		return prezzo;
	}

	

}
