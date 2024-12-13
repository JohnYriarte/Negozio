package Main;

import java.util.ArrayList;

public class Negozio {
	
	// Attributes
	private ArrayList<Prodotto> prodotti = new ArrayList<>();
	
	// Constructors
	Negozio() {
		
	}
	
	// Methods
	
	// Meotodo per aggiungere prodotto all'arraylist prodotti
	public void addProdotto(Prodotto nuovoProdotto) {
		for (Prodotto prodotto : prodotti) {
			if (prodotto.getNome().equalsIgnoreCase(nuovoProdotto.getNome())) {
				System.out.println("Il prodotto gia' esiste nel negozio");
				return;
			}
		}
		prodotti.add(nuovoProdotto);
		System.out.println("Prodotto aggiunto! ");
	}
	
	// Metodo per stampare tutti i prodotti
	public void stampaProdotti() {
		if (prodotti.isEmpty()) {
			System.out.println("Non ci sono prodotti");
			return;
		}
		
		System.out.println("I prodotti sono: ");
		for (Prodotto prodotto : prodotti) {
			prodotto.stampa();
		}
	}
	
	// Metodo per stamapre tutti i proddoti per categoria
	public void stampaProdotti(String categoria) {
		if (prodotti.isEmpty()) {
			System.out.println("Non ci sono prodotti");
			return;
		}
		
		System.out.println("I prodotti della categoria " + categoria + " sono: ");
		for (Prodotto prodotto : prodotti) {
			if (prodotto.getCategoria().equalsIgnoreCase(categoria)) {
				System.out.println(prodotto.getNome());
			}
		}
	}
	
	// Metodo per ritornare un prodotto
	public Prodotto getProdotto(String nome) {
		for (Prodotto prodotto : prodotti) {
			if (prodotto.getNome().equalsIgnoreCase(nome)) {
				return prodotto;
			}
		}
		return null;
	}
	
	
}

