package model;

import java.util.HashMap;
import java.util.Map;

public class DataBaseMock {
	
	private static Map<String, Double> ipis = new HashMap<>();
	private static Double DEFAULT_IPI = 0.15;
	
	private static Map<String, Double> icmss = new HashMap<>();
	private static Double DEFAULT_ICMS = 0.1;
	
	private static Map<String, Double> isss = new HashMap<>();
	private static Double DEFAULT_ISS = 0.5;

	static {
		ipis.put("auto", 0.10);
		ipis.put("food", 0.05);
		ipis.put("drink", 0.20);
		
		icmss.put("SPMG", 0.03);
		icmss.put("RJMG", 0.05);
		icmss.put("ESMG", 0.08);
		
		isss.put("machado", 0.05);
		isss.put("alfenas", 0.10);
		isss.put("cg", 0.08);
	}
	
	public static Double selectIPI(String productType) {
		Double ipi = ipis.get(productType);
		
		if (ipi == null)
			ipi = DEFAULT_IPI;
		
		return ipi;
	}
	
	public static Double selectICMS(String fromTo) {
		Double icms = icmss.get(fromTo);
		
		if (icms == null)
			icms = DEFAULT_ICMS;
		
		return icms;
	}
	
	public static Double selectISS(String municipality) {
		Double iss = isss.get(municipality);
		
		if (iss == null)
			iss = DEFAULT_ISS;
		
		return iss;
	}
}
