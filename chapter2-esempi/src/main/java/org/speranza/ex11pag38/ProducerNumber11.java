package org.speranza.ex11pag38;

import java.util.Random;

import javax.enterprise.inject.Produces;

public class ProducerNumber11 {

	@Produces
	@ThirteenDigits11
	private String prefix13Digits= "13-";
	
	@Produces
	@ThirteenDigits11
	private int editorPrefix = 84356;
	
	@Produces
	@EightDigits11
	private String eightPrefix = "8-";
	
	@Produces
	@Ramdom11
	public double getNumber() {
		return Math.abs(new Random().nextInt());
	}
	
}
