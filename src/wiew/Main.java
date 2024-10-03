package wiew;

import model.ICMS;
import model.IPI;
import model.ISS;
import model.Product;
import model.Service;

public class Main {
	
	public static void main(String[] args) {
		Product car = new Product("Pálio", 30000.0, 10.0);
		
		IPI ipiCar = new IPI("auto");
		car.addTax(ipiCar);
		
		ICMS icmsCar = new ICMS("SP", "MG");
		car.addTax(icmsCar);
		
		System.out.println("R$: " + car.finalPrice());
		
		Service cleaning = new Service("Lavagem", 150.0);
		
		ICMS icmsCleaning = new ICMS("MG", "MG");
		cleaning.addTax(icmsCleaning);
		
		ISS issCleaning = new ISS("machado");
		cleaning.addTax(issCleaning);
		cleaning.addTax(issCleaning);
		
		System.out.println("R$: " + cleaning.finalPrice());
	}
}
