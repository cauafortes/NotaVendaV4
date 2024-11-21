package view;

import model.SaleManager;
import model.Storage;

public class Main {
	public static void main(String[] args) {

		Storage storage = new Storage();
		System.out.println("Estoque inicial:");
		System.out.println(storage);

		SaleManager saleManager = new SaleManager(storage);

		saleManager.addItemToSale("at", 2);
		saleManager.addItemToSale("ff", 1);
		saleManager.addItemToSale("msa", 2);

		saleManager.setPaymentMethod("c");

		System.out.println("\nItens da venda:");
		saleManager.finalizeSale();

		System.out.println("\nEstoque atualizado:");
		System.out.println(storage);

	}
}
