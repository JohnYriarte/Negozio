package Main;

import java.util.ArrayList;

public class Carrello {
	
	// Attributes
	private ArrayList<Prodotto> prodottiSelezionati = new ArrayList<>();
	private double somma;
	

	// Constructors
	Carrello(){
		
	}
	
	// Methods
	
	// Metodo per aggiungere prodotto al carrello
	public void addProdotto(Prodotto nuovoProdotto) {
		for (Prodotto prodotto : prodottiSelezionati) {
			if (prodotto.getNome().equalsIgnoreCase(prodotto.getNome())) {
				System.out.println("Il prodotto e' gia nel carrello");
				return;
			}
		}
		System.out.println("Nuovo prodotto aggiunto");
		prodottiSelezionati.add(nuovoProdotto);
		aggiornaSomma(nuovoProdotto.getPrezzo());
	}
	
	// Metodo per calcolare totale costo
	private void aggiornaSomma(double prezzo) {
		somma += prezzo;
	}
	
	// Metodo per rimuovere prodotto dal carrello
	public void removeProdotto(String nome) {
		for (Prodotto prodotto : prodottiSelezionati) {
			if (prodotto.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Prodotto rimosso");
				prodottiSelezionati.remove(prodotto);
				aggiornaSomma(-prodotto.getPrezzo());
				return;
			}
		}
		System.out.println("Prodotto non trovato");
	}
	
	// Metodo per stampare i prodotto nel carrello
	public boolean stampaProdotti() {
		if (prodottiSelezionati.isEmpty()) {
			System.out.println("Il carrello e' vuoto");
			return false;
		}
		
		System.out.println("I prodotti nel carrello sono: ");
		for (Prodotto prodotto : prodottiSelezionati) {
			prodotto.stampa();
		}
		return true;
	}
	
	public double getSomma() {
		return somma;
	}
	
	
}
