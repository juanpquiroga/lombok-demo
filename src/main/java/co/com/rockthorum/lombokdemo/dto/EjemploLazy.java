package co.com.rockthorum.lombokdemo.dto;

import lombok.Getter;

public class EjemploLazy {
	@Getter(lazy = true)
	private final double[] cached = expensive();

	private double[] expensive() {
		System.out.println("Procesamiento complejo");
		double[] result = new double[1000000];
		for (int i = 0; i < result.length; i++) {
			result[i] = Math.asin(i);
		}
		return result;
	}
}
