package Main;

import java.util.Scanner;

public class Main {
	// Metodo per stampare Menu di scelta
	public static void stampaMenu() {
		System.out.println("1) Stampare tutti i prodotti");
		System.out.println("2) Stampare i prodotti di una categoria");
		System.out.println("3) Aggiungere un nuovo prodotto");
		System.out.println("4) Stampare i prodotti nel carrello");
		System.out.println("5) Aggiungere un prodotto al carrello");
		System.out.println("6) Rimuovere un prodotto al carrello");
		System.out.println("7) Stampare il costo totale");
		System.out.println("9) Uscire");
	}
	
	public static void main(String[] args) {
		
		// Variables
		Negozio negozio = new Negozio();
		Carrello carrello = new Carrello();
		Scanner scanner = new Scanner(System.in);
		String nome;
		String categoria;
		Prodotto prodottoSelezionato;
		int scelta = -1;
		
		// LOOP MENU
		while (true) {
			
			// EXIT MENU
			if (scelta == 9) {
				System.out.println("Arrivederci");
				break;
			}
			
			stampaMenu();
			try {
				scelta = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Inserire un numero! ");
			}
			scanner.nextLine();
			
			switch (scelta) {
			case 1:
				negozio.stampaProdotti();
				break;
			case 2:
				System.out.println("Quale categoria? ");
				negozio.stampaProdotti(scanner.nextLine());
				break;
			case 3:
				System.out.println("Nome prodotto: ");
				nome = scanner.nextLine();
				System.out.println("Categoria prodotto: ");
				categoria = scanner.nextLine();
				Prodotto prodotto = new Prodotto(nome, categoria);
				negozio.addProdotto(prodotto);
				break;
			case 4:
				carrello.stampaProdotti();
				break;
			case 5:
				negozio.stampaProdotti();
				System.out.println("Quale prodotto vuoi aggiungere? ");
				prodottoSelezionato = negozio.getProdotto(scanner.nextLine());
				if (prodottoSelezionato != null) {
					carrello.addProdotto(prodottoSelezionato);
				} else {
					System.out.println("Prodotto invalido");
				}
				break;
			case 6:
				if (carrello.stampaProdotti()) {
					System.out.println("Quale prodotto vuoi rimuovere? ");
					carrello.removeProdotto(scanner.nextLine());
				}
				break;
			case 7:
				System.out.println("La somma e' " + carrello.getSomma());
				break;
			}
	
		}
		
		scanner.close();
	}
}
