package org.speranza.ex14pag43;

import java.util.Random;

import javax.enterprise.inject.Produces;

@ThirteenDigits14
public class IsbnGenerator14 implements NumberGenerator14 {

	@Produces
	@ThirteenDigits14
	private String title = "titolo libro";
	
	@Produces
	@ThirteenDigits14
	private float prize = 10f;
	
	@Override
	public String generateNumber() {
		return "13-" + new Random().nextInt();
	}
	
	

}
