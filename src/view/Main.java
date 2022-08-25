package view;

import model.FinalPrice;
import model.ICMS;
import model.ICMSAliquot;
import model.IPI;
import model.ISS;
import model.ISSAliquot;
import model.Tax;

public class Main {
	public static void main(String[] args) {
		// Estratégia inicial como IPI
		Tax strategy = new IPI();
		
		FinalPrice fp = new FinalPrice();
		
		fp.setStrategy(strategy);
		double finalPrice = fp.calculateFinalPrice(10000, 0.1);
		System.out.printf("Preço final com IPI: R$%.2f\n", finalPrice);
		
		// Estratégia alterada para ISS
		strategy = new ISS(ISSAliquot.MACHADO);
		fp.setStrategy(strategy);
		finalPrice = fp.calculateFinalPrice(1000, 0.3);
		System.out.printf("Preço final do serviço com ISS: R$%.2f\n", finalPrice);
		
		// Estratégia alterada para ICMS
		strategy = new ICMS(ICMSAliquot.SPMG);
		fp.setStrategy(strategy);
		finalPrice = fp.calculateFinalPrice(5000, 0.25);
		System.out.printf("Preço final da venda com ICMS: R$%.2f", finalPrice);
	}
}
